package com.tugo;

public class PrintAddExpr implements IPrint {
	IPrint lhs, rhs;
	PrintAddExpr(IPrint lhs, IPrint rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	public String print() {
		return "("  + lhs.print() + " + " + rhs.print() + ")" ;
	}
}
