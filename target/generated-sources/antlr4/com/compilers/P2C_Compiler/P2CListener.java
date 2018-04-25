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
	 * Enter a parse tree produced by {@link P2CParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull P2CParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull P2CParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull P2CParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull P2CParser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link P2CParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull P2CParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull P2CParser.TermContext ctx);
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
	 * Enter a parse tree produced by {@link P2CParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull P2CParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull P2CParser.FactorContext ctx);
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
	 * Enter a parse tree produced by {@link P2CParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull P2CParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull P2CParser.VarDeclarationContext ctx);
}