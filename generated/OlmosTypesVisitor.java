// Generated from OlmosTypes.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OlmosTypesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OlmosTypesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(OlmosTypesParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(OlmosTypesParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(OlmosTypesParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(OlmosTypesParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#listDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDeclaration(OlmosTypesParser.ListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(OlmosTypesParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(OlmosTypesParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(OlmosTypesParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(OlmosTypesParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#controlFlow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlFlow(OlmosTypesParser.ControlFlowContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(OlmosTypesParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(OlmosTypesParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(OlmosTypesParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(OlmosTypesParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(OlmosTypesParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(OlmosTypesParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#comparisonOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOp(OlmosTypesParser.ComparisonOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(OlmosTypesParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(OlmosTypesParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(OlmosTypesParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(OlmosTypesParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(OlmosTypesParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OlmosTypesParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(OlmosTypesParser.InputStatementContext ctx);
}