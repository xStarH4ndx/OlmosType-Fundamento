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

    // Condiciones
    @Override
    public Object visitCondition(OlmosSimpleParser.ConditionContext ctx) {
        Object left = visit(ctx.expression(0));
        Object right = visit(ctx.expression(1));
        String operator = ctx.comparisonOp().getText();
        return switch (operator) {
            case "==" -> left.equals(right);
            case "!=" -> !left.equals(right);
            case ">" -> (int) left > (int) right;
            case "<" -> (int) left < (int) right;
            case ">=" -> (int) left >= (int) right;
            case "<=" -> (int) left <= (int) right;
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

    // Ciclo while
    @Override
    public Object visitWhileLoop(OlmosSimpleParser.WhileLoopContext ctx) {
        while ((boolean) visit(ctx.condition())) {
            visit(ctx.block());
        }
        return null;
    }

    // Ciclo for
    @Override
    public Object visitForLoop(OlmosSimpleParser.ForLoopContext ctx) {
        visit(ctx.variableDeclaration()); // Inicialización
        while ((boolean) visit(ctx.condition())) { // Condición
            visit(ctx.block());
            visit(ctx.expression()); // Incremento
        }
        return null;
    }
}
