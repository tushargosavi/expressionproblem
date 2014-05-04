package com.tugo;

public class PrintExpr implements ExprAlg<IPrint> {

	public IPrint add(IPrint lhs, IPrint rhs) {
		return new PrintAddExpr(lhs, rhs);
	}

	public IPrint lit(int n) {
		return new PrintLitExpr(n);
	}

}
