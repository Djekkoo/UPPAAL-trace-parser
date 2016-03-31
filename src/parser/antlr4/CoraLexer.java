// Generated from Cora.g4 by ANTLR 4.5.2
 
	package parser.antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LCB=1, RCB=2, LB=3, RB=4, LSB=5, RSB=6, COLON=7, SEMI=8, ARROW=9, COMMA=10, 
		DOT=11, STATE=12, TRANSITION=13, DELAY=14, MINUS=15, EQ=16, NE=17, GE=18, 
		GT=19, LE=20, LT=21, AND=22, OR=23, EXCL=24, QM=25, TIMEZERO=26, OBJECTREF=27, 
		VARREF=28, NUM=29, WS=30, LINECOMMENT=31, BLOCKCOMMENT=32, CHAR=33, DIGIT=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCB", "RCB", "LB", "RB", "LSB", "RSB", "COLON", "SEMI", "ARROW", "COMMA", 
		"DOT", "STATE", "TRANSITION", "DELAY", "MINUS", "EQ", "NE", "GE", "GT", 
		"LE", "LT", "AND", "OR", "EXCL", "QM", "TIMEZERO", "OBJECTREF", "VARREF", 
		"NUM", "WS", "LINECOMMENT", "BLOCKCOMMENT", "CHAR", "DIGIT"
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


	public CoraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cora.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u00d8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u009e\n\34\f\34\16\34\u00a1\13\34\5\34\u00a3\n\34\3\35\3\35\3\35"+
		"\7\35\u00a8\n\35\f\35\16\35\u00ab\13\35\3\36\5\36\u00ae\n\36\3\36\6\36"+
		"\u00b1\n\36\r\36\16\36\u00b2\3\37\6\37\u00b6\n\37\r\37\16\37\u00b7\3\37"+
		"\3\37\3 \3 \3 \3 \7 \u00c0\n \f \16 \u00c3\13 \3 \3 \3!\3!\3!\3!\7!\u00cb"+
		"\n!\f!\16!\u00ce\13!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3\u00cc\2$\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$\3\2\6\5\2\13\f\17\17\"\"\4\2\f\f\17\17\5\2C\\aac|\3\2\62;\u00e0\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2"+
		"\5I\3\2\2\2\7K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2\21"+
		"U\3\2\2\2\23W\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2\31^\3\2\2\2\33e\3\2\2\2"+
		"\35q\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#|\3\2\2\2%\177\3\2\2\2\'\u0082\3\2"+
		"\2\2)\u0084\3\2\2\2+\u0087\3\2\2\2-\u0089\3\2\2\2/\u008c\3\2\2\2\61\u008f"+
		"\3\2\2\2\63\u0091\3\2\2\2\65\u0093\3\2\2\2\67\u00a2\3\2\2\29\u00a4\3\2"+
		"\2\2;\u00ad\3\2\2\2=\u00b5\3\2\2\2?\u00bb\3\2\2\2A\u00c6\3\2\2\2C\u00d4"+
		"\3\2\2\2E\u00d6\3\2\2\2GH\7}\2\2H\4\3\2\2\2IJ\7\177\2\2J\6\3\2\2\2KL\7"+
		"*\2\2L\b\3\2\2\2MN\7+\2\2N\n\3\2\2\2OP\7]\2\2P\f\3\2\2\2QR\7_\2\2R\16"+
		"\3\2\2\2ST\7<\2\2T\20\3\2\2\2UV\7=\2\2V\22\3\2\2\2WX\7/\2\2XY\7@\2\2Y"+
		"\24\3\2\2\2Z[\7.\2\2[\26\3\2\2\2\\]\7\60\2\2]\30\3\2\2\2^_\7U\2\2_`\7"+
		"v\2\2`a\7c\2\2ab\7v\2\2bc\7g\2\2cd\7<\2\2d\32\3\2\2\2ef\7V\2\2fg\7t\2"+
		"\2gh\7c\2\2hi\7p\2\2ij\7u\2\2jk\7k\2\2kl\7v\2\2lm\7k\2\2mn\7q\2\2no\7"+
		"p\2\2op\7<\2\2p\34\3\2\2\2qr\7F\2\2rs\7g\2\2st\7n\2\2tu\7c\2\2uv\7{\2"+
		"\2vw\7<\2\2w\36\3\2\2\2xy\7/\2\2y \3\2\2\2z{\7?\2\2{\"\3\2\2\2|}\7#\2"+
		"\2}~\7?\2\2~$\3\2\2\2\177\u0080\7@\2\2\u0080\u0081\7?\2\2\u0081&\3\2\2"+
		"\2\u0082\u0083\7@\2\2\u0083(\3\2\2\2\u0084\u0085\7>\2\2\u0085\u0086\7"+
		"?\2\2\u0086*\3\2\2\2\u0087\u0088\7>\2\2\u0088,\3\2\2\2\u0089\u008a\7("+
		"\2\2\u008a\u008b\7(\2\2\u008b.\3\2\2\2\u008c\u008d\7~\2\2\u008d\u008e"+
		"\7~\2\2\u008e\60\3\2\2\2\u008f\u0090\7#\2\2\u0090\62\3\2\2\2\u0091\u0092"+
		"\7A\2\2\u0092\64\3\2\2\2\u0093\u0094\7v\2\2\u0094\u0095\7*\2\2\u0095\u0096"+
		"\7\62\2\2\u0096\u0097\7+\2\2\u0097\66\3\2\2\2\u0098\u00a3\5\65\33\2\u0099"+
		"\u009f\59\35\2\u009a\u009b\5\27\f\2\u009b\u009c\5\67\34\2\u009c\u009e"+
		"\3\2\2\2\u009d\u009a\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u0098\3\2"+
		"\2\2\u00a2\u0099\3\2\2\2\u00a38\3\2\2\2\u00a4\u00a9\5C\"\2\u00a5\u00a8"+
		"\5C\"\2\u00a6\u00a8\5E#\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa:\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ac\u00ae\5\37\20\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00b1\5E#\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3<\3\2\2\2"+
		"\u00b4\u00b6\t\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\37\2\2"+
		"\u00ba>\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00bd\7\61\2\2\u00bd\u00c1"+
		"\3\2\2\2\u00be\u00c0\n\3\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4\u00c5\b \2\2\u00c5@\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8"+
		"\7,\2\2\u00c8\u00cc\3\2\2\2\u00c9\u00cb\13\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7,\2\2\u00d0\u00d1\7\61\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\b!\2\2\u00d3B\3\2\2\2\u00d4\u00d5\t\4\2\2\u00d5"+
		"D\3\2\2\2\u00d6\u00d7\t\5\2\2\u00d7F\3\2\2\2\f\2\u009f\u00a2\u00a7\u00a9"+
		"\u00ad\u00b2\u00b7\u00c1\u00cc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}