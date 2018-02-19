package jminusminus;

import static jminusminus.CLConstants.*;

public class JBitwiseCompOp extends JUnaryExpression {

	public JBitwiseCompOp(int line, JExpression arg) {
		super(line, "~", arg);
	}

	@Override
	public JExpression analyze(Context context) {
		arg = arg.analyze(context);
		arg.type().mustMatchExpected(line(), Type.INT);
		type = Type.INT;
		return this;
	}

	@Override
	public void codegen(CLEmitter output) {
		arg.codegen(output);
		output.addNoArgInstruction(INEG);
		output.addNoArgInstruction(ICONST_M1);
		output.addNoArgInstruction(IADD);		
	}

}
