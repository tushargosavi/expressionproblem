package com.tugo;

public class MultPrintExpr extends PrintExpr implements MultExprAlg<IPrint> {

	public IPrint mult(IPrint lhs, IPrint rhs) {
		return new PrintMultExpr(lhs, rhs);
	}
	

}
