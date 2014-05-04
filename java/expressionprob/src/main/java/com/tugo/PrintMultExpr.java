package com.tugo;

public class PrintMultExpr implements IPrint {
	IPrint lhs, rhs;
	PrintMultExpr(IPrint lhs, IPrint rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	public String print() {
		return "(" + lhs.print() + " * " + rhs.print() + ")";
	}

}
