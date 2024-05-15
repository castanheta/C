// Generated from qlanger.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class qlangerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		ID=25, STRING=26, WS=27, COMMENT=28;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_questionDef = 2, RULE_questionID = 3, 
		RULE_questionAssign = 4, RULE_executeStatement = 5, RULE_exportStatement = 6, 
		RULE_typeDecl = 7, RULE_var = 8, RULE_questionType = 9, RULE_type = 10, 
		RULE_statementBlock = 11, RULE_statement = 12, RULE_hole_printlnStatement = 13, 
		RULE_open_printlnStatement = 14, RULE_anwser = 15, RULE_usesStatement = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "questionDef", "questionID", "questionAssign", "executeStatement", 
			"exportStatement", "typeDecl", "var", "questionType", "type", "statementBlock", 
			"statement", "hole_printlnStatement", "open_printlnStatement", "anwser", 
			"usesStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'is'", "'end'", "'.'", "':='", "'new'", "'execute'", "'export'", 
			"'result'", "'to'", "':'", "'hole'", "'open'", "'code-hole'", "'code-open'", 
			"'code-output'", "'multi-choice'", "'question'", "'fraction'", "'println'", 
			"'ans->'", "'uses'", "'code'", "'from'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "STRING", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "qlanger.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public qlangerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(qlangerParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33812864L) != 0)) {
				{
				{
				setState(34);
				stmt();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public QuestionDefContext questionDef() {
			return getRuleContext(QuestionDefContext.class,0);
		}
		public QuestionAssignContext questionAssign() {
			return getRuleContext(QuestionAssignContext.class,0);
		}
		public ExecuteStatementContext executeStatement() {
			return getRuleContext(ExecuteStatementContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				questionDef();
				setState(43);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				questionAssign();
				setState(46);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				executeStatement();
				setState(49);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				exportStatement();
				setState(52);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				typeDecl();
				setState(55);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionDefContext extends ParserRuleContext {
		public QuestionTypeContext questionType() {
			return getRuleContext(QuestionTypeContext.class,0);
		}
		public QuestionIDContext questionID() {
			return getRuleContext(QuestionIDContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public QuestionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterQuestionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitQuestionDef(this);
		}
	}

	public final QuestionDefContext questionDef() throws RecognitionException {
		QuestionDefContext _localctx = new QuestionDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_questionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			questionType();
			setState(60);
			questionID(0);
			setState(61);
			match(T__1);
			setState(62);
			statementBlock();
			setState(63);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionIDContext extends ParserRuleContext {
		public QuestionIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionID; }
	 
		public QuestionIDContext() { }
		public void copyFrom(QuestionIDContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IDtypeContext extends QuestionIDContext {
		public TerminalNode ID() { return getToken(qlangerParser.ID, 0); }
		public IDtypeContext(QuestionIDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterIDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitIDtype(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtypeContext extends QuestionIDContext {
		public List<QuestionIDContext> questionID() {
			return getRuleContexts(QuestionIDContext.class);
		}
		public QuestionIDContext questionID(int i) {
			return getRuleContext(QuestionIDContext.class,i);
		}
		public SubtypeContext(QuestionIDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterSubtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitSubtype(this);
		}
	}

	public final QuestionIDContext questionID() throws RecognitionException {
		return questionID(0);
	}

	private QuestionIDContext questionID(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QuestionIDContext _localctx = new QuestionIDContext(_ctx, _parentState);
		QuestionIDContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_questionID, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IDtypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(66);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SubtypeContext(new QuestionIDContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_questionID);
					setState(68);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(69);
					match(T__3);
					setState(70);
					questionID(3);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionAssignContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public QuestionIDContext questionID() {
			return getRuleContext(QuestionIDContext.class,0);
		}
		public QuestionAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterQuestionAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitQuestionAssign(this);
		}
	}

	public final QuestionAssignContext questionAssign() throws RecognitionException {
		QuestionAssignContext _localctx = new QuestionAssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_questionAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			var();
			setState(77);
			match(T__4);
			setState(78);
			match(T__5);
			setState(79);
			questionID(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteStatementContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ExecuteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterExecuteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitExecuteStatement(this);
		}
	}

	public final ExecuteStatementContext executeStatement() throws RecognitionException {
		ExecuteStatementContext _localctx = new ExecuteStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_executeStatement);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				var();
				setState(82);
				match(T__4);
				setState(83);
				match(T__6);
				setState(84);
				var();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__6);
				setState(87);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(qlangerParser.STRING, 0); }
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitExportStatement(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__7);
			setState(91);
			match(T__8);
			setState(92);
			match(T__9);
			setState(93);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitTypeDecl(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			var();
			setState(96);
			match(T__10);
			setState(97);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(qlangerParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionTypeContext extends ParserRuleContext {
		public QuestionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterQuestionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitQuestionType(this);
		}
	}

	public final QuestionTypeContext questionType() throws RecognitionException {
		QuestionTypeContext _localctx = new QuestionTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_questionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitStatementBlock(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				statement();
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__19 || _la==T__21 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Hole_printlnStatementContext hole_printlnStatement() {
			return getRuleContext(Hole_printlnStatementContext.class,0);
		}
		public Open_printlnStatementContext open_printlnStatement() {
			return getRuleContext(Open_printlnStatementContext.class,0);
		}
		public UsesStatementContext usesStatement() {
			return getRuleContext(UsesStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				hole_printlnStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				open_printlnStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				usesStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Hole_printlnStatementContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(qlangerParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(qlangerParser.STRING, i);
		}
		public AnwserContext anwser() {
			return getRuleContext(AnwserContext.class,0);
		}
		public Hole_printlnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hole_printlnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterHole_printlnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitHole_printlnStatement(this);
		}
	}

	public final Hole_printlnStatementContext hole_printlnStatement() throws RecognitionException {
		Hole_printlnStatementContext _localctx = new Hole_printlnStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_hole_printlnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__19);
			setState(116);
			match(STRING);
			setState(117);
			match(T__20);
			setState(118);
			match(STRING);
			setState(119);
			anwser();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Open_printlnStatementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(qlangerParser.STRING, 0); }
		public Open_printlnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_printlnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterOpen_printlnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitOpen_printlnStatement(this);
		}
	}

	public final Open_printlnStatementContext open_printlnStatement() throws RecognitionException {
		Open_printlnStatementContext _localctx = new Open_printlnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_open_printlnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__19);
			setState(122);
			match(STRING);
			setState(123);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnwserContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(qlangerParser.STRING, 0); }
		public AnwserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anwser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterAnwser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitAnwser(this);
		}
	}

	public final AnwserContext anwser() throws RecognitionException {
		AnwserContext _localctx = new AnwserContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_anwser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsesStatementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(qlangerParser.STRING, 0); }
		public UsesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterUsesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitUsesStatement(this);
		}
	}

	public final UsesStatementContext usesStatement() throws RecognitionException {
		UsesStatementContext _localctx = new UsesStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_usesStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__21);
			setState(128);
			match(T__22);
			setState(129);
			match(T__23);
			setState(130);
			match(STRING);
			setState(131);
			match(T__2);
			setState(132);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return questionID_sempred((QuestionIDContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean questionID_sempred(QuestionIDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u0087\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000"+
		"\f\u0000\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001:\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003H\b\u0003\n\u0003\f\u0003K\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005Y\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0004\u000bk\b"+
		"\u000b\u000b\u000b\f\u000bl\u0001\f\u0001\f\u0001\f\u0003\fr\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0000"+
		"\u0001\u0006\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \u0000\u0002\u0001\u0000\f\u0011\u0001"+
		"\u0000\u0012\u0013\u007f\u0000%\u0001\u0000\u0000\u0000\u00029\u0001\u0000"+
		"\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000"+
		"\bL\u0001\u0000\u0000\u0000\nX\u0001\u0000\u0000\u0000\fZ\u0001\u0000"+
		"\u0000\u0000\u000e_\u0001\u0000\u0000\u0000\u0010c\u0001\u0000\u0000\u0000"+
		"\u0012e\u0001\u0000\u0000\u0000\u0014g\u0001\u0000\u0000\u0000\u0016j"+
		"\u0001\u0000\u0000\u0000\u0018q\u0001\u0000\u0000\u0000\u001as\u0001\u0000"+
		"\u0000\u0000\u001cy\u0001\u0000\u0000\u0000\u001e}\u0001\u0000\u0000\u0000"+
		" \u007f\u0001\u0000\u0000\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001\u0000"+
		"\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000"+
		"()\u0005\u0000\u0000\u0001)\u0001\u0001\u0000\u0000\u0000*+\u0003\u0004"+
		"\u0002\u0000+,\u0005\u0001\u0000\u0000,:\u0001\u0000\u0000\u0000-.\u0003"+
		"\b\u0004\u0000./\u0005\u0001\u0000\u0000/:\u0001\u0000\u0000\u000001\u0003"+
		"\n\u0005\u000012\u0005\u0001\u0000\u00002:\u0001\u0000\u0000\u000034\u0003"+
		"\f\u0006\u000045\u0005\u0001\u0000\u00005:\u0001\u0000\u0000\u000067\u0003"+
		"\u000e\u0007\u000078\u0005\u0001\u0000\u00008:\u0001\u0000\u0000\u0000"+
		"9*\u0001\u0000\u0000\u00009-\u0001\u0000\u0000\u000090\u0001\u0000\u0000"+
		"\u000093\u0001\u0000\u0000\u000096\u0001\u0000\u0000\u0000:\u0003\u0001"+
		"\u0000\u0000\u0000;<\u0003\u0012\t\u0000<=\u0003\u0006\u0003\u0000=>\u0005"+
		"\u0002\u0000\u0000>?\u0003\u0016\u000b\u0000?@\u0005\u0003\u0000\u0000"+
		"@\u0005\u0001\u0000\u0000\u0000AB\u0006\u0003\uffff\uffff\u0000BC\u0005"+
		"\u0019\u0000\u0000CI\u0001\u0000\u0000\u0000DE\n\u0002\u0000\u0000EF\u0005"+
		"\u0004\u0000\u0000FH\u0003\u0006\u0003\u0003GD\u0001\u0000\u0000\u0000"+
		"HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000J\u0007\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0003"+
		"\u0010\b\u0000MN\u0005\u0005\u0000\u0000NO\u0005\u0006\u0000\u0000OP\u0003"+
		"\u0006\u0003\u0000P\t\u0001\u0000\u0000\u0000QR\u0003\u0010\b\u0000RS"+
		"\u0005\u0005\u0000\u0000ST\u0005\u0007\u0000\u0000TU\u0003\u0010\b\u0000"+
		"UY\u0001\u0000\u0000\u0000VW\u0005\u0007\u0000\u0000WY\u0003\u0010\b\u0000"+
		"XQ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y\u000b\u0001\u0000"+
		"\u0000\u0000Z[\u0005\b\u0000\u0000[\\\u0005\t\u0000\u0000\\]\u0005\n\u0000"+
		"\u0000]^\u0005\u001a\u0000\u0000^\r\u0001\u0000\u0000\u0000_`\u0003\u0010"+
		"\b\u0000`a\u0005\u000b\u0000\u0000ab\u0003\u0014\n\u0000b\u000f\u0001"+
		"\u0000\u0000\u0000cd\u0005\u0019\u0000\u0000d\u0011\u0001\u0000\u0000"+
		"\u0000ef\u0007\u0000\u0000\u0000f\u0013\u0001\u0000\u0000\u0000gh\u0007"+
		"\u0001\u0000\u0000h\u0015\u0001\u0000\u0000\u0000ik\u0003\u0018\f\u0000"+
		"ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000m\u0017\u0001\u0000\u0000\u0000nr\u0003"+
		"\u001a\r\u0000or\u0003\u001c\u000e\u0000pr\u0003 \u0010\u0000qn\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000"+
		"r\u0019\u0001\u0000\u0000\u0000st\u0005\u0014\u0000\u0000tu\u0005\u001a"+
		"\u0000\u0000uv\u0005\u0015\u0000\u0000vw\u0005\u001a\u0000\u0000wx\u0003"+
		"\u001e\u000f\u0000x\u001b\u0001\u0000\u0000\u0000yz\u0005\u0014\u0000"+
		"\u0000z{\u0005\u001a\u0000\u0000{|\u0005\u0001\u0000\u0000|\u001d\u0001"+
		"\u0000\u0000\u0000}~\u0005\u001a\u0000\u0000~\u001f\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\u0016\u0000\u0000\u0080\u0081\u0005\u0017\u0000"+
		"\u0000\u0081\u0082\u0005\u0018\u0000\u0000\u0082\u0083\u0005\u001a\u0000"+
		"\u0000\u0083\u0084\u0005\u0003\u0000\u0000\u0084\u0085\u0005\u0001\u0000"+
		"\u0000\u0085!\u0001\u0000\u0000\u0000\u0006%9IXlq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}