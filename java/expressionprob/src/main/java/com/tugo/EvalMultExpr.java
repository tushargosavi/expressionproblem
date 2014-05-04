package com.tugo;

public class EvalMultExpr implements Eval {
	Eval lhs, rhs;
	EvalMultExpr(Eval lhs, Eval rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	public int eval() {
		return lhs.eval() * rhs.eval();
	}
}
