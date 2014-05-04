package com.tugo;

public class EvalExpr implements ExprAlg<Eval> {

	public Eval add(Eval lhs, Eval rhs) {
		return new EvalAddExpr(lhs, rhs);
	}

	public Eval lit(int n) {
		return new EvalLitExpr(n);
	}

}
