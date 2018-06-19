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
		RULE_program = 0, RULE_globalDefinitions = 1, RULE_start = 2, RULE_varDeclaration = 3, 
		RULE_assignment = 4, RULE_parameterGroup = 5, RULE_identifier = 6, RULE_type = 7, 
		RULE_primitiveType = 8, RULE_array = 9, RULE_constant = 10, RULE_ifDefinition = 11, 
		RULE_loopDefinition = 12, RULE_expression = 13, RULE_operators = 14, RULE_atom = 15, 
		RULE_funDefinition = 16, RULE_parameterList = 17, RULE_resultType = 18, 
		RULE_funDesignator = 19, RULE_argumentList = 20, RULE_blockElement = 21, 
		RULE_returnStatement = 22, RULE_blockWithoutReturn = 23, RULE_block = 24;
	public static final String[] ruleNames = {
		"program", "globalDefinitions", "start", "varDeclaration", "assignment", 
		"parameterGroup", "identifier", "type", "primitiveType", "array", "constant", 
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(P2CParser.SEMICOLON, 0); }
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunDefinitionContext funDefinition() {
			return getRuleContext(FunDefinitionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfDefinitionContext ifDefinition() {
			return getRuleContext(IfDefinitionContext.class,0);
		}
		public LoopDefinitionContext loopDefinition() {
			return getRuleContext(LoopDefinitionContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); varDeclaration();
				setState(65); match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); expression(0);
				setState(68); match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70); assignment();
				setState(71); match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73); funDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74); loopDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75); ifDefinition();
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
		enterRule(_localctx, 6, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(LET);
			setState(79); parameterGroup();
			setState(82);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(80); match(ASSIGN);
				setState(81); constant();
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
		public TerminalNode ASSIGN() { return getToken(P2CParser.ASSIGN, 0); }
		public TerminalNode LEFT_SQ_BRACKET() { return getToken(P2CParser.LEFT_SQ_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INTEGER_CONSTANT() { return getToken(P2CParser.INTEGER_CONSTANT, 0); }
		public TerminalNode IDENT() { return getToken(P2CParser.IDENT, 0); }
		public TerminalNode RIGHT_SQ_BRACKET() { return getToken(P2CParser.RIGHT_SQ_BRACKET, 0); }
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
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(IDENT);
			setState(88);
			_la = _input.LA(1);
			if (_la==LEFT_SQ_BRACKET) {
				{
				setState(85); match(LEFT_SQ_BRACKET);
				setState(86); match(INTEGER_CONSTANT);
				setState(87); match(RIGHT_SQ_BRACKET);
				}
			}

			setState(90); match(ASSIGN);
			setState(91); expression(0);
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
		enterRule(_localctx, 10, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); identifier();
			setState(94); match(COLON);
			setState(95); type();
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
		enterRule(_localctx, 12, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(IDENT);
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
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(99); array();
				}
			}

			setState(102); primitiveType();
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
		enterRule(_localctx, 16, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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
		public TerminalNode ARRAY() { return getToken(P2CParser.ARRAY, 0); }
		public TerminalNode OF() { return getToken(P2CParser.OF, 0); }
		public TerminalNode LEFT_SQ_BRACKET() { return getToken(P2CParser.LEFT_SQ_BRACKET, 0); }
		public TerminalNode INTEGER_CONSTANT() { return getToken(P2CParser.INTEGER_CONSTANT, 0); }
		public TerminalNode RIGHT_SQ_BRACKET() { return getToken(P2CParser.RIGHT_SQ_BRACKET, 0); }
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
		enterRule(_localctx, 18, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(ARRAY);
			setState(107); match(LEFT_SQ_BRACKET);
			setState(108); match(INTEGER_CONSTANT);
			setState(109); match(RIGHT_SQ_BRACKET);
			setState(110); match(OF);
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
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(112); match(T__0);
					}
				}

				setState(115); match(INTEGER_CONSTANT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(116); match(T__0);
					}
				}

				setState(119); match(FLOATING_CONSTANT);
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
			setState(122); match(IF);
			setState(123); match(LEFT_BRACKET);
			setState(124); expression(0);
			setState(125); match(RIGHT_BRACKET);
			setState(126); match(DO);
			setState(127); blockWithoutReturn();
			setState(128); match(DONE);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(129); match(ELSIF);
				setState(130); match(LEFT_BRACKET);
				setState(131); expression(0);
				setState(132); match(RIGHT_BRACKET);
				setState(133); match(DO);
				setState(134); blockWithoutReturn();
				setState(135); match(DONE);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(142); match(ELSE);
				setState(143); match(DO);
				setState(144); blockWithoutReturn();
				setState(145); match(DONE);
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
			setState(169);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(149); match(WHILE);
				setState(150); match(LEFT_BRACKET);
				setState(151); expression(0);
				setState(152); match(RIGHT_BRACKET);
				setState(153); match(DO);
				setState(154); blockWithoutReturn();
				setState(155); match(DONE);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); match(FOR);
				setState(158); match(LEFT_BRACKET);
				setState(159); assignment();
				setState(160); match(SEMICOLON);
				setState(161); expression(0);
				setState(162); match(SEMICOLON);
				setState(163); assignment();
				setState(164); match(RIGHT_BRACKET);
				setState(165); match(DO);
				setState(166); blockWithoutReturn();
				setState(167); match(DONE);
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
			setState(175);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				{
				setState(172); match(EXCLAMATION);
				setState(173); expression(3);
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
				setState(174); atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
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
					setState(177);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(178); operators();
					setState(179); expression(3);
					}
					} 
				}
				setState(185);
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
			setState(186);
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
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188); match(LEFT_BRACKET);
				setState(189); expression(0);
				setState(190); match(RIGHT_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192); constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193); funDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
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
				setState(195); match(IDENT);
				setState(199);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(196); match(LEFT_SQ_BRACKET);
					setState(197); match(INTEGER_CONSTANT);
					setState(198); match(RIGHT_SQ_BRACKET);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201); match(NULL);
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
			setState(204); match(FUN);
			setState(205); identifier();
			setState(206); match(LEFT_BRACKET);
			setState(208);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(207); parameterList();
				}
			}

			setState(210); match(RIGHT_BRACKET);
			setState(213);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(211); match(ARROW);
				setState(212); resultType();
				}
			}

			setState(215); match(DO);
			setState(216); block();
			setState(217); match(DONE);
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
			setState(219); parameterGroup();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(220); match(COMMA);
				setState(221); parameterGroup();
				}
				}
				setState(226);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); type();
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
			setState(229); identifier();
			setState(230); match(LEFT_BRACKET);
			setState(232);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT_BRACKET) | (1L << EXCLAMATION) | (1L << IDENT) | (1L << FLOATING_CONSTANT) | (1L << INTEGER_CONSTANT))) != 0)) {
				{
				setState(231); argumentList();
				}
			}

			setState(234); match(RIGHT_BRACKET);
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
			setState(236); expression(0);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(237); match(COMMA);
				setState(238); expression(0);
				}
				}
				setState(243);
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
			setState(252);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(244); varDeclaration();
				setState(245); match(SEMICOLON);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(247); assignment();
				setState(248); match(SEMICOLON);
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(250); loopDefinition();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(251); ifDefinition();
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
			setState(254); match(RETURN);
			setState(255); expression(0);
			setState(256); match(SEMICOLON);
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
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << LET) | (1L << IDENT))) != 0)) {
				{
				{
				setState(258); blockElement();
				}
				}
				setState(263);
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
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << LET) | (1L << IDENT))) != 0)) {
				{
				{
				setState(264); blockElement();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270); returnStatement();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u0113\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\5\3\5\3\5"+
		"\3\5\5\5U\n\5\3\6\3\6\3\6\3\6\5\6[\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\5\tg\n\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\5"+
		"\ft\n\f\3\f\3\f\5\fx\n\f\3\f\5\f{\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u008c\n\r\f\r\16\r\u008f\13\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u0096\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ac\n\16"+
		"\3\17\3\17\3\17\3\17\5\17\u00b2\n\17\3\17\3\17\3\17\3\17\7\17\u00b8\n"+
		"\17\f\17\16\17\u00bb\13\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00ca\n\21\3\21\5\21\u00cd\n\21\3\22\3\22\3"+
		"\22\3\22\5\22\u00d3\n\22\3\22\3\22\3\22\5\22\u00d8\n\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\7\23\u00e1\n\23\f\23\16\23\u00e4\13\23\3\24\3\24"+
		"\3\25\3\25\3\25\5\25\u00eb\n\25\3\25\3\25\3\26\3\26\3\26\7\26\u00f2\n"+
		"\26\f\26\16\26\u00f5\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u00ff\n\27\3\30\3\30\3\30\3\30\3\31\7\31\u0106\n\31\f\31\16\31\u0109"+
		"\13\31\3\32\7\32\u010c\n\32\f\32\16\32\u010f\13\32\3\32\3\32\3\32\2\3"+
		"\34\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\5\3\2\4"+
		"\n\3\2 $\3\2\f\r\u011b\2\64\3\2\2\2\4?\3\2\2\2\6N\3\2\2\2\bP\3\2\2\2\n"+
		"V\3\2\2\2\f_\3\2\2\2\16c\3\2\2\2\20f\3\2\2\2\22j\3\2\2\2\24l\3\2\2\2\26"+
		"z\3\2\2\2\30|\3\2\2\2\32\u00ab\3\2\2\2\34\u00b1\3\2\2\2\36\u00bc\3\2\2"+
		"\2 \u00cc\3\2\2\2\"\u00ce\3\2\2\2$\u00dd\3\2\2\2&\u00e5\3\2\2\2(\u00e7"+
		"\3\2\2\2*\u00ee\3\2\2\2,\u00fe\3\2\2\2.\u0100\3\2\2\2\60\u0107\3\2\2\2"+
		"\62\u010d\3\2\2\2\64\65\5\4\3\2\65\66\7\22\2\2\66\67\5\60\31\2\678\7\23"+
		"\2\28\3\3\2\2\29:\5\b\5\2:;\7)\2\2;>\3\2\2\2<>\5\"\22\2=9\3\2\2\2=<\3"+
		"\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\5\3\2\2\2A?\3\2\2\2BC\5\b\5\2CD"+
		"\7)\2\2DO\3\2\2\2EF\5\34\17\2FG\7)\2\2GO\3\2\2\2HI\5\n\6\2IJ\7)\2\2JO"+
		"\3\2\2\2KO\5\"\22\2LO\5\32\16\2MO\5\30\r\2NB\3\2\2\2NE\3\2\2\2NH\3\2\2"+
		"\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\7\3\2\2\2PQ\7\27\2\2QT\5\f\7\2RS\7\37"+
		"\2\2SU\5\26\f\2TR\3\2\2\2TU\3\2\2\2U\t\3\2\2\2VZ\7*\2\2WX\7\33\2\2XY\7"+
		",\2\2Y[\7\34\2\2ZW\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\37\2\2]^\5\34\17"+
		"\2^\13\3\2\2\2_`\5\16\b\2`a\7\'\2\2ab\5\20\t\2b\r\3\2\2\2cd\7*\2\2d\17"+
		"\3\2\2\2eg\5\24\13\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\5\22\n\2i\21\3\2"+
		"\2\2jk\t\2\2\2k\23\3\2\2\2lm\7\31\2\2mn\7\33\2\2no\7,\2\2op\7\34\2\2p"+
		"q\7\30\2\2q\25\3\2\2\2rt\7\3\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2u{\7,\2"+
		"\2vx\7\3\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\7+\2\2zs\3\2\2\2zw\3\2\2"+
		"\2{\27\3\2\2\2|}\7\16\2\2}~\7\35\2\2~\177\5\34\17\2\177\u0080\7\36\2\2"+
		"\u0080\u0081\7\22\2\2\u0081\u0082\5\60\31\2\u0082\u008d\7\23\2\2\u0083"+
		"\u0084\7\17\2\2\u0084\u0085\7\35\2\2\u0085\u0086\5\34\17\2\u0086\u0087"+
		"\7\36\2\2\u0087\u0088\7\22\2\2\u0088\u0089\5\60\31\2\u0089\u008a\7\23"+
		"\2\2\u008a\u008c\3\2\2\2\u008b\u0083\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0095\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u0090\u0091\7\20\2\2\u0091\u0092\7\22\2\2\u0092\u0093\5\60\31\2\u0093"+
		"\u0094\7\23\2\2\u0094\u0096\3\2\2\2\u0095\u0090\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0096\31\3\2\2\2\u0097\u0098\7\21\2\2\u0098\u0099\7\35\2\2\u0099"+
		"\u009a\5\34\17\2\u009a\u009b\7\36\2\2\u009b\u009c\7\22\2\2\u009c\u009d"+
		"\5\60\31\2\u009d\u009e\7\23\2\2\u009e\u00ac\3\2\2\2\u009f\u00a0\7\24\2"+
		"\2\u00a0\u00a1\7\35\2\2\u00a1\u00a2\5\n\6\2\u00a2\u00a3\7)\2\2\u00a3\u00a4"+
		"\5\34\17\2\u00a4\u00a5\7)\2\2\u00a5\u00a6\5\n\6\2\u00a6\u00a7\7\36\2\2"+
		"\u00a7\u00a8\7\22\2\2\u00a8\u00a9\5\60\31\2\u00a9\u00aa\7\23\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u0097\3\2\2\2\u00ab\u009f\3\2\2\2\u00ac\33\3\2\2"+
		"\2\u00ad\u00ae\b\17\1\2\u00ae\u00af\7%\2\2\u00af\u00b2\5\34\17\5\u00b0"+
		"\u00b2\5 \21\2\u00b1\u00ad\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b9\3\2"+
		"\2\2\u00b3\u00b4\f\4\2\2\u00b4\u00b5\5\36\20\2\u00b5\u00b6\5\34\17\5\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\35\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd"+
		"\t\3\2\2\u00bd\37\3\2\2\2\u00be\u00bf\7\35\2\2\u00bf\u00c0\5\34\17\2\u00c0"+
		"\u00c1\7\36\2\2\u00c1\u00cd\3\2\2\2\u00c2\u00cd\5\26\f\2\u00c3\u00cd\5"+
		"(\25\2\u00c4\u00cd\t\4\2\2\u00c5\u00c9\7*\2\2\u00c6\u00c7\7\33\2\2\u00c7"+
		"\u00c8\7,\2\2\u00c8\u00ca\7\34\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00cd\7\13\2\2\u00cc\u00be\3\2\2\2\u00cc"+
		"\u00c2\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c5\3\2"+
		"\2\2\u00cc\u00cb\3\2\2\2\u00cd!\3\2\2\2\u00ce\u00cf\7\25\2\2\u00cf\u00d0"+
		"\5\16\b\2\u00d0\u00d2\7\35\2\2\u00d1\u00d3\5$\23\2\u00d2\u00d1\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\7\36\2\2\u00d5\u00d6"+
		"\7&\2\2\u00d6\u00d8\5&\24\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\7\22\2\2\u00da\u00db\5\62\32\2\u00db\u00dc"+
		"\7\23\2\2\u00dc#\3\2\2\2\u00dd\u00e2\5\f\7\2\u00de\u00df\7(\2\2\u00df"+
		"\u00e1\5\f\7\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3%\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6"+
		"\5\20\t\2\u00e6\'\3\2\2\2\u00e7\u00e8\5\16\b\2\u00e8\u00ea\7\35\2\2\u00e9"+
		"\u00eb\5*\26\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ed\7\36\2\2\u00ed)\3\2\2\2\u00ee\u00f3\5\34\17\2\u00ef\u00f0"+
		"\7(\2\2\u00f0\u00f2\5\34\17\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2"+
		"\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4+\3\2\2\2\u00f5\u00f3\3"+
		"\2\2\2\u00f6\u00f7\5\b\5\2\u00f7\u00f8\7)\2\2\u00f8\u00ff\3\2\2\2\u00f9"+
		"\u00fa\5\n\6\2\u00fa\u00fb\7)\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00ff\5\32"+
		"\16\2\u00fd\u00ff\5\30\r\2\u00fe\u00f6\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff-\3\2\2\2\u0100\u0101\7\26\2\2"+
		"\u0101\u0102\5\34\17\2\u0102\u0103\7)\2\2\u0103/\3\2\2\2\u0104\u0106\5"+
		",\27\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\61\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\5,\27"+
		"\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\5.\30\2\u0111"+
		"\63\3\2\2\2\32=?NTZfswz\u008d\u0095\u00ab\u00b1\u00b9\u00c9\u00cc\u00d2"+
		"\u00d7\u00e2\u00ea\u00f3\u00fe\u0107\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}