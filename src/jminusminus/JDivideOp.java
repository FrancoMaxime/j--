package jminusminus;

import static jminusminus.CLConstants.*;
/**
* The AST node for a division (/) expression.
*/
class JDivideOp extends JBinaryExpression{
	/**
	* Construct an AST node for a division expression
	* given its line number, and the lhs and rhs operands.
	*
	* @param line line in which the division expression
	* occurs in the source file.
	* @param lhs lhs operand.
	* @param rhs rhs operand.
	*/
	public JDivideOp(int line, JExpression lhs,	JExpression rhs){
		super(line, "/", lhs, rhs);
	}
	
	/**
	* Analyzing the / operation involves analyzing its operands,
	* checking types, and determining the result type.
	*
	* @param context in which names are resolved.
	* @return the analyzed (and possibly rewritten) AST subtree.
	*/
	public JExpression analyze(Context context){
		lhs = (JExpression) lhs.analyze(context);
		rhs = (JExpression) rhs.analyze(context);
		lhs.type().mustMatchExpected(line(), Type.INT);
		rhs.type().mustMatchExpected(line(), Type.INT);
		type = Type.INT;
		return this;
	}
	
	/**
	* Generating code for the / operation involves generating code
	* for the two operands, and then the division instruction.
	*
	* @param output the code emitter (basically an abstraction for
	* producing the .class file).
	*/
	public void codegen(CLEmitter output){
		lhs.codegen(output);
		rhs.codegen(output);
		output.addNoArgInstruction(IDIV);
	}
}