import java.util.HashMap;
import java.util.Map;

public class OlmosCustomSimpleVisitor extends OlmosSimpleBaseVisitor<Object> {
    private final Map<String, Object> variables = new HashMap<>();

    @Override
    public Object visitVariableDeclaration(OlmosSimpleParser.VariableDeclarationContext ctx) {
        String type = ctx.type().getText(); // Tipo de la variable
        String name = ctx.ID().getText();  // Nombre de la variable
        Object value = visit(ctx.expression()); // Evaluar la expresión

        // Almacenar la variable en el mapa
        variables.put(name, value);

        System.out.println("Variable declarada: " + type + " " + name + " = " + value);
        return null;
    }

    @Override
    public Object visitPrintStatement(OlmosSimpleParser.PrintStatementContext ctx) {
        // Si es una cadena literal, imprimimos la cadena
        if (ctx.STRING() != null) {
            System.out.println("Output: " + ctx.STRING().getText().replace("\"", ""));
        }
        // Si es una expresión, evaluamos y luego imprimimos
        else if (ctx.expression() != null) {
            Object result = visit(ctx.expression());
            System.out.println("Output: " + result);
        }
        return null;
    }

    @Override
    public Object visitExpression(OlmosSimpleParser.ExpressionContext ctx) {
        if (ctx.term().size() == 1) {
            return visit(ctx.term(0)); // Si solo hay un término, lo devolvemos directamente
        }

        // Evaluar operaciones binarias (como +, -, *, /, %)
        Object left = visit(ctx.term(0));
        Object right = visit(ctx.term(1));
        String operator = ctx.getChild(1).getText(); // El operador (+, -, *, /, %)

        return performOperation(left, right, operator);
    }

    private Object performOperation(Object left, Object right, String operator) {
        // Verificar los tipos y realizar la operación
        if (left instanceof Integer && right instanceof Integer) {
            int leftInt = (int) left;
            int rightInt = (int) right;

            switch (operator) {
                case "+":
                    return leftInt + rightInt;
                case "-":
                    return leftInt - rightInt;
                case "*":
                    return leftInt * rightInt;
                case "/":
                    return leftInt / rightInt;
                case "%":
                    return leftInt % rightInt;
                default:
                    throw new UnsupportedOperationException("Operador no soportado: " + operator);
            }
        } else if (left instanceof Double && right instanceof Double) {
            double leftDouble = (double) left;
            double rightDouble = (double) right;

            switch (operator) {
                case "+":
                    return leftDouble + rightDouble;
                case "-":
                    return leftDouble - rightDouble;
                case "*":
                    return leftDouble * rightDouble;
                case "/":
                    return leftDouble / rightDouble;
                case "%":
                    return leftDouble % rightDouble;
                default:
                    throw new UnsupportedOperationException("Operador no soportado: " + operator);
            }
        }
        return null;
    }

    @Override
    public Object visitTerm(OlmosSimpleParser.TermContext ctx) {
        // Si el término es una variable, lo recuperamos
        if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            if (variables.containsKey(varName)) {
                return variables.get(varName);  // Retornar el valor de la variable
            }
        }
        // Si el término es un número entero
        else if (ctx.NUMBER() != null) {
            return Integer.parseInt(ctx.NUMBER().getText()); // Número entero
        }
        // Si el término es un número decimal
        else if (ctx.DOUBLE() != null) {
            return Double.parseDouble(ctx.DOUBLE().getText()); // Número decimal
        }
        // Si el término es una cadena, lo devolvemos
        else if (ctx.STRING() != null) {
            return ctx.STRING().getText().replace("\"", ""); // Cadena
        }
        return null;
    }

    @Override
    public Object visitCondition(OlmosSimpleParser.ConditionContext ctx) {
        // Evaluar la condición (comparación entre dos expresiones)
        Object left = visit(ctx.expression(0));
        Object right = visit(ctx.expression(1));
        String operator = ctx.comparisonOp().getText();

        switch (operator) {
            case "==":
                return left.equals(right);
            case "!=":
                return !left.equals(right);
            case ">":
                return (int) left > (int) right;
            case "<":
                return (int) left < (int) right;
            case ">=":
                return (int) left >= (int) right;
            case "<=":
                return (int) left <= (int) right;
            default:
                throw new UnsupportedOperationException("Operador no soportado: " + operator);
        }
    }
}
