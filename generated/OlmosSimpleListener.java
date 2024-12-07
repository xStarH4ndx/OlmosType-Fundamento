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
	 * Enter a parse tree produced by {@link OlmosSimpleParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(OlmosSimpleParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosSimpleParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(OlmosSimpleParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosSimpleParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(OlmosSimpleParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosSimpleParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(OlmosSimpleParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosSimpleParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(OlmosSimpleParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosSimpleParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(OlmosSimpleParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlmosSimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(OlmosSimpleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlmosSimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(OlmosSimpleParser.BlockContext ctx);
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
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link OlmosSimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(OlmosSimpleParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link OlmosSimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(OlmosSimpleParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link OlmosSimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(OlmosSimpleParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link OlmosSimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(OlmosSimpleParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermExpression}
	 * labeled alternative in {@link OlmosSimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTermExpression(OlmosSimpleParser.TermExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermExpression}
	 * labeled alternative in {@link OlmosSimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTermExpression(OlmosSimpleParser.TermExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link OlmosSimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(OlmosSimpleParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link OlmosSimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(OlmosSimpleParser.MultiplicativeExpressionContext ctx);
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