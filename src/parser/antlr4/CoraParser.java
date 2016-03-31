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
		DOT=11, TRANSITION=12, DELAY=13, MINUS=14, EQ=15, NE=16, GE=17, GT=18, 
		LE=19, LT=20, TIMEZERO=21, OBJECTREF=22, VARREF=23, NUM=24, WS=25, LINECOMMENT=26, 
		BLOCKCOMMENT=27, CHAR=28, DIGIT=29;
	public static final int
		RULE_trace = 0, RULE_firstState = 1, RULE_gotoState = 2, RULE_transition = 3, 
		RULE_state = 4, RULE_systemStates = 5, RULE_variables = 6, RULE_clocks = 7, 
		RULE_transactionGuard = 8, RULE_synchronization = 9, RULE_assignments = 10, 
		RULE_systemState = 11, RULE_variable = 12, RULE_clock = 13, RULE_clockLHS = 14, 
		RULE_relation = 15;
	public static final String[] ruleNames = {
		"trace", "firstState", "gotoState", "transition", "state", "systemStates", 
		"variables", "clocks", "transactionGuard", "synchronization", "assignments", 
		"systemState", "variable", "clock", "clockLHS", "relation"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'['", "']'", "':'", "';'", "'->'", 
		"','", "'.'", "'transition'", "'delay'", "'-'", "'='", "'!='", "'>='", 
		"'>'", "'<='", "'<'", "'t(0)'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCB", "RCB", "LB", "RB", "LSB", "RSB", "COLON", "SEMI", "ARROW", 
		"COMMA", "DOT", "TRANSITION", "DELAY", "MINUS", "EQ", "NE", "GE", "GT", 
		"LE", "LT", "TIMEZERO", "OBJECTREF", "VARREF", "NUM", "WS", "LINECOMMENT", 
		"BLOCKCOMMENT", "CHAR", "DIGIT"
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
			setState(32);
			firstState();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TRANSITION) {
				{
				{
				setState(33);
				gotoState();
				}
				}
				setState(38);
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
			setState(39);
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
			setState(41);
			transition();
			setState(42);
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
		public TerminalNode COLON() { return getToken(CoraParser.COLON, 0); }
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
		public SynchronizationContext synchronization() {
			return getRuleContext(SynchronizationContext.class,0);
		}
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public TerminalNode RCB() { return getToken(CoraParser.RCB, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(TRANSITION);
			setState(45);
			match(COLON);
			setState(46);
			systemState();
			setState(47);
			match(ARROW);
			setState(48);
			systemState();
			setState(49);
			match(LCB);
			setState(50);
			transactionGuard();
			setState(51);
			match(SEMI);
			setState(52);
			synchronization();
			setState(53);
			match(SEMI);
			setState(54);
			assignments();
			setState(55);
			match(SEMI);
			setState(56);
			match(RCB);
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
			setState(58);
			systemStates();
			setState(59);
			variables();
			setState(60);
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
			setState(63); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(62);
					systemState();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(65); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					variable();
					}
					} 
				}
				setState(72);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				clock();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TIMEZERO || _la==OBJECTREF );
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
			setState(84);
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
			setState(86);
			match(OBJECTREF);
			setState(87);
			match(EQ);
			setState(88);
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
			setState(90);
			clockLHS();
			setState(91);
			relation();
			setState(92);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ClockLHSZeroMinusObjectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(TIMEZERO);
				setState(95);
				match(MINUS);
				setState(96);
				match(OBJECTREF);
				}
				break;
			case 2:
				_localctx = new ClockLHSObjectMinusZeroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(OBJECTREF);
				setState(98);
				match(MINUS);
				setState(99);
				match(TIMEZERO);
				}
				break;
			case 3:
				_localctx = new ClockLHSObjectMinusObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(OBJECTREF);
				setState(101);
				match(MINUS);
				setState(102);
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
		public List<TerminalNode> EQ() { return getTokens(CoraParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(CoraParser.EQ, i);
		}
		public TerminalNode LT() { return getToken(CoraParser.LT, 0); }
		public TerminalNode LE() { return getToken(CoraParser.LE, 0); }
		public TerminalNode GT() { return getToken(CoraParser.GT, 0); }
		public TerminalNode GE() { return getToken(CoraParser.GE, 0); }
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
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GE) | (1L << GT) | (1L << LE) | (1L << LT))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37n\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\7\2%\n"+
		"\2\f\2\16\2(\13\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\6\7B\n\7\r\7\16\7C\3\b\7"+
		"\bG\n\b\f\b\16\bJ\13\b\3\t\6\tM\n\t\r\t\16\tN\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20j\n\20\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \2\3\4\2\21\21\23\26c\2\"\3\2\2\2\4)\3\2\2"+
		"\2\6+\3\2\2\2\b.\3\2\2\2\n<\3\2\2\2\fA\3\2\2\2\16H\3\2\2\2\20L\3\2\2\2"+
		"\22P\3\2\2\2\24R\3\2\2\2\26T\3\2\2\2\30V\3\2\2\2\32X\3\2\2\2\34\\\3\2"+
		"\2\2\36i\3\2\2\2 k\3\2\2\2\"&\5\4\3\2#%\5\6\4\2$#\3\2\2\2%(\3\2\2\2&$"+
		"\3\2\2\2&\'\3\2\2\2\'\3\3\2\2\2(&\3\2\2\2)*\5\n\6\2*\5\3\2\2\2+,\5\b\5"+
		"\2,-\5\n\6\2-\7\3\2\2\2./\7\16\2\2/\60\7\t\2\2\60\61\5\30\r\2\61\62\7"+
		"\13\2\2\62\63\5\30\r\2\63\64\7\3\2\2\64\65\5\22\n\2\65\66\7\n\2\2\66\67"+
		"\5\24\13\2\678\7\n\2\289\5\26\f\29:\7\n\2\2:;\7\4\2\2;\t\3\2\2\2<=\5\f"+
		"\7\2=>\5\16\b\2>?\5\20\t\2?\13\3\2\2\2@B\5\30\r\2A@\3\2\2\2BC\3\2\2\2"+
		"CA\3\2\2\2CD\3\2\2\2D\r\3\2\2\2EG\5\32\16\2FE\3\2\2\2GJ\3\2\2\2HF\3\2"+
		"\2\2HI\3\2\2\2I\17\3\2\2\2JH\3\2\2\2KM\5\34\17\2LK\3\2\2\2MN\3\2\2\2N"+
		"L\3\2\2\2NO\3\2\2\2O\21\3\2\2\2PQ\3\2\2\2Q\23\3\2\2\2RS\3\2\2\2S\25\3"+
		"\2\2\2TU\3\2\2\2U\27\3\2\2\2VW\7\30\2\2W\31\3\2\2\2XY\7\30\2\2YZ\7\21"+
		"\2\2Z[\7\32\2\2[\33\3\2\2\2\\]\5\36\20\2]^\5 \21\2^_\7\32\2\2_\35\3\2"+
		"\2\2`a\7\27\2\2ab\7\20\2\2bj\7\30\2\2cd\7\30\2\2de\7\20\2\2ej\7\27\2\2"+
		"fg\7\30\2\2gh\7\20\2\2hj\7\30\2\2i`\3\2\2\2ic\3\2\2\2if\3\2\2\2j\37\3"+
		"\2\2\2kl\t\2\2\2l!\3\2\2\2\7&CHNi";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}