// Generated from P2C.g4 by ANTLR 4.4
package com.compilers.P2C_Compiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class P2CLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LET=2, INT=3, DOUBLE=4, FLOAT=5, CHAR=6, BOOL=7, OF=8, ARRAY=9, 
		UNDERLINE=10, LEFT_SQ_BRACKET=11, RIGHT_SQ_BRACKET=12, LEFT_BRACKET=13, 
		RIGHT_BRACKET=14, ASSIGNMENT=15, ADD_OPERATORS=16, MUL_OPERATORS=17, COLON=18, 
		SEMICOLON=19, IDENT=20, FLOATING_CONSTANT=21, INTEGER_CONSTANT=22, WHITESPACE=23, 
		BLOCK_COMMENT=24, LINE_COMMENT=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'"
	};
	public static final String[] ruleNames = {
		"T__0", "LET", "INT", "DOUBLE", "FLOAT", "CHAR", "BOOL", "OF", "ARRAY", 
		"UNDERLINE", "LEFT_SQ_BRACKET", "RIGHT_SQ_BRACKET", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"ASSIGNMENT", "ADD_OPERATORS", "MUL_OPERATORS", "COLON", "SEMICOLON", 
		"IDENT", "FLOATING_CONSTANT", "INTEGER_CONSTANT", "DIGIT_SEQUENCE", "BINARY_CONSTANT", 
		"DECIMAL_CONSTANT", "OCTAL_CONSTANT", "HEXADECIMAL_CONSTANT", "HEXADECIMAL_PREFIX", 
		"DIGIT", "NONZERO_DIGIT", "OCTAL_DIGIT", "HEXADECIMAL_DIGIT", "WHITESPACE", 
		"BLOCK_COMMENT", "LINE_COMMENT"
	};


	public P2CLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "P2C.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00ec\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\7\25\u008a\n\25\f\25\16\25\u008d\13\25\3\26\3"+
		"\26\5\26\u0091\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u009a\n\26"+
		"\3\27\3\27\3\27\3\27\5\27\u00a0\n\27\3\30\6\30\u00a3\n\30\r\30\16\30\u00a4"+
		"\3\31\3\31\3\31\6\31\u00aa\n\31\r\31\16\31\u00ab\3\32\3\32\7\32\u00b0"+
		"\n\32\f\32\16\32\u00b3\13\32\3\33\3\33\7\33\u00b7\n\33\f\33\16\33\u00ba"+
		"\13\33\3\34\3\34\6\34\u00be\n\34\r\34\16\34\u00bf\3\35\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\6\"\u00ce\n\"\r\"\16\"\u00cf\3\"\3\"\3"+
		"#\3#\3#\3#\7#\u00d8\n#\f#\16#\u00db\13#\3#\3#\3#\3#\3#\3$\3$\3$\3$\7$"+
		"\u00e6\n$\f$\16$\u00e9\13$\3$\3$\3\u00d9\2%\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\31E\32G\33\3\2\17\4\2-"+
		"-//\4\2,,\61\61\5\2C\\aac|\6\2\62;C\\aac|\4\2DDdd\3\2\62\63\4\2ZZzz\3"+
		"\2\62;\3\2\63;\3\2\629\5\2\62;CHch\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u00ef"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7O\3\2\2\2\tS\3\2\2\2\13"+
		"Z\3\2\2\2\r`\3\2\2\2\17e\3\2\2\2\21j\3\2\2\2\23m\3\2\2\2\25s\3\2\2\2\27"+
		"u\3\2\2\2\31w\3\2\2\2\33y\3\2\2\2\35{\3\2\2\2\37}\3\2\2\2!\177\3\2\2\2"+
		"#\u0081\3\2\2\2%\u0083\3\2\2\2\'\u0085\3\2\2\2)\u0087\3\2\2\2+\u0099\3"+
		"\2\2\2-\u009f\3\2\2\2/\u00a2\3\2\2\2\61\u00a6\3\2\2\2\63\u00ad\3\2\2\2"+
		"\65\u00b4\3\2\2\2\67\u00bb\3\2\2\29\u00c1\3\2\2\2;\u00c4\3\2\2\2=\u00c6"+
		"\3\2\2\2?\u00c8\3\2\2\2A\u00ca\3\2\2\2C\u00cd\3\2\2\2E\u00d3\3\2\2\2G"+
		"\u00e1\3\2\2\2IJ\7/\2\2J\4\3\2\2\2KL\7n\2\2LM\7g\2\2MN\7v\2\2N\6\3\2\2"+
		"\2OP\7k\2\2PQ\7p\2\2QR\7v\2\2R\b\3\2\2\2ST\7f\2\2TU\7q\2\2UV\7w\2\2VW"+
		"\7d\2\2WX\7n\2\2XY\7g\2\2Y\n\3\2\2\2Z[\7h\2\2[\\\7n\2\2\\]\7q\2\2]^\7"+
		"c\2\2^_\7v\2\2_\f\3\2\2\2`a\7e\2\2ab\7j\2\2bc\7c\2\2cd\7t\2\2d\16\3\2"+
		"\2\2ef\7d\2\2fg\7q\2\2gh\7q\2\2hi\7n\2\2i\20\3\2\2\2jk\7q\2\2kl\7h\2\2"+
		"l\22\3\2\2\2mn\7c\2\2no\7t\2\2op\7t\2\2pq\7c\2\2qr\7{\2\2r\24\3\2\2\2"+
		"st\7a\2\2t\26\3\2\2\2uv\7]\2\2v\30\3\2\2\2wx\7_\2\2x\32\3\2\2\2yz\7*\2"+
		"\2z\34\3\2\2\2{|\7+\2\2|\36\3\2\2\2}~\7?\2\2~ \3\2\2\2\177\u0080\t\2\2"+
		"\2\u0080\"\3\2\2\2\u0081\u0082\t\3\2\2\u0082$\3\2\2\2\u0083\u0084\7<\2"+
		"\2\u0084&\3\2\2\2\u0085\u0086\7=\2\2\u0086(\3\2\2\2\u0087\u008b\t\4\2"+
		"\2\u0088\u008a\t\5\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c*\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0090\5=\37\2\u008f\u0091\5/\30\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\60\2\2\u0093\u0094\5/\30\2\u0094"+
		"\u009a\3\2\2\2\u0095\u0096\7\62\2\2\u0096\u0097\7\60\2\2\u0097\u0098\3"+
		"\2\2\2\u0098\u009a\5/\30\2\u0099\u008e\3\2\2\2\u0099\u0095\3\2\2\2\u009a"+
		",\3\2\2\2\u009b\u00a0\5\63\32\2\u009c\u00a0\5\65\33\2\u009d\u00a0\5\67"+
		"\34\2\u009e\u00a0\5\61\31\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0.\3\2\2\2\u00a1\u00a3\5;\36\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\60\3\2\2\2\u00a6\u00a7\7\62\2\2\u00a7\u00a9\t\6\2\2\u00a8"+
		"\u00aa\t\7\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\62\3\2\2\2\u00ad\u00b1\5=\37\2\u00ae\u00b0"+
		"\5;\36\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\64\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b8\7\62\2"+
		"\2\u00b5\u00b7\5? \2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\66\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bd\59\35\2\u00bc\u00be\5A!\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2"+
		"\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c08\3\2\2\2\u00c1\u00c2"+
		"\7\62\2\2\u00c2\u00c3\t\b\2\2\u00c3:\3\2\2\2\u00c4\u00c5\t\t\2\2\u00c5"+
		"<\3\2\2\2\u00c6\u00c7\t\n\2\2\u00c7>\3\2\2\2\u00c8\u00c9\t\13\2\2\u00c9"+
		"@\3\2\2\2\u00ca\u00cb\t\f\2\2\u00cbB\3\2\2\2\u00cc\u00ce\t\r\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\"\2\2\u00d2D\3\2\2\2\u00d3\u00d4"+
		"\7\61\2\2\u00d4\u00d5\7,\2\2\u00d5\u00d9\3\2\2\2\u00d6\u00d8\13\2\2\2"+
		"\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00da\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7,\2\2\u00dd"+
		"\u00de\7\61\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b#\2\2\u00e0F\3\2\2\2"+
		"\u00e1\u00e2\7\61\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e6"+
		"\n\16\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb"+
		"\b$\2\2\u00ebH\3\2\2\2\17\2\u008b\u0090\u0099\u009f\u00a4\u00ab\u00b1"+
		"\u00b8\u00bf\u00cf\u00d9\u00e7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}