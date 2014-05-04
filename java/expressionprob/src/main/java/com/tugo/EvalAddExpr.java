package com.tugo;

public class EvalAddExpr implements Eval {
	Eval lhs, rhs;
	EvalAddExpr(Eval lhs, Eval rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	public int eval() {
		return lhs.eval() + rhs.eval();
	}
}
