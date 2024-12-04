// Generated from OlmosSimple.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OlmosSimpleParser}.
 */
public interface OlmosSimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OlmosSimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OlmosSimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosSimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OlmosSimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosSimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(OlmosSimpleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosSimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(OlmosSimpleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosSimpleParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(OlmosSimpleParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosSimpleParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(OlmosSimpleParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosSimpleParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(OlmosSimpleParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosSimpleParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(OlmosSimpleParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosSimpleParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(OlmosSimpleParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosSimpleParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(OlmosSimpleParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosSimpleParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(OlmosSimpleParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosSimpleParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(OlmosSimpleParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosSimpleParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(OlmosSimpleParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosSimpleParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(OlmosSimpleParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosSimpleParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOp(OlmosSimpleParser.ComparisonOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosSimpleParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOp(OlmosSimpleParser.ComparisonOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosSimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(OlmosSimpleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosSimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(OlmosSimpleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosSimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(OlmosSimpleParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosSimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(OlmosSimpleParser.TermContext ctx);
}