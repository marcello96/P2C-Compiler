// Generated from P2C.g4 by ANTLR 4.4
package com.compilers.P2C_Compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class P2CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT=2, LONG=3, DOUBLE=4, FLOAT=5, CHAR=6, BOOL=7, STRING=8, NULL=9, 
		TRUE=10, FALSE=11, IF=12, ELSIF=13, ELSE=14, WHILE=15, DO=16, DONE=17, 
		FOR=18, FUN=19, RETURN=20, LET=21, OF=22, ARRAY=23, UNDERLINE=24, LEFT_SQ_BRACKET=25, 
		RIGHT_SQ_BRACKET=26, LEFT_BRACKET=27, RIGHT_BRACKET=28, ASSIGN=29, AND=30, 
		OR=31, RELATIONALEXPR=32, ADD_OPERATORS=33, MUL_OPERATORS=34, EXCLAMATION=35, 
		ARROW=36, COLON=37, COMMA=38, SEMICOLON=39, IDENT=40, FLOATING_CONSTANT=41, 
		INTEGER_CONSTANT=42, WHITESPACE=43, BLOCK_COMMENT=44, LINE_COMMENT=45;
	public static final String[] tokenNames = {
		"<INVALID>", "'-'", "'int'", "'long'", "'double'", "'float'", "'char'", 
		"'bool'", "'string'", "'null'", "'true'", "'false'", "'if'", "'elsif'", 
		"'else'", "'while'", "'do'", "'done'", "'for'", "'fun'", "'return'", "'let'", 
		"'of'", "'array'", "'_'", "'['", "']'", "'('", "')'", "'='", "'and'", 
		"'or'", "RELATIONALEXPR", "ADD_OPERATORS", "MUL_OPERATORS", "'!'", "'->'", 
		"':'", "','", "';'", "IDENT", "FLOATING_CONSTANT", "INTEGER_CONSTANT", 
		"WHITESPACE", "BLOCK_COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_globalDefinitions = 1, RULE_varDeclaration = 2, 
		RULE_assignment = 3, RULE_parameterGroup = 4, RULE_identifier = 5, RULE_type = 6, 
		RULE_primitiveType = 7, RULE_array = 8, RULE_arrayType = 9, RULE_constant = 10, 
		RULE_ifDefinition = 11, RULE_loopDefinition = 12, RULE_expression = 13, 
		RULE_operators = 14, RULE_atom = 15, RULE_funDefinition = 16, RULE_parameterList = 17, 
		RULE_resultType = 18, RULE_funDesignator = 19, RULE_argumentList = 20, 
		RULE_blockElement = 21, RULE_returnStatement = 22, RULE_blockWithoutReturn = 23, 
		RULE_block = 24;
	public static final String[] ruleNames = {
		"program", "globalDefinitions", "varDeclaration", "assignment", "parameterGroup", 
		"identifier", "type", "primitiveType", "array", "arrayType", "constant", 
		"ifDefinition", "loopDefinition", "expression", "operators", "atom", "funDefinition", 
		"parameterList", "resultType", "funDesignator", "argumentList", "blockElement", 
		"returnStatement", "blockWithoutReturn", "block"
	};

	@Override
	public String getGrammarFileName() { return "P2C.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public P2CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode DONE() { return getToken(P2CParser.DONE, 0); }
		public TerminalNode DO() { return getToken(P2CParser.DO, 0); }
		public GlobalDefinitionsContext globalDefinitions() {
			return getRuleContext(GlobalDefinitionsContext.class,0);
		}
		public BlockWithoutReturnContext blockWithoutReturn() {
			return getRuleContext(BlockWithoutReturnContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); globalDefinitions();
			setState(51); match(DO);
			setState(52); blockWithoutReturn();
			setState(53); match(DONE);
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

	public static class GlobalDefinitionsContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(P2CParser.SEMICOLON); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public List<FunDefinitionContext> funDefinition() {
			return getRuleContexts(FunDefinitionContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(P2CParser.SEMICOLON, i);
		}
		public FunDefinitionContext funDefinition(int i) {
			return getRuleContext(FunDefinitionContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public GlobalDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDefinitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitGlobalDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalDefinitionsContext globalDefinitions() throws RecognitionException {
		GlobalDefinitionsContext _localctx = new GlobalDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globalDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN || _la==LET) {
				{
				setState(59);
				switch (_input.LA(1)) {
				case LET:
					{
					setState(55); varDeclaration();
					setState(56); match(SEMICOLON);
					}
					break;
				case FUN:
					{
					setState(58); funDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(63);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(P2CParser.ASSIGN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ParameterGroupContext parameterGroup() {
			return getRuleContext(ParameterGroupContext.class,0);
		}
		public TerminalNode LET() { return getToken(P2CParser.LET, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(LET);
			setState(65); parameterGroup();
			setState(68);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(66); match(ASSIGN);
				setState(67); constant();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode RIGHT_SQ_BRACKET(int i) {
			return getToken(P2CParser.RIGHT_SQ_BRACKET, i);
		}
		public TerminalNode ASSIGN() { return getToken(P2CParser.ASSIGN, 0); }
		public List<TerminalNode> LEFT_SQ_BRACKET() { return getTokens(P2CParser.LEFT_SQ_BRACKET); }
		public TerminalNode INTEGER_CONSTANT(int i) {
			return getToken(P2CParser.INTEGER_CONSTANT, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LEFT_SQ_BRACKET(int i) {
			return getToken(P2CParser.LEFT_SQ_BRACKET, i);
		}
		public List<TerminalNode> INTEGER_CONSTANT() { return getTokens(P2CParser.INTEGER_CONSTANT); }
		public TerminalNode IDENT() { return getToken(P2CParser.IDENT, 0); }
		public List<TerminalNode> RIGHT_SQ_BRACKET() { return getTokens(P2CParser.RIGHT_SQ_BRACKET); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(IDENT);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_SQ_BRACKET) {
				{
				{
				setState(71); match(LEFT_SQ_BRACKET);
				setState(72); match(INTEGER_CONSTANT);
				setState(73); match(RIGHT_SQ_BRACKET);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79); match(ASSIGN);
			setState(80); expression(0);
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

	public static class ParameterGroupContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(P2CParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitParameterGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); identifier();
			setState(83); match(COLON);
			setState(84); type();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(P2CParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(IDENT);
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(88); array();
				}
			}

			setState(91); primitiveType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(P2CParser.BOOL, 0); }
		public TerminalNode LONG() { return getToken(P2CParser.LONG, 0); }
		public TerminalNode STRING() { return getToken(P2CParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(P2CParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(P2CParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(P2CParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(P2CParser.FLOAT, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << LONG) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode RIGHT_SQ_BRACKET(int i) {
			return getToken(P2CParser.RIGHT_SQ_BRACKET, i);
		}
		public TerminalNode ARRAY() { return getToken(P2CParser.ARRAY, 0); }
		public TerminalNode OF() { return getToken(P2CParser.OF, 0); }
		public List<TerminalNode> LEFT_SQ_BRACKET() { return getTokens(P2CParser.LEFT_SQ_BRACKET); }
		public TerminalNode INTEGER_CONSTANT(int i) {
			return getToken(P2CParser.INTEGER_CONSTANT, i);
		}
		public TerminalNode LEFT_SQ_BRACKET(int i) {
			return getToken(P2CParser.LEFT_SQ_BRACKET, i);
		}
		public List<TerminalNode> INTEGER_CONSTANT() { return getTokens(P2CParser.INTEGER_CONSTANT); }
		public List<TerminalNode> RIGHT_SQ_BRACKET() { return getTokens(P2CParser.RIGHT_SQ_BRACKET); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(ARRAY);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96); match(LEFT_SQ_BRACKET);
				setState(97); match(INTEGER_CONSTANT);
				setState(98); match(RIGHT_SQ_BRACKET);
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LEFT_SQ_BRACKET );
			setState(103); match(OF);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(P2CParser.ARRAY, 0); }
		public TerminalNode OF() { return getToken(P2CParser.OF, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(ARRAY);
			setState(106); match(OF);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER_CONSTANT() { return getToken(P2CParser.INTEGER_CONSTANT, 0); }
		public TerminalNode FLOATING_CONSTANT() { return getToken(P2CParser.FLOATING_CONSTANT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constant);
		int _la;
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(108); match(T__0);
					}
				}

				setState(111); match(INTEGER_CONSTANT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(112); match(T__0);
					}
				}

				setState(115); match(FLOATING_CONSTANT);
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

	public static class IfDefinitionContext extends ParserRuleContext {
		public BlockWithoutReturnContext blockWithoutReturn(int i) {
			return getRuleContext(BlockWithoutReturnContext.class,i);
		}
		public TerminalNode ELSIF(int i) {
			return getToken(P2CParser.ELSIF, i);
		}
		public TerminalNode ELSE() { return getToken(P2CParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(P2CParser.IF, 0); }
		public List<TerminalNode> ELSIF() { return getTokens(P2CParser.ELSIF); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(P2CParser.RIGHT_BRACKET, i);
		}
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(P2CParser.LEFT_BRACKET, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DONE() { return getTokens(P2CParser.DONE); }
		public List<TerminalNode> DO() { return getTokens(P2CParser.DO); }
		public TerminalNode DONE(int i) {
			return getToken(P2CParser.DONE, i);
		}
		public TerminalNode DO(int i) {
			return getToken(P2CParser.DO, i);
		}
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(P2CParser.LEFT_BRACKET); }
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(P2CParser.RIGHT_BRACKET); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<BlockWithoutReturnContext> blockWithoutReturn() {
			return getRuleContexts(BlockWithoutReturnContext.class);
		}
		public IfDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitIfDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfDefinitionContext ifDefinition() throws RecognitionException {
		IfDefinitionContext _localctx = new IfDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(IF);
			setState(119); match(LEFT_BRACKET);
			setState(120); expression(0);
			setState(121); match(RIGHT_BRACKET);
			setState(122); match(DO);
			setState(123); blockWithoutReturn();
			setState(124); match(DONE);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(125); match(ELSIF);
				setState(126); match(LEFT_BRACKET);
				setState(127); expression(0);
				setState(128); match(RIGHT_BRACKET);
				setState(129); match(DO);
				setState(130); blockWithoutReturn();
				setState(131); match(DONE);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(138); match(ELSE);
				setState(139); match(DO);
				setState(140); blockWithoutReturn();
				setState(141); match(DONE);
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

	public static class LoopDefinitionContext extends ParserRuleContext {
		public TerminalNode DONE() { return getToken(P2CParser.DONE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(P2CParser.SEMICOLON); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public TerminalNode DO() { return getToken(P2CParser.DO, 0); }
		public TerminalNode FOR() { return getToken(P2CParser.FOR, 0); }
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(P2CParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(P2CParser.RIGHT_BRACKET, 0); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(P2CParser.SEMICOLON, i);
		}
		public TerminalNode WHILE() { return getToken(P2CParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockWithoutReturnContext blockWithoutReturn() {
			return getRuleContext(BlockWithoutReturnContext.class,0);
		}
		public LoopDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitLoopDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopDefinitionContext loopDefinition() throws RecognitionException {
		LoopDefinitionContext _localctx = new LoopDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loopDefinition);
		try {
			setState(165);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); match(WHILE);
				setState(146); match(LEFT_BRACKET);
				setState(147); expression(0);
				setState(148); match(RIGHT_BRACKET);
				setState(149); match(DO);
				setState(150); blockWithoutReturn();
				setState(151); match(DONE);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(153); match(FOR);
				setState(154); match(LEFT_BRACKET);
				setState(155); assignment();
				setState(156); match(SEMICOLON);
				setState(157); expression(0);
				setState(158); match(SEMICOLON);
				setState(159); assignment();
				setState(160); match(RIGHT_BRACKET);
				setState(161); match(DO);
				setState(162); blockWithoutReturn();
				setState(163); match(DONE);
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

	public static class ExpressionContext extends ParserRuleContext {
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public TerminalNode EXCLAMATION() { return getToken(P2CParser.EXCLAMATION, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				{
				setState(168); match(EXCLAMATION);
				setState(169); expression(3);
				}
				break;
			case T__0:
			case NULL:
			case TRUE:
			case FALSE:
			case LEFT_BRACKET:
			case IDENT:
			case FLOATING_CONSTANT:
			case INTEGER_CONSTANT:
				{
				setState(170); atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(173);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(174); operators();
					setState(175); expression(3);
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class OperatorsContext extends ParserRuleContext {
		public TerminalNode RELATIONALEXPR() { return getToken(P2CParser.RELATIONALEXPR, 0); }
		public TerminalNode ADD_OPERATORS() { return getToken(P2CParser.ADD_OPERATORS, 0); }
		public TerminalNode AND() { return getToken(P2CParser.AND, 0); }
		public TerminalNode OR() { return getToken(P2CParser.OR, 0); }
		public TerminalNode MUL_OPERATORS() { return getToken(P2CParser.MUL_OPERATORS, 0); }
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << RELATIONALEXPR) | (1L << ADD_OPERATORS) | (1L << MUL_OPERATORS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AtomContext extends ParserRuleContext {
		public FunDesignatorContext funDesignator() {
			return getRuleContext(FunDesignatorContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode NULL() { return getToken(P2CParser.NULL, 0); }
		public TerminalNode FALSE() { return getToken(P2CParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(P2CParser.TRUE, 0); }
		public TerminalNode LEFT_SQ_BRACKET() { return getToken(P2CParser.LEFT_SQ_BRACKET, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(P2CParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(P2CParser.RIGHT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INTEGER_CONSTANT() { return getToken(P2CParser.INTEGER_CONSTANT, 0); }
		public TerminalNode IDENT() { return getToken(P2CParser.IDENT, 0); }
		public TerminalNode RIGHT_SQ_BRACKET() { return getToken(P2CParser.RIGHT_SQ_BRACKET, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atom);
		int _la;
		try {
			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); match(LEFT_BRACKET);
				setState(185); expression(0);
				setState(186); match(RIGHT_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189); funDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191); match(IDENT);
				setState(195);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(192); match(LEFT_SQ_BRACKET);
					setState(193); match(INTEGER_CONSTANT);
					setState(194); match(RIGHT_SQ_BRACKET);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(197); match(NULL);
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

	public static class FunDefinitionContext extends ParserRuleContext {
		public TerminalNode DONE() { return getToken(P2CParser.DONE, 0); }
		public TerminalNode DO() { return getToken(P2CParser.DO, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(P2CParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(P2CParser.RIGHT_BRACKET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FUN() { return getToken(P2CParser.FUN, 0); }
		public TerminalNode ARROW() { return getToken(P2CParser.ARROW, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public FunDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitFunDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDefinitionContext funDefinition() throws RecognitionException {
		FunDefinitionContext _localctx = new FunDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(FUN);
			setState(201); identifier();
			setState(202); match(LEFT_BRACKET);
			setState(204);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(203); parameterList();
				}
			}

			setState(206); match(RIGHT_BRACKET);
			setState(209);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(207); match(ARROW);
				setState(208); resultType();
				}
			}

			setState(211); match(DO);
			setState(212); block();
			setState(213); match(DONE);
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterGroupContext parameterGroup(int i) {
			return getRuleContext(ParameterGroupContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(P2CParser.COMMA); }
		public List<ParameterGroupContext> parameterGroup() {
			return getRuleContexts(ParameterGroupContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(P2CParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); parameterGroup();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(216); match(COMMA);
				setState(217); parameterGroup();
				}
				}
				setState(222);
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

	public static class ResultTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitResultType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_resultType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(223); arrayType();
				}
			}

			setState(226); primitiveType();
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

	public static class FunDesignatorContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(P2CParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(P2CParser.RIGHT_BRACKET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDesignator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitFunDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDesignatorContext funDesignator() throws RecognitionException {
		FunDesignatorContext _localctx = new FunDesignatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funDesignator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); identifier();
			setState(229); match(LEFT_BRACKET);
			setState(231);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT_BRACKET) | (1L << EXCLAMATION) | (1L << IDENT) | (1L << FLOATING_CONSTANT) | (1L << INTEGER_CONSTANT))) != 0)) {
				{
				setState(230); argumentList();
				}
			}

			setState(233); match(RIGHT_BRACKET);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(P2CParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(P2CParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); expression(0);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(236); match(COMMA);
				setState(237); expression(0);
				}
				}
				setState(242);
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

	public static class BlockElementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(P2CParser.SEMICOLON, 0); }
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfDefinitionContext ifDefinition() {
			return getRuleContext(IfDefinitionContext.class,0);
		}
		public LoopDefinitionContext loopDefinition() {
			return getRuleContext(LoopDefinitionContext.class,0);
		}
		public BlockElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitBlockElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockElementContext blockElement() throws RecognitionException {
		BlockElementContext _localctx = new BlockElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_blockElement);
		try {
			setState(251);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(243); varDeclaration();
				setState(244); match(SEMICOLON);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(246); assignment();
				setState(247); match(SEMICOLON);
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(249); loopDefinition();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(250); ifDefinition();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(P2CParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(P2CParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); match(RETURN);
			setState(254); expression(0);
			setState(255); match(SEMICOLON);
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

	public static class BlockWithoutReturnContext extends ParserRuleContext {
		public List<BlockElementContext> blockElement() {
			return getRuleContexts(BlockElementContext.class);
		}
		public BlockElementContext blockElement(int i) {
			return getRuleContext(BlockElementContext.class,i);
		}
		public BlockWithoutReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockWithoutReturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitBlockWithoutReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockWithoutReturnContext blockWithoutReturn() throws RecognitionException {
		BlockWithoutReturnContext _localctx = new BlockWithoutReturnContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_blockWithoutReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << LET) | (1L << IDENT))) != 0)) {
				{
				{
				setState(257); blockElement();
				}
				}
				setState(262);
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockElementContext> blockElement() {
			return getRuleContexts(BlockElementContext.class);
		}
		public BlockElementContext blockElement(int i) {
			return getRuleContext(BlockElementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << LET) | (1L << IDENT))) != 0)) {
				{
				{
				setState(263); blockElement();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269); returnStatement();
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
		case 13: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u0112\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3"+
		"\3\4\3\4\3\4\3\4\5\4G\n\4\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\5\b\\\n\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\6\nf\n\n\r\n\16\ng\3\n\3\n\3\13\3\13\3\13\3\f\5\fp\n\f\3\f\3"+
		"\f\5\ft\n\f\3\f\5\fw\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u0088\n\r\f\r\16\r\u008b\13\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0092\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a8\n\16\3\17\3\17"+
		"\3\17\3\17\5\17\u00ae\n\17\3\17\3\17\3\17\3\17\7\17\u00b4\n\17\f\17\16"+
		"\17\u00b7\13\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00c6\n\21\3\21\5\21\u00c9\n\21\3\22\3\22\3\22\3\22\5"+
		"\22\u00cf\n\22\3\22\3\22\3\22\5\22\u00d4\n\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\7\23\u00dd\n\23\f\23\16\23\u00e0\13\23\3\24\5\24\u00e3\n\24"+
		"\3\24\3\24\3\25\3\25\3\25\5\25\u00ea\n\25\3\25\3\25\3\26\3\26\3\26\7\26"+
		"\u00f1\n\26\f\26\16\26\u00f4\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u00fe\n\27\3\30\3\30\3\30\3\30\3\31\7\31\u0105\n\31\f\31\16"+
		"\31\u0108\13\31\3\32\7\32\u010b\n\32\f\32\16\32\u010e\13\32\3\32\3\32"+
		"\3\32\2\3\34\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\2\5\3\2\4\n\3\2 $\3\2\f\r\u0117\2\64\3\2\2\2\4?\3\2\2\2\6B\3\2\2\2\b"+
		"H\3\2\2\2\nT\3\2\2\2\fX\3\2\2\2\16[\3\2\2\2\20_\3\2\2\2\22a\3\2\2\2\24"+
		"k\3\2\2\2\26v\3\2\2\2\30x\3\2\2\2\32\u00a7\3\2\2\2\34\u00ad\3\2\2\2\36"+
		"\u00b8\3\2\2\2 \u00c8\3\2\2\2\"\u00ca\3\2\2\2$\u00d9\3\2\2\2&\u00e2\3"+
		"\2\2\2(\u00e6\3\2\2\2*\u00ed\3\2\2\2,\u00fd\3\2\2\2.\u00ff\3\2\2\2\60"+
		"\u0106\3\2\2\2\62\u010c\3\2\2\2\64\65\5\4\3\2\65\66\7\22\2\2\66\67\5\60"+
		"\31\2\678\7\23\2\28\3\3\2\2\29:\5\6\4\2:;\7)\2\2;>\3\2\2\2<>\5\"\22\2"+
		"=9\3\2\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\5\3\2\2\2A?\3\2\2"+
		"\2BC\7\27\2\2CF\5\n\6\2DE\7\37\2\2EG\5\26\f\2FD\3\2\2\2FG\3\2\2\2G\7\3"+
		"\2\2\2HN\7*\2\2IJ\7\33\2\2JK\7,\2\2KM\7\34\2\2LI\3\2\2\2MP\3\2\2\2NL\3"+
		"\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\37\2\2RS\5\34\17\2S\t\3\2\2\2"+
		"TU\5\f\7\2UV\7\'\2\2VW\5\16\b\2W\13\3\2\2\2XY\7*\2\2Y\r\3\2\2\2Z\\\5\22"+
		"\n\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\5\20\t\2^\17\3\2\2\2_`\t\2\2\2"+
		"`\21\3\2\2\2ae\7\31\2\2bc\7\33\2\2cd\7,\2\2df\7\34\2\2eb\3\2\2\2fg\3\2"+
		"\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\30\2\2j\23\3\2\2\2kl\7\31\2\2l"+
		"m\7\30\2\2m\25\3\2\2\2np\7\3\2\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qw\7,\2"+
		"\2rt\7\3\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\7+\2\2vo\3\2\2\2vs\3\2\2"+
		"\2w\27\3\2\2\2xy\7\16\2\2yz\7\35\2\2z{\5\34\17\2{|\7\36\2\2|}\7\22\2\2"+
		"}~\5\60\31\2~\u0089\7\23\2\2\177\u0080\7\17\2\2\u0080\u0081\7\35\2\2\u0081"+
		"\u0082\5\34\17\2\u0082\u0083\7\36\2\2\u0083\u0084\7\22\2\2\u0084\u0085"+
		"\5\60\31\2\u0085\u0086\7\23\2\2\u0086\u0088\3\2\2\2\u0087\177\3\2\2\2"+
		"\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0091"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\20\2\2\u008d\u008e\7\22\2\2"+
		"\u008e\u008f\5\60\31\2\u008f\u0090\7\23\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008c\3\2\2\2\u0091\u0092\3\2\2\2\u0092\31\3\2\2\2\u0093\u0094\7\21\2"+
		"\2\u0094\u0095\7\35\2\2\u0095\u0096\5\34\17\2\u0096\u0097\7\36\2\2\u0097"+
		"\u0098\7\22\2\2\u0098\u0099\5\60\31\2\u0099\u009a\7\23\2\2\u009a\u00a8"+
		"\3\2\2\2\u009b\u009c\7\24\2\2\u009c\u009d\7\35\2\2\u009d\u009e\5\b\5\2"+
		"\u009e\u009f\7)\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\7)\2\2\u00a1\u00a2"+
		"\5\b\5\2\u00a2\u00a3\7\36\2\2\u00a3\u00a4\7\22\2\2\u00a4\u00a5\5\60\31"+
		"\2\u00a5\u00a6\7\23\2\2\u00a6\u00a8\3\2\2\2\u00a7\u0093\3\2\2\2\u00a7"+
		"\u009b\3\2\2\2\u00a8\33\3\2\2\2\u00a9\u00aa\b\17\1\2\u00aa\u00ab\7%\2"+
		"\2\u00ab\u00ae\5\34\17\5\u00ac\u00ae\5 \21\2\u00ad\u00a9\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00b5\3\2\2\2\u00af\u00b0\f\4\2\2\u00b0\u00b1\5\36"+
		"\20\2\u00b1\u00b2\5\34\17\5\u00b2\u00b4\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\35\3\2\2"+
		"\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\t\3\2\2\u00b9\37\3\2\2\2\u00ba\u00bb"+
		"\7\35\2\2\u00bb\u00bc\5\34\17\2\u00bc\u00bd\7\36\2\2\u00bd\u00c9\3\2\2"+
		"\2\u00be\u00c9\5\26\f\2\u00bf\u00c9\5(\25\2\u00c0\u00c9\t\4\2\2\u00c1"+
		"\u00c5\7*\2\2\u00c2\u00c3\7\33\2\2\u00c3\u00c4\7,\2\2\u00c4\u00c6\7\34"+
		"\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c9\7\13\2\2\u00c8\u00ba\3\2\2\2\u00c8\u00be\3\2\2\2\u00c8\u00bf\3"+
		"\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"!\3\2\2\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc\5\f\7\2\u00cc\u00ce\7\35\2"+
		"\2\u00cd\u00cf\5$\23\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d3\7\36\2\2\u00d1\u00d2\7&\2\2\u00d2\u00d4\5&\24\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\22"+
		"\2\2\u00d6\u00d7\5\62\32\2\u00d7\u00d8\7\23\2\2\u00d8#\3\2\2\2\u00d9\u00de"+
		"\5\n\6\2\u00da\u00db\7(\2\2\u00db\u00dd\5\n\6\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df%\3\2\2\2"+
		"\u00e0\u00de\3\2\2\2\u00e1\u00e3\5\24\13\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\5\20\t\2\u00e5\'\3\2\2\2\u00e6"+
		"\u00e7\5\f\7\2\u00e7\u00e9\7\35\2\2\u00e8\u00ea\5*\26\2\u00e9\u00e8\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7\36\2\2\u00ec"+
		")\3\2\2\2\u00ed\u00f2\5\34\17\2\u00ee\u00ef\7(\2\2\u00ef\u00f1\5\34\17"+
		"\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3+\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\5\6\4\2\u00f6"+
		"\u00f7\7)\2\2\u00f7\u00fe\3\2\2\2\u00f8\u00f9\5\b\5\2\u00f9\u00fa\7)\2"+
		"\2\u00fa\u00fe\3\2\2\2\u00fb\u00fe\5\32\16\2\u00fc\u00fe\5\30\r\2\u00fd"+
		"\u00f5\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2"+
		"\2\2\u00fe-\3\2\2\2\u00ff\u0100\7\26\2\2\u0100\u0101\5\34\17\2\u0101\u0102"+
		"\7)\2\2\u0102/\3\2\2\2\u0103\u0105\5,\27\2\u0104\u0103\3\2\2\2\u0105\u0108"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\61\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010b\5,\27\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0110\5.\30\2\u0110\63\3\2\2\2\33=?FN[gosv\u0089"+
		"\u0091\u00a7\u00ad\u00b5\u00c5\u00c8\u00ce\u00d3\u00de\u00e2\u00e9\u00f2"+
		"\u00fd\u0106\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}