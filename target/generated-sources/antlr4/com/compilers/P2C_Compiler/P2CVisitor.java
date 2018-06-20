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
	 * Visit a parse tree produced by {@link P2CParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull P2CParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#ifDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDefinition(@NotNull P2CParser.IfDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#loopDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopDefinition(@NotNull P2CParser.LoopDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull P2CParser.ProgramContext ctx);
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
	 * Visit a parse tree produced by {@link P2CParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull P2CParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#globalDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDefinitions(@NotNull P2CParser.GlobalDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull P2CParser.BlockContext ctx);
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
	 * Visit a parse tree produced by {@link P2CParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(@NotNull P2CParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull P2CParser.ExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link P2CParser#blockElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockElement(@NotNull P2CParser.BlockElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(@NotNull P2CParser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(@NotNull P2CParser.VarDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link P2CParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull P2CParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2CParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull P2CParser.AtomContext ctx);
}