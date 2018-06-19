// Generated from P2C.g4 by ANTLR 4.4
package com.compilers.P2C_Compiler;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link P2CParser}.
 */
public interface P2CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(@NotNull P2CParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(@NotNull P2CParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(@NotNull P2CParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(@NotNull P2CParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#ifDefinition}.
	 * @param ctx the parse tree
	 */
	void enterIfDefinition(@NotNull P2CParser.IfDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#ifDefinition}.
	 * @param ctx the parse tree
	 */
	void exitIfDefinition(@NotNull P2CParser.IfDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link P2CParser#loopDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFor(@NotNull P2CParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link P2CParser#loopDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFor(@NotNull P2CParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(@NotNull P2CParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(@NotNull P2CParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull P2CParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull P2CParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link P2CParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull P2CParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link P2CParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull P2CParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(@NotNull P2CParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(@NotNull P2CParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull P2CParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull P2CParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull P2CParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull P2CParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link P2CParser#loopDefinition}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull P2CParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link P2CParser#loopDefinition}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull P2CParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#blockWithoutReturn}.
	 * @param ctx the parse tree
	 */
	void enterBlockWithoutReturn(@NotNull P2CParser.BlockWithoutReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#blockWithoutReturn}.
	 * @param ctx the parse tree
	 */
	void exitBlockWithoutReturn(@NotNull P2CParser.BlockWithoutReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull P2CParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull P2CParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull P2CParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull P2CParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationElement}
	 * labeled alternative in {@link P2CParser#blockElement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationElement(@NotNull P2CParser.DeclarationElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationElement}
	 * labeled alternative in {@link P2CParser#blockElement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationElement(@NotNull P2CParser.DeclarationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull P2CParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull P2CParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floating}
	 * labeled alternative in {@link P2CParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterFloating(@NotNull P2CParser.FloatingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floating}
	 * labeled alternative in {@link P2CParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitFloating(@NotNull P2CParser.FloatingContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull P2CParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull P2CParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopELement}
	 * labeled alternative in {@link P2CParser#blockElement}.
	 * @param ctx the parse tree
	 */
	void enterLoopELement(@NotNull P2CParser.LoopELementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopELement}
	 * labeled alternative in {@link P2CParser#blockElement}.
	 * @param ctx the parse tree
	 */
	void exitLoopELement(@NotNull P2CParser.LoopELementContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull P2CParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull P2CParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(@NotNull P2CParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(@NotNull P2CParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull P2CParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull P2CParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull P2CParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull P2CParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull P2CParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull P2CParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionAtom}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAtom(@NotNull P2CParser.FunctionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionAtom}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAtom(@NotNull P2CParser.FunctionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull P2CParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull P2CParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(@NotNull P2CParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(@NotNull P2CParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(@NotNull P2CParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(@NotNull P2CParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(@NotNull P2CParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(@NotNull P2CParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull P2CParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull P2CParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantAtom}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterConstantAtom(@NotNull P2CParser.ConstantAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantAtom}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitConstantAtom(@NotNull P2CParser.ConstantAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentElement}
	 * labeled alternative in {@link P2CParser#blockElement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentElement(@NotNull P2CParser.AssignmentElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentElement}
	 * labeled alternative in {@link P2CParser#blockElement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentElement(@NotNull P2CParser.AssignmentElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull P2CParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull P2CParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#funDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunDesignator(@NotNull P2CParser.FunDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#funDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunDesignator(@NotNull P2CParser.FunDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#funDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunDefinition(@NotNull P2CParser.FunDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#funDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunDefinition(@NotNull P2CParser.FunDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(@NotNull P2CParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(@NotNull P2CParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull P2CParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull P2CParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElement}
	 * labeled alternative in {@link P2CParser#blockElement}.
	 * @param ctx the parse tree
	 */
	void enterIfElement(@NotNull P2CParser.IfElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElement}
	 * labeled alternative in {@link P2CParser#blockElement}.
	 * @param ctx the parse tree
	 */
	void exitIfElement(@NotNull P2CParser.IfElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull P2CParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull P2CParser.AndExprContext ctx);
}