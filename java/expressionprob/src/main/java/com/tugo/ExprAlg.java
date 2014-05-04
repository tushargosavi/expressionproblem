package com.tugo;

public interface ExprAlg<E> {
	E add(E lhs, E rhs);
	E lit(int n);
}
