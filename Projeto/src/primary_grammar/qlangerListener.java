// Generated from qlanger.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link qlangerParser}.
 */
public interface qlangerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link qlangerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(qlangerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(qlangerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link qlangerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(qlangerParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(qlangerParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link qlangerParser#questionDef}.
	 * @param ctx the parse tree
	 */
	void enterQuestionDef(qlangerParser.QuestionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#questionDef}.
	 * @param ctx the parse tree
	 */
	void exitQuestionDef(qlangerParser.QuestionDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDtype}
	 * labeled alternative in {@link qlangerParser#questionID}.
	 * @param ctx the parse tree
	 */
	void enterIDtype(qlangerParser.IDtypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDtype}
	 * labeled alternative in {@link qlangerParser#questionID}.
	 * @param ctx the parse tree
	 */
	void exitIDtype(qlangerParser.IDtypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtype}
	 * labeled alternative in {@link qlangerParser#questionID}.
	 * @param ctx the parse tree
	 */
	void enterSubtype(qlangerParser.SubtypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtype}
	 * labeled alternative in {@link qlangerParser#questionID}.
	 * @param ctx the parse tree
	 */
	void exitSubtype(qlangerParser.SubtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link qlangerParser#questionAssign}.
	 * @param ctx the parse tree
	 */
	void enterQuestionAssign(qlangerParser.QuestionAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#questionAssign}.
	 * @param ctx the parse tree
	 */
	void exitQuestionAssign(qlangerParser.QuestionAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link qlangerParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStatement(qlangerParser.ExecuteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStatement(qlangerParser.ExecuteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link qlangerParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(qlangerParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(qlangerParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link qlangerParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecl(qlangerParser.TypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecl(qlangerParser.TypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link qlangerParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(qlangerParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(qlangerParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link qlangerParser#questionType}.
	 * @param ctx the parse tree
	 */
	void enterQuestionType(qlangerParser.QuestionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#questionType}.
	 * @param ctx the parse tree
	 */
	void exitQuestionType(qlangerParser.QuestionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link qlangerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(qlangerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(qlangerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link qlangerParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(qlangerParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(qlangerParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link qlangerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(qlangerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(qlangerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link qlangerParser#hole_printlnStatement}.
	 * @param ctx the parse tree
	 */
	void enterHole_printlnStatement(qlangerParser.Hole_printlnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#hole_printlnStatement}.
	 * @param ctx the parse tree
	 */
	void exitHole_printlnStatement(qlangerParser.Hole_printlnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link qlangerParser#open_printlnStatement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_printlnStatement(qlangerParser.Open_printlnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#open_printlnStatement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_printlnStatement(qlangerParser.Open_printlnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link qlangerParser#anwser}.
	 * @param ctx the parse tree
	 */
	void enterAnwser(qlangerParser.AnwserContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#anwser}.
	 * @param ctx the parse tree
	 */
	void exitAnwser(qlangerParser.AnwserContext ctx);
	/**
	 * Enter a parse tree produced by {@link qlangerParser#usesStatement}.
	 * @param ctx the parse tree
	 */
	void enterUsesStatement(qlangerParser.UsesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlangerParser#usesStatement}.
	 * @param ctx the parse tree
	 */
	void exitUsesStatement(qlangerParser.UsesStatementContext ctx);
}