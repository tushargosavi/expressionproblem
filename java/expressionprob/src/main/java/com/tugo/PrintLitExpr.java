package com.tugo;

public class PrintLitExpr implements IPrint {
	int val;
	PrintLitExpr(int n) {
		this.val = n;
	}
	public String print() {
		return new Integer(val).toString();
	}
}
