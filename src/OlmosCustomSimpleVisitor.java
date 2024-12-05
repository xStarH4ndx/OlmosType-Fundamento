import java.util.HashMap;
import java.util.Map;

public class OlmosCustomSimpleVisitor extends OlmosSimpleBaseVisitor<Object> {
    private final Map<String, Object> variables = new HashMap<>();

    // Declaración de variables
    @Override
    public Object visitVariableDeclaration(OlmosSimpleParser.VariableDeclarationContext ctx) {
        String type = ctx.type().getText();
        String name = ctx.ID().getText();
        Object value = visit(ctx.expression());
        variables.put(name, value);
        System.out.println("Variable declared: " + type + " " + name + " = " + value);
        return null;
    }

    // Sentencias print
    @Override
    public Object visitPrintStatement(OlmosSimpleParser.PrintStatementContext ctx) {
        if (ctx.STRING() != null) {
            System.out.println("Output: " + ctx.STRING().getText().replace("\"", ""));
        } else if (ctx.expression() != null) {
            Object result = visit(ctx.expression());
            System.out.println("Output: " + result);
        }
        return null;
    }

    // Expresiones
    @Override
    public Object visitExpression(OlmosSimpleParser.ExpressionContext ctx) {
        if (ctx.term().size() == 1) {
            return visit(ctx.term(0));
        }
        Object left = visit(ctx.term(0));
        Object right = visit(ctx.term(1));
        String operator = ctx.getChild(1).getText();

        if ("+".equals(operator)) {
            return left.toString() + right.toString();
        }
        return performOperation(left, right, operator);
    }

    private Object performOperation(Object left, Object right, String operator) {
        if (left instanceof Integer && right instanceof Integer) {
            int leftInt = (int) left;
            int rightInt = (int) right;
            return switch (operator) {
                case "+" -> leftInt + rightInt;
                case "-" -> leftInt - rightInt;
                case "*" -> leftInt * rightInt;
                case "/" -> leftInt / rightInt;
                case "%" -> leftInt % rightInt;
                default -> throw new UnsupportedOperationException("Unsupported operator: " + operator);
            };
        } else if (left instanceof Double && right instanceof Double) {
            double leftDouble = (double) left;
            double rightDouble = (double) right;
            return switch (operator) {
                case "+" -> leftDouble + rightDouble;
                case "-" -> leftDouble - rightDouble;
                case "*" -> leftDouble * rightDouble;
                case "/" -> leftDouble / rightDouble;
                case "%" -> leftDouble % rightDouble;
                default -> throw new UnsupportedOperationException("Unsupported operator: " + operator);
            };
        }
        return null;
    }

    @Override
    public Object visitTerm(OlmosSimpleParser.TermContext ctx) {
        if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            if (variables.containsKey(varName)) {
                return variables.get(varName);
            }
        } else if (ctx.NUMBER() != null) {
            return Integer.parseInt(ctx.NUMBER().getText());
        } else if (ctx.DOUBLE() != null) {
            return Double.parseDouble(ctx.DOUBLE().getText());
        } else if (ctx.STRING() != null) {
            return ctx.STRING().getText().replace("\"", "");
        }
        return null;
    }

    @Override
    public Object visitCondition(OlmosSimpleParser.ConditionContext ctx) {
        Object left = visit(ctx.expression(0));
        Object right = visit(ctx.expression(1));
        String operator = ctx.comparisonOp().getText();

        // Compara de acuerdo al operador
        return switch (operator) {
            case "==" -> left.equals(right);
            case "!=" -> !left.equals(right);
            case ">" -> ((Integer) left) > ((Integer) right);
            case "<" -> ((Integer) left) < ((Integer) right);
            case ">=" -> ((Integer) left) >= ((Integer) right);
            case "<=" -> ((Integer) left) <= ((Integer) right);
            default -> throw new UnsupportedOperationException("Unsupported operator: " + operator);
        };
    }


    // Condicionales (pan, queso pan, queso)
    @Override
    public Object visitConditionalStatement(OlmosSimpleParser.ConditionalStatementContext ctx) {
        boolean conditionMatched = false;

        if ((boolean) visit(ctx.condition(0))) {
            conditionMatched = true;
            visit(ctx.block(0));
        }

        for (int i = 1; i < ctx.condition().size(); i++) {
            if (!conditionMatched && (boolean) visit(ctx.condition(i))) {
                conditionMatched = true;
                visit(ctx.block(i));
            }
        }

        if (!conditionMatched && ctx.block(ctx.condition().size()) != null) {
            visit(ctx.block(ctx.condition().size()));
        }

        return null;
    }

    @Override
    public Object visitWhileLoop(OlmosSimpleParser.WhileLoopContext ctx) {
        // Evaluar la condición
        Object conditionResult = visit(ctx.condition());
        // Verificar si la condición es booleana
        if (conditionResult instanceof Boolean && (Boolean) conditionResult) {
            // Ejecutar el bloque mientras la condición sea verdadera
            while ((Boolean) conditionResult) {
                visit(ctx.block()); // Ejecuta el bloque dentro del ciclo
                // Re-evaluar la condición después de cada ciclo
                conditionResult = visit(ctx.condition()); // Volver a evaluar la condición
            }
        }
        return null;
    }



    @Override
    public Object visitForLoop(OlmosSimpleParser.ForLoopContext ctx) {
        // Inicialización (declaración de la variable)
        visit(ctx.variableDeclaration());

        // Condición del ciclo (evaluada antes de cada iteración)
        while ((boolean) visit(ctx.condition())) {
            // Ejecutar el bloque dentro del ciclo
            visit(ctx.block());

            // Actualización (incremento o modificación de la variable)
            visit(ctx.expression()); // Esta debería ser la actualización, es decir, el incremento de la variable.
        }
        return null;
    }


}
