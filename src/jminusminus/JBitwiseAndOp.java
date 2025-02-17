package jminusminus;

import static jminusminus.CLConstants.*;

public class JBitwiseAndOp extends JBinaryExpression {
	
	public JBitwiseAndOp(int line, JExpression lhs,JExpression rhs) {
		super(line, "&", lhs, rhs);
	}

	@Override
	public JExpression analyze(Context context) {
		lhs = (JExpression) lhs.analyze(context);
		rhs = (JExpression) rhs.analyze(context);
		lhs.type().mustMatchExpected(line(), Type.INT);
		rhs.type().mustMatchExpected(line(), Type.INT);
		type = Type.INT;
		return this;
	}

	@Override
	public void codegen(CLEmitter output) {
		lhs.codegen(output);
		rhs.codegen(output);
		output.addNoArgInstruction(IAND);
	}

}
