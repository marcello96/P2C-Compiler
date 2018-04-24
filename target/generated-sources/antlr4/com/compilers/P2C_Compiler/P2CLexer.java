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
		LET=1, INT=2, DOUBLE=3, FLOAT=4, CHAR=5, BOOL=6, OF=7, ARRAY=8, UNDERLINE=9, 
		INT_NUMBER=10, DEC_NUMER=11, NUMBER=12, LETTER=13, COLON=14, LEFT_SQ_BRACKET=15, 
		RIGHT_SQ_BRACKET=16, LEFT_BRACKET=17, RIGHT_BRACKET=18, WHITESPACE=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'"
	};
	public static final String[] ruleNames = {
		"LET", "INT", "DOUBLE", "FLOAT", "CHAR", "BOOL", "OF", "ARRAY", "UNDERLINE", 
		"INT_NUMBER", "DEC_NUMER", "NUMBER", "LETTER", "COLON", "LEFT_SQ_BRACKET", 
		"RIGHT_SQ_BRACKET", "LEFT_BRACKET", "RIGHT_BRACKET", "WHITESPACE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\7\13W"+
		"\n\13\f\13\16\13Z\13\13\5\13\\\n\13\3\f\6\f_\n\f\r\f\16\f`\3\r\3\r\3\16"+
		"\5\16f\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\6\24"+
		"s\n\24\r\24\16\24t\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\4\4\2C\\"+
		"c|\5\2\13\f\16\17\"\"{\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5-\3\2\2"+
		"\2\7\61\3\2\2\2\t8\3\2\2\2\13>\3\2\2\2\rC\3\2\2\2\17H\3\2\2\2\21K\3\2"+
		"\2\2\23Q\3\2\2\2\25[\3\2\2\2\27^\3\2\2\2\31b\3\2\2\2\33e\3\2\2\2\35g\3"+
		"\2\2\2\37i\3\2\2\2!k\3\2\2\2#m\3\2\2\2%o\3\2\2\2\'r\3\2\2\2)*\7n\2\2*"+
		"+\7g\2\2+,\7v\2\2,\4\3\2\2\2-.\7k\2\2./\7p\2\2/\60\7v\2\2\60\6\3\2\2\2"+
		"\61\62\7f\2\2\62\63\7q\2\2\63\64\7w\2\2\64\65\7d\2\2\65\66\7n\2\2\66\67"+
		"\7g\2\2\67\b\3\2\2\289\7h\2\29:\7n\2\2:;\7q\2\2;<\7c\2\2<=\7v\2\2=\n\3"+
		"\2\2\2>?\7e\2\2?@\7j\2\2@A\7c\2\2AB\7t\2\2B\f\3\2\2\2CD\7d\2\2DE\7q\2"+
		"\2EF\7q\2\2FG\7n\2\2G\16\3\2\2\2HI\7q\2\2IJ\7h\2\2J\20\3\2\2\2KL\7c\2"+
		"\2LM\7t\2\2MN\7t\2\2NO\7c\2\2OP\7{\2\2P\22\3\2\2\2QR\7a\2\2R\24\3\2\2"+
		"\2S\\\7\62\2\2TX\4\63;\2UW\4\62;\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2"+
		"\2\2Y\\\3\2\2\2ZX\3\2\2\2[S\3\2\2\2[T\3\2\2\2\\\26\3\2\2\2]_\4\62;\2^"+
		"]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\30\3\2\2\2bc\4\62;\2c\32\3\2"+
		"\2\2df\t\2\2\2ed\3\2\2\2f\34\3\2\2\2gh\7<\2\2h\36\3\2\2\2ij\7]\2\2j \3"+
		"\2\2\2kl\7_\2\2l\"\3\2\2\2mn\7*\2\2n$\3\2\2\2op\7+\2\2p&\3\2\2\2qs\t\3"+
		"\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\24\2\2w(\3"+
		"\2\2\2\b\2X[`et\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}