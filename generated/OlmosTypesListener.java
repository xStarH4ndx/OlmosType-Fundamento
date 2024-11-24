// Generated from OlmosTypes.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OlmosTypesParser}.
 */
public interface OlmosTypesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OlmosTypesParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OlmosTypesParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(OlmosTypesParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(OlmosTypesParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(OlmosTypesParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(OlmosTypesParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(OlmosTypesParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(OlmosTypesParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(OlmosTypesParser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(OlmosTypesParser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(OlmosTypesParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(OlmosTypesParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(OlmosTypesParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(OlmosTypesParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(OlmosTypesParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(OlmosTypesParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(OlmosTypesParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(OlmosTypesParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#controlFlow}.
	 * @param ctx the parse tree
	 */
	void enterControlFlow(OlmosTypesParser.ControlFlowContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#controlFlow}.
	 * @param ctx the parse tree
	 */
	void exitControlFlow(OlmosTypesParser.ControlFlowContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(OlmosTypesParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(OlmosTypesParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(OlmosTypesParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(OlmosTypesParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(OlmosTypesParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(OlmosTypesParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(OlmosTypesParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(OlmosTypesParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(OlmosTypesParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(OlmosTypesParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(OlmosTypesParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(OlmosTypesParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOp(OlmosTypesParser.ComparisonOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOp(OlmosTypesParser.ComparisonOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(OlmosTypesParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(OlmosTypesParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(OlmosTypesParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(OlmosTypesParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(OlmosTypesParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(OlmosTypesParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(OlmosTypesParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(OlmosTypesParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(OlmosTypesParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(OlmosTypesParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosTypesParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(OlmosTypesParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosTypesParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(OlmosTypesParser.InputStatementContext ctx);
}