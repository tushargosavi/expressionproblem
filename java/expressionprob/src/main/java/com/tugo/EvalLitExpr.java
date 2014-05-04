package com.tugo;

public class EvalLitExpr implements Eval {
	int val;
	EvalLitExpr(int n) {
		this.val = n;
	}
	
	public int eval() {
		return this.val;
	}

}
