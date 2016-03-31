// Generated from Cora.g4 by ANTLR 4.5.2
 
	package parser.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LCB=1, RCB=2, LB=3, RB=4, LSB=5, RSB=6, COLON=7, SEMI=8, ARROW=9, COMMA=10, 
		DOT=11, STATE=12, TRANSITION=13, DELAY=14, MINUS=15, EQ=16, NE=17, GE=18, 
		GT=19, LE=20, LT=21, AND=22, OR=23, EXCL=24, QM=25, TIMEZERO=26, OBJECTREF=27, 
		VARREF=28, NUM=29, WS=30, LINECOMMENT=31, BLOCKCOMMENT=32, CHAR=33, DIGIT=34;
	public static final int
		RULE_trace = 0, RULE_firstState = 1, RULE_gotoState = 2, RULE_transition = 3, 
		RULE_state = 4, RULE_systemStates = 5, RULE_variables = 6, RULE_clocks = 7, 
		RULE_transactionGuard = 8, RULE_synchronization = 9, RULE_assignments = 10, 
		RULE_systemState = 11, RULE_variable = 12, RULE_clock = 13, RULE_clockLHS = 14, 
		RULE_relation = 15, RULE_syncExpr = 16, RULE_expr = 17;
	public static final String[] ruleNames = {
		"trace", "firstState", "gotoState", "transition", "state", "systemStates", 
		"variables", "clocks", "transactionGuard", "synchronization", "assignments", 
		"systemState", "variable", "clock", "clockLHS", "relation", "syncExpr", 
		"expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'['", "']'", "':'", "';'", "'->'", 
		"','", "'.'", "'State:'", "'Transition:'", "'Delay:'", "'-'", "'='", "'!='", 
		"'>='", "'>'", "'<='", "'<'", "'&&'", "'||'", "'!'", "'?'", "'t(0)'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCB", "RCB", "LB", "RB", "LSB", "RSB", "COLON", "SEMI", "ARROW", 
		"COMMA", "DOT", "STATE", "TRANSITION", "DELAY", "MINUS", "EQ", "NE", "GE", 
		"GT", "LE", "LT", "AND", "OR", "EXCL", "QM", "TIMEZERO", "OBJECTREF", 
		"VARREF", "NUM", "WS", "LINECOMMENT", "BLOCKCOMMENT", "CHAR", "DIGIT"
	};
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
	public String getGrammarFileName() { return "Cora.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TraceContext extends ParserRuleContext {
		public FirstStateContext firstState() {
			return getRuleContext(FirstStateContext.class,0);
		}
		public List<GotoStateContext> gotoState() {
			return getRuleContexts(GotoStateContext.class);
		}
		public GotoStateContext gotoState(int i) {
			return getRuleContext(GotoStateContext.class,i);
		}
		public TraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterTrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitTrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitTrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraceContext trace() throws RecognitionException {
		TraceContext _localctx = new TraceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_trace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			firstState();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TRANSITION) {
				{
				{
				setState(37);
				gotoState();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FirstStateContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public FirstStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterFirstState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitFirstState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitFirstState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstStateContext firstState() throws RecognitionException {
		FirstStateContext _localctx = new FirstStateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_firstState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			state();
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

	public static class GotoStateContext extends ParserRuleContext {
		public TransitionContext transition() {
			return getRuleContext(TransitionContext.class,0);
		}
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public GotoStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterGotoState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitGotoState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitGotoState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStateContext gotoState() throws RecognitionException {
		GotoStateContext _localctx = new GotoStateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_gotoState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			transition();
			setState(46);
			state();
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

	public static class TransitionContext extends ParserRuleContext {
		public TerminalNode TRANSITION() { return getToken(CoraParser.TRANSITION, 0); }
		public List<SystemStateContext> systemState() {
			return getRuleContexts(SystemStateContext.class);
		}
		public SystemStateContext systemState(int i) {
			return getRuleContext(SystemStateContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(CoraParser.ARROW, 0); }
		public TerminalNode LCB() { return getToken(CoraParser.LCB, 0); }
		public TransactionGuardContext transactionGuard() {
			return getRuleContext(TransactionGuardContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoraParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoraParser.SEMI, i);
		}
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public TerminalNode RCB() { return getToken(CoraParser.RCB, 0); }
		public SynchronizationContext synchronization() {
			return getRuleContext(SynchronizationContext.class,0);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_transition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(TRANSITION);
			setState(64);
			_la = _input.LA(1);
			if (_la==OBJECTREF) {
				{
				setState(49);
				systemState();
				setState(50);
				match(ARROW);
				setState(51);
				systemState();
				setState(52);
				match(LCB);
				setState(53);
				transactionGuard();
				setState(54);
				match(SEMI);
				setState(58);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(55);
					synchronization();
					setState(56);
					match(SEMI);
					}
					break;
				}
				setState(60);
				assignments();
				setState(61);
				match(SEMI);
				setState(62);
				match(RCB);
				}
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

	public static class StateContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(CoraParser.STATE, 0); }
		public SystemStatesContext systemStates() {
			return getRuleContext(SystemStatesContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public ClocksContext clocks() {
			return getRuleContext(ClocksContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(STATE);
			setState(67);
			systemStates();
			setState(68);
			variables();
			setState(69);
			clocks();
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

	public static class SystemStatesContext extends ParserRuleContext {
		public List<SystemStateContext> systemState() {
			return getRuleContexts(SystemStateContext.class);
		}
		public SystemStateContext systemState(int i) {
			return getRuleContext(SystemStateContext.class,i);
		}
		public SystemStatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemStates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterSystemStates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitSystemStates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitSystemStates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemStatesContext systemStates() throws RecognitionException {
		SystemStatesContext _localctx = new SystemStatesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_systemStates);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(71);
					systemState();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(74); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class VariablesContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variables);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(76);
					variable();
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ClocksContext extends ParserRuleContext {
		public List<ClockContext> clock() {
			return getRuleContexts(ClockContext.class);
		}
		public ClockContext clock(int i) {
			return getRuleContext(ClockContext.class,i);
		}
		public ClocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterClocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitClocks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitClocks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClocksContext clocks() throws RecognitionException {
		ClocksContext _localctx = new ClocksContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_clocks);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(82);
					clock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(85); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TransactionGuardContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TransactionGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterTransactionGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitTransactionGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitTransactionGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionGuardContext transactionGuard() throws RecognitionException {
		TransactionGuardContext _localctx = new TransactionGuardContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_transactionGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			expr(0);
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

	public static class SynchronizationContext extends ParserRuleContext {
		public SyncExprContext syncExpr() {
			return getRuleContext(SyncExprContext.class,0);
		}
		public SynchronizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterSynchronization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitSynchronization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitSynchronization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizationContext synchronization() throws RecognitionException {
		SynchronizationContext _localctx = new SynchronizationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_synchronization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			syncExpr(0);
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

	public static class AssignmentsContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CoraParser.NUM, 0); }
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterAssignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitAssignments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitAssignments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			switch (_input.LA(1)) {
			case SEMI:
			case OBJECTREF:
				{
				setState(91);
				variables();
				}
				break;
			case NUM:
				{
				setState(92);
				match(NUM);
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

	public static class SystemStateContext extends ParserRuleContext {
		public TerminalNode OBJECTREF() { return getToken(CoraParser.OBJECTREF, 0); }
		public SystemStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterSystemState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitSystemState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitSystemState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemStateContext systemState() throws RecognitionException {
		SystemStateContext _localctx = new SystemStateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_systemState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(OBJECTREF);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode OBJECTREF() { return getToken(CoraParser.OBJECTREF, 0); }
		public TerminalNode EQ() { return getToken(CoraParser.EQ, 0); }
		public TerminalNode NUM() { return getToken(CoraParser.NUM, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(OBJECTREF);
			setState(98);
			match(EQ);
			setState(99);
			match(NUM);
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

	public static class ClockContext extends ParserRuleContext {
		public ClockLHSContext clockLHS() {
			return getRuleContext(ClockLHSContext.class,0);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CoraParser.NUM, 0); }
		public ClockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterClock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitClock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitClock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClockContext clock() throws RecognitionException {
		ClockContext _localctx = new ClockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_clock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			clockLHS();
			setState(102);
			relation();
			setState(103);
			match(NUM);
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

	public static class ClockLHSContext extends ParserRuleContext {
		public ClockLHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clockLHS; }
	 
		public ClockLHSContext() { }
		public void copyFrom(ClockLHSContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClockLHSObjectMinusObjectContext extends ClockLHSContext {
		public List<TerminalNode> OBJECTREF() { return getTokens(CoraParser.OBJECTREF); }
		public TerminalNode OBJECTREF(int i) {
			return getToken(CoraParser.OBJECTREF, i);
		}
		public TerminalNode MINUS() { return getToken(CoraParser.MINUS, 0); }
		public ClockLHSObjectMinusObjectContext(ClockLHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterClockLHSObjectMinusObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitClockLHSObjectMinusObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitClockLHSObjectMinusObject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClockLHSZeroMinusObjectContext extends ClockLHSContext {
		public TerminalNode TIMEZERO() { return getToken(CoraParser.TIMEZERO, 0); }
		public TerminalNode MINUS() { return getToken(CoraParser.MINUS, 0); }
		public TerminalNode OBJECTREF() { return getToken(CoraParser.OBJECTREF, 0); }
		public ClockLHSZeroMinusObjectContext(ClockLHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterClockLHSZeroMinusObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitClockLHSZeroMinusObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitClockLHSZeroMinusObject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClockLHSObjectMinusZeroContext extends ClockLHSContext {
		public TerminalNode OBJECTREF() { return getToken(CoraParser.OBJECTREF, 0); }
		public TerminalNode MINUS() { return getToken(CoraParser.MINUS, 0); }
		public TerminalNode TIMEZERO() { return getToken(CoraParser.TIMEZERO, 0); }
		public ClockLHSObjectMinusZeroContext(ClockLHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterClockLHSObjectMinusZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitClockLHSObjectMinusZero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitClockLHSObjectMinusZero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClockLHSContext clockLHS() throws RecognitionException {
		ClockLHSContext _localctx = new ClockLHSContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_clockLHS);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ClockLHSZeroMinusObjectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(TIMEZERO);
				setState(106);
				match(MINUS);
				setState(107);
				match(OBJECTREF);
				}
				break;
			case 2:
				_localctx = new ClockLHSObjectMinusZeroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(OBJECTREF);
				setState(109);
				match(MINUS);
				setState(110);
				match(TIMEZERO);
				}
				break;
			case 3:
				_localctx = new ClockLHSObjectMinusObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(OBJECTREF);
				setState(112);
				match(MINUS);
				setState(113);
				match(OBJECTREF);
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

	public static class RelationContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(CoraParser.EQ, 0); }
		public TerminalNode LT() { return getToken(CoraParser.LT, 0); }
		public TerminalNode LE() { return getToken(CoraParser.LE, 0); }
		public TerminalNode GT() { return getToken(CoraParser.GT, 0); }
		public TerminalNode GE() { return getToken(CoraParser.GE, 0); }
		public TerminalNode NE() { return getToken(CoraParser.NE, 0); }
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << GE) | (1L << GT) | (1L << LE) | (1L << LT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class SyncExprContext extends ParserRuleContext {
		public TerminalNode OBJECTREF() { return getToken(CoraParser.OBJECTREF, 0); }
		public TerminalNode EXCL() { return getToken(CoraParser.EXCL, 0); }
		public TerminalNode QM() { return getToken(CoraParser.QM, 0); }
		public TerminalNode NUM() { return getToken(CoraParser.NUM, 0); }
		public List<SyncExprContext> syncExpr() {
			return getRuleContexts(SyncExprContext.class);
		}
		public SyncExprContext syncExpr(int i) {
			return getRuleContext(SyncExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(CoraParser.AND, 0); }
		public SyncExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syncExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterSyncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitSyncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitSyncExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyncExprContext syncExpr() throws RecognitionException {
		return syncExpr(0);
	}

	private SyncExprContext syncExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SyncExprContext _localctx = new SyncExprContext(_ctx, _parentState);
		SyncExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_syncExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(119);
				match(OBJECTREF);
				setState(120);
				match(EXCL);
				}
				break;
			case 2:
				{
				setState(121);
				match(OBJECTREF);
				setState(122);
				match(QM);
				}
				break;
			case 3:
				{
				setState(123);
				match(NUM);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SyncExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_syncExpr);
					setState(126);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(127);
					match(AND);
					setState(128);
					syncExpr(5);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode EXCL() { return getToken(CoraParser.EXCL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NUM() { return getToken(CoraParser.NUM, 0); }
		public TerminalNode OBJECTREF() { return getToken(CoraParser.OBJECTREF, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode AND() { return getToken(CoraParser.AND, 0); }
		public TerminalNode OR() { return getToken(CoraParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			switch (_input.LA(1)) {
			case EXCL:
				{
				setState(135);
				match(EXCL);
				setState(136);
				expr(3);
				}
				break;
			case NUM:
				{
				setState(137);
				match(NUM);
				}
				break;
			case OBJECTREF:
				{
				setState(138);
				match(OBJECTREF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(142);
						relation();
						setState(143);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(146);
						match(AND);
						setState(147);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(149);
						match(OR);
						setState(150);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return syncExpr_sempred((SyncExprContext)_localctx, predIndex);
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean syncExpr_sempred(SyncExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u009f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\6\7K\n\7\r\7\16\7L\3\b\7\bP\n\b\f\b\16\bS\13\b\3"+
		"\t\6\tV\n\t\r\t\16\tW\3\n\3\n\3\13\3\13\3\f\3\f\5\f`\n\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20u\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\177"+
		"\n\22\3\22\3\22\3\22\7\22\u0084\n\22\f\22\16\22\u0087\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u008e\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u009a\n\23\f\23\16\23\u009d\13\23\3\23\5LQW\4\"$\24\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\3\2\22\27\u009d\2&\3\2\2"+
		"\2\4-\3\2\2\2\6/\3\2\2\2\b\62\3\2\2\2\nD\3\2\2\2\fJ\3\2\2\2\16Q\3\2\2"+
		"\2\20U\3\2\2\2\22Y\3\2\2\2\24[\3\2\2\2\26_\3\2\2\2\30a\3\2\2\2\32c\3\2"+
		"\2\2\34g\3\2\2\2\36t\3\2\2\2 v\3\2\2\2\"~\3\2\2\2$\u008d\3\2\2\2&*\5\4"+
		"\3\2\')\5\6\4\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\3\3\2\2\2,*"+
		"\3\2\2\2-.\5\n\6\2.\5\3\2\2\2/\60\5\b\5\2\60\61\5\n\6\2\61\7\3\2\2\2\62"+
		"B\7\17\2\2\63\64\5\30\r\2\64\65\7\13\2\2\65\66\5\30\r\2\66\67\7\3\2\2"+
		"\678\5\22\n\28<\7\n\2\29:\5\24\13\2:;\7\n\2\2;=\3\2\2\2<9\3\2\2\2<=\3"+
		"\2\2\2=>\3\2\2\2>?\5\26\f\2?@\7\n\2\2@A\7\4\2\2AC\3\2\2\2B\63\3\2\2\2"+
		"BC\3\2\2\2C\t\3\2\2\2DE\7\16\2\2EF\5\f\7\2FG\5\16\b\2GH\5\20\t\2H\13\3"+
		"\2\2\2IK\5\30\r\2JI\3\2\2\2KL\3\2\2\2LM\3\2\2\2LJ\3\2\2\2M\r\3\2\2\2N"+
		"P\5\32\16\2ON\3\2\2\2PS\3\2\2\2QR\3\2\2\2QO\3\2\2\2R\17\3\2\2\2SQ\3\2"+
		"\2\2TV\5\34\17\2UT\3\2\2\2VW\3\2\2\2WX\3\2\2\2WU\3\2\2\2X\21\3\2\2\2Y"+
		"Z\5$\23\2Z\23\3\2\2\2[\\\5\"\22\2\\\25\3\2\2\2]`\5\16\b\2^`\7\37\2\2_"+
		"]\3\2\2\2_^\3\2\2\2`\27\3\2\2\2ab\7\35\2\2b\31\3\2\2\2cd\7\35\2\2de\7"+
		"\22\2\2ef\7\37\2\2f\33\3\2\2\2gh\5\36\20\2hi\5 \21\2ij\7\37\2\2j\35\3"+
		"\2\2\2kl\7\34\2\2lm\7\21\2\2mu\7\35\2\2no\7\35\2\2op\7\21\2\2pu\7\34\2"+
		"\2qr\7\35\2\2rs\7\21\2\2su\7\35\2\2tk\3\2\2\2tn\3\2\2\2tq\3\2\2\2u\37"+
		"\3\2\2\2vw\t\2\2\2w!\3\2\2\2xy\b\22\1\2yz\7\35\2\2z\177\7\32\2\2{|\7\35"+
		"\2\2|\177\7\33\2\2}\177\7\37\2\2~x\3\2\2\2~{\3\2\2\2~}\3\2\2\2\177\u0085"+
		"\3\2\2\2\u0080\u0081\f\6\2\2\u0081\u0082\7\30\2\2\u0082\u0084\5\"\22\7"+
		"\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086#\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\23\1\2\u0089"+
		"\u008a\7\32\2\2\u008a\u008e\5$\23\5\u008b\u008e\7\37\2\2\u008c\u008e\7"+
		"\35\2\2\u008d\u0088\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\u009b\3\2\2\2\u008f\u0090\f\b\2\2\u0090\u0091\5 \21\2\u0091\u0092\5$"+
		"\23\t\u0092\u009a\3\2\2\2\u0093\u0094\f\7\2\2\u0094\u0095\7\30\2\2\u0095"+
		"\u009a\5$\23\b\u0096\u0097\f\6\2\2\u0097\u0098\7\31\2\2\u0098\u009a\5"+
		"$\23\7\u0099\u008f\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0096\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c%\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\17*<BLQW_t~\u0085\u008d\u0099\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}