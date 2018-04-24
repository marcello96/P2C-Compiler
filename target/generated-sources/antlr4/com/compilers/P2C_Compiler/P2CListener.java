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
	 * Enter a parse tree produced by {@link P2CParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(@NotNull P2CParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(@NotNull P2CParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2CParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(@NotNull P2CParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2CParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(@NotNull P2CParser.TextContext ctx);
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