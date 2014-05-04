package com.tugo;

public class MultExprImpl extends EvalExpr implements MultExprAlg<Eval> {

	public Eval mult(Eval lhs, Eval rhs) {
		return new EvalMultExpr(lhs, rhs);
	}
}
