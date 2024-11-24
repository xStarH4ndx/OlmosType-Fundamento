public class OlmosTypesCustomVisitor extends OlmosTypesBaseVisitor<Void> {
    @Override
    public Void visitVariableDeclaration(OlmosTypesParser.VariableDeclarationContext ctx) {
        String type = ctx.type().getText();
        String id = ctx.ID().getText();
        String value = ctx.expression().getText();
        System.out.println("Variable declarada: " + type + " " + id + " = " + value);
        return null;
    }

    @Override
    public Void visitPrintStatement(OlmosTypesParser.PrintStatementContext ctx) {
        String message = ctx.STRING().getText();
        System.out.println("Salida: " + message);
        return null;
    }
}
