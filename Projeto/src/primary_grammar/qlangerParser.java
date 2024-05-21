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
		RULE_program = 0, RULE_stmt = 1, RULE_questionDef = 2, RULE_holeDef = 3, 
		RULE_openDef = 4, RULE_questionID = 5, RULE_questionAssign = 6, RULE_executeStatement = 7, 
		RULE_exportStatement = 8, RULE_typeDecl = 9, RULE_var = 10, RULE_questionType = 11, 
		RULE_type = 12, RULE_holeStatementBlock = 13, RULE_statementBlock = 14, 
		RULE_singleStatement = 15, RULE_multipleStatement = 16, RULE_open_printlnStatement = 17, 
		RULE_usesStatement = 18, RULE_anwser = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "questionDef", "holeDef", "openDef", "questionID", 
			"questionAssign", "executeStatement", "exportStatement", "typeDecl", 
			"var", "questionType", "type", "holeStatementBlock", "statementBlock", 
			"singleStatement", "multipleStatement", "open_printlnStatement", "usesStatement", 
			"anwser"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'hole'", "'is'", "'end'", "'.'", "':='", "'new'", "'execute'", 
			"'export'", "'result'", "'to'", "':'", "'open'", "'code-hole'", "'code-open'", 
			"'code-output'", "'multi-choice'", "'question'", "'fraction'", "'println'", 
			"' ans->'", "'uses'", "'code'", "'from'"
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33809156L) != 0)) {
				{
				{
				setState(40);
				stmt();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				questionDef();
				setState(49);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				questionAssign();
				setState(52);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				executeStatement();
				setState(55);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				exportStatement();
				setState(58);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				typeDecl();
				setState(61);
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
		public HoleDefContext holeDef() {
			return getRuleContext(HoleDefContext.class,0);
		}
		public OpenDefContext openDef() {
			return getRuleContext(OpenDefContext.class,0);
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
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				holeDef();
				}
				break;
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				openDef();
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
	public static class HoleDefContext extends ParserRuleContext {
		public QuestionIDContext questionID() {
			return getRuleContext(QuestionIDContext.class,0);
		}
		public HoleStatementBlockContext holeStatementBlock() {
			return getRuleContext(HoleStatementBlockContext.class,0);
		}
		public HoleDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_holeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterHoleDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitHoleDef(this);
		}
	}

	public final HoleDefContext holeDef() throws RecognitionException {
		HoleDefContext _localctx = new HoleDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_holeDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__1);
			setState(70);
			questionID(0);
			setState(71);
			match(T__2);
			setState(72);
			holeStatementBlock();
			setState(73);
			match(T__3);
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
	public static class OpenDefContext extends ParserRuleContext {
		public QuestionTypeContext questionType() {
			return getRuleContext(QuestionTypeContext.class,0);
		}
		public QuestionIDContext questionID() {
			return getRuleContext(QuestionIDContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public OpenDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterOpenDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitOpenDef(this);
		}
	}

	public final OpenDefContext openDef() throws RecognitionException {
		OpenDefContext _localctx = new OpenDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_openDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			questionType();
			setState(76);
			questionID(0);
			setState(77);
			match(T__2);
			setState(78);
			statementBlock();
			setState(79);
			match(T__3);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_questionID, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IDtypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(82);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SubtypeContext(new QuestionIDContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_questionID);
					setState(84);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(85);
					match(T__4);
					setState(86);
					questionID(3);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		enterRule(_localctx, 12, RULE_questionAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			var();
			setState(93);
			match(T__5);
			setState(94);
			match(T__6);
			setState(95);
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
		enterRule(_localctx, 14, RULE_executeStatement);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				var();
				setState(98);
				match(T__5);
				setState(99);
				match(T__7);
				setState(100);
				var();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(T__7);
				setState(103);
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
		enterRule(_localctx, 16, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__8);
			setState(107);
			match(T__9);
			setState(108);
			match(T__10);
			setState(109);
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
		enterRule(_localctx, 18, RULE_typeDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			var();
			setState(112);
			match(T__11);
			setState(113);
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
		enterRule(_localctx, 20, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		enterRule(_localctx, 22, RULE_questionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 253952L) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
	public static class HoleStatementBlockContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(qlangerParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(qlangerParser.STRING, i);
		}
		public AnwserContext anwser() {
			return getRuleContext(AnwserContext.class,0);
		}
		public HoleStatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_holeStatementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterHoleStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitHoleStatementBlock(this);
		}
	}

	public final HoleStatementBlockContext holeStatementBlock() throws RecognitionException {
		HoleStatementBlockContext _localctx = new HoleStatementBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_holeStatementBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__19);
			setState(122);
			match(STRING);
			setState(123);
			match(T__20);
			setState(124);
			match(STRING);
			setState(125);
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
	public static class StatementBlockContext extends ParserRuleContext {
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<MultipleStatementContext> multipleStatement() {
			return getRuleContexts(MultipleStatementContext.class);
		}
		public MultipleStatementContext multipleStatement(int i) {
			return getRuleContext(MultipleStatementContext.class,i);
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
		enterRule(_localctx, 28, RULE_statementBlock);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				singleStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(128);
					multipleStatement();
					}
					}
					setState(131); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__19 || _la==T__21 );
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
	public static class SingleStatementContext extends ParserRuleContext {
		public Open_printlnStatementContext open_printlnStatement() {
			return getRuleContext(Open_printlnStatementContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitSingleStatement(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			open_printlnStatement();
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
	public static class MultipleStatementContext extends ParserRuleContext {
		public Open_printlnStatementContext open_printlnStatement() {
			return getRuleContext(Open_printlnStatementContext.class,0);
		}
		public UsesStatementContext usesStatement() {
			return getRuleContext(UsesStatementContext.class,0);
		}
		public MultipleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).enterMultipleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlangerListener ) ((qlangerListener)listener).exitMultipleStatement(this);
		}
	}

	public final MultipleStatementContext multipleStatement() throws RecognitionException {
		MultipleStatementContext _localctx = new MultipleStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multipleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				{
				setState(137);
				open_printlnStatement();
				setState(138);
				match(T__0);
				}
				break;
			case T__21:
				{
				setState(140);
				usesStatement();
				setState(141);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 34, RULE_open_printlnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__19);
			setState(146);
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
		enterRule(_localctx, 36, RULE_usesStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__21);
			setState(149);
			match(T__22);
			setState(150);
			match(T__23);
			setState(151);
			match(STRING);
			setState(152);
			match(T__3);
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
		enterRule(_localctx, 38, RULE_anwser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
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
		"\u0004\u0001\u001c\u009d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000"+
		"\f\u0000-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001@\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002D\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005X\b\u0005\n\u0005\f\u0005[\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007i\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0004\u000e"+
		"\u0082\b\u000e\u000b\u000e\f\u000e\u0083\u0003\u000e\u0086\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0090\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0001\n\u0014\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&\u0000\u0002\u0001\u0000\r\u0011\u0001\u0000\u0012\u0013\u0093\u0000"+
		"+\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000\u0004C\u0001"+
		"\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000\bK\u0001\u0000\u0000"+
		"\u0000\nQ\u0001\u0000\u0000\u0000\f\\\u0001\u0000\u0000\u0000\u000eh\u0001"+
		"\u0000\u0000\u0000\u0010j\u0001\u0000\u0000\u0000\u0012o\u0001\u0000\u0000"+
		"\u0000\u0014s\u0001\u0000\u0000\u0000\u0016u\u0001\u0000\u0000\u0000\u0018"+
		"w\u0001\u0000\u0000\u0000\u001ay\u0001\u0000\u0000\u0000\u001c\u0085\u0001"+
		"\u0000\u0000\u0000\u001e\u0087\u0001\u0000\u0000\u0000 \u008f\u0001\u0000"+
		"\u0000\u0000\"\u0091\u0001\u0000\u0000\u0000$\u0094\u0001\u0000\u0000"+
		"\u0000&\u009a\u0001\u0000\u0000\u0000(*\u0003\u0002\u0001\u0000)(\u0001"+
		"\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000./\u0005\u0000\u0000\u0001/\u0001\u0001\u0000\u0000\u000001\u0003"+
		"\u0004\u0002\u000012\u0005\u0001\u0000\u00002@\u0001\u0000\u0000\u0000"+
		"34\u0003\f\u0006\u000045\u0005\u0001\u0000\u00005@\u0001\u0000\u0000\u0000"+
		"67\u0003\u000e\u0007\u000078\u0005\u0001\u0000\u00008@\u0001\u0000\u0000"+
		"\u00009:\u0003\u0010\b\u0000:;\u0005\u0001\u0000\u0000;@\u0001\u0000\u0000"+
		"\u0000<=\u0003\u0012\t\u0000=>\u0005\u0001\u0000\u0000>@\u0001\u0000\u0000"+
		"\u0000?0\u0001\u0000\u0000\u0000?3\u0001\u0000\u0000\u0000?6\u0001\u0000"+
		"\u0000\u0000?9\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000@\u0003"+
		"\u0001\u0000\u0000\u0000AD\u0003\u0006\u0003\u0000BD\u0003\b\u0004\u0000"+
		"CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\u0005\u0001\u0000"+
		"\u0000\u0000EF\u0005\u0002\u0000\u0000FG\u0003\n\u0005\u0000GH\u0005\u0003"+
		"\u0000\u0000HI\u0003\u001a\r\u0000IJ\u0005\u0004\u0000\u0000J\u0007\u0001"+
		"\u0000\u0000\u0000KL\u0003\u0016\u000b\u0000LM\u0003\n\u0005\u0000MN\u0005"+
		"\u0003\u0000\u0000NO\u0003\u001c\u000e\u0000OP\u0005\u0004\u0000\u0000"+
		"P\t\u0001\u0000\u0000\u0000QR\u0006\u0005\uffff\uffff\u0000RS\u0005\u0019"+
		"\u0000\u0000SY\u0001\u0000\u0000\u0000TU\n\u0002\u0000\u0000UV\u0005\u0005"+
		"\u0000\u0000VX\u0003\n\u0005\u0003WT\u0001\u0000\u0000\u0000X[\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u000b"+
		"\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0003\u0014\n\u0000"+
		"]^\u0005\u0006\u0000\u0000^_\u0005\u0007\u0000\u0000_`\u0003\n\u0005\u0000"+
		"`\r\u0001\u0000\u0000\u0000ab\u0003\u0014\n\u0000bc\u0005\u0006\u0000"+
		"\u0000cd\u0005\b\u0000\u0000de\u0003\u0014\n\u0000ei\u0001\u0000\u0000"+
		"\u0000fg\u0005\b\u0000\u0000gi\u0003\u0014\n\u0000ha\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000i\u000f\u0001\u0000\u0000\u0000jk\u0005"+
		"\t\u0000\u0000kl\u0005\n\u0000\u0000lm\u0005\u000b\u0000\u0000mn\u0005"+
		"\u001a\u0000\u0000n\u0011\u0001\u0000\u0000\u0000op\u0003\u0014\n\u0000"+
		"pq\u0005\f\u0000\u0000qr\u0003\u0018\f\u0000r\u0013\u0001\u0000\u0000"+
		"\u0000st\u0005\u0019\u0000\u0000t\u0015\u0001\u0000\u0000\u0000uv\u0007"+
		"\u0000\u0000\u0000v\u0017\u0001\u0000\u0000\u0000wx\u0007\u0001\u0000"+
		"\u0000x\u0019\u0001\u0000\u0000\u0000yz\u0005\u0014\u0000\u0000z{\u0005"+
		"\u001a\u0000\u0000{|\u0005\u0015\u0000\u0000|}\u0005\u001a\u0000\u0000"+
		"}~\u0003&\u0013\u0000~\u001b\u0001\u0000\u0000\u0000\u007f\u0086\u0003"+
		"\u001e\u000f\u0000\u0080\u0082\u0003 \u0010\u0000\u0081\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000"+
		"\u0000\u0000\u0085\u007f\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000"+
		"\u0000\u0000\u0086\u001d\u0001\u0000\u0000\u0000\u0087\u0088\u0003\"\u0011"+
		"\u0000\u0088\u001f\u0001\u0000\u0000\u0000\u0089\u008a\u0003\"\u0011\u0000"+
		"\u008a\u008b\u0005\u0001\u0000\u0000\u008b\u0090\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0003$\u0012\u0000\u008d\u008e\u0005\u0001\u0000\u0000\u008e"+
		"\u0090\u0001\u0000\u0000\u0000\u008f\u0089\u0001\u0000\u0000\u0000\u008f"+
		"\u008c\u0001\u0000\u0000\u0000\u0090!\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005\u0014\u0000\u0000\u0092\u0093\u0005\u001a\u0000\u0000\u0093#\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\u0016\u0000\u0000\u0095\u0096\u0005"+
		"\u0017\u0000\u0000\u0096\u0097\u0005\u0018\u0000\u0000\u0097\u0098\u0005"+
		"\u001a\u0000\u0000\u0098\u0099\u0005\u0004\u0000\u0000\u0099%\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005\u001a\u0000\u0000\u009b\'\u0001\u0000\u0000"+
		"\u0000\b+?CYh\u0083\u0085\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}