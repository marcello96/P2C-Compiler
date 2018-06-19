// Generated from P2C.g4 by ANTLR 4.4
package com.compilers.P2C_Compiler;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link P2CParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface P2CVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(@NotNull P2CParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(@NotNull P2CParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#ifDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDefinition(@NotNull P2CParser.IfDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link P2CParser#loopDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(@NotNull P2CParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(@NotNull P2CParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull P2CParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link P2CParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull P2CParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(@NotNull P2CParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull P2CParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull P2CParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link P2CParser#loopDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull P2CParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#blockWithoutReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockWithoutReturn(@NotNull P2CParser.BlockWithoutReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull P2CParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(@NotNull P2CParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationElement}
	 * labeled alternative in {@link P2CParser#blockElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationElement(@NotNull P2CParser.DeclarationElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull P2CParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floating}
	 * labeled alternative in {@link P2CParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating(@NotNull P2CParser.FloatingContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull P2CParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopELement}
	 * labeled alternative in {@link P2CParser#blockElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopELement(@NotNull P2CParser.LoopELementContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull P2CParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#resultType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultType(@NotNull P2CParser.ResultTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull P2CParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull P2CParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull P2CParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionAtom}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAtom(@NotNull P2CParser.FunctionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull P2CParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(@NotNull P2CParser.NilAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(@NotNull P2CParser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(@NotNull P2CParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(@NotNull P2CParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantAtom}
	 * labeled alternative in {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantAtom(@NotNull P2CParser.ConstantAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentElement}
	 * labeled alternative in {@link P2CParser#blockElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentElement(@NotNull P2CParser.AssignmentElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(@NotNull P2CParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#funDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDesignator(@NotNull P2CParser.FunDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#funDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDefinition(@NotNull P2CParser.FunDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(@NotNull P2CParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull P2CParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElement}
	 * labeled alternative in {@link P2CParser#blockElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElement(@NotNull P2CParser.IfElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull P2CParser.AndExprContext ctx);
}