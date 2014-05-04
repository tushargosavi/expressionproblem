package com.tugo;

public class App 
{
	static IPrint createPrintExpr(ExprAlg<IPrint> a) {
		return a.add(a.lit(10), a.lit(20));
	}
	
	static Eval createEvalExpr(ExprAlg<Eval> a) {
		return a.add(a.lit(10), a.lit(20));
	}
	
	static IPrint createMultPrintExpr(MultExprAlg<IPrint> a) {
		return a.mult(a.add(a.lit(10), a.lit(20)),
				a.lit(30));
	}
	
	static Eval createMultEvalExpr(MultExprAlg<Eval> a) {
		return a.mult(a.add(a.lit(10), a.lit(20)),
				a.lit(30));
	}
	
    public static void main( String[] args )
    {
        IPrint prn = createPrintExpr(new PrintExpr());
        Eval evl = createEvalExpr(new EvalExpr());
        System.out.println(prn.print());
        System.out.println(evl.eval());
        
        prn = createMultPrintExpr(new MultPrintExpr());
        System.out.println(prn.print());
        evl = createMultEvalExpr(new MultExprImpl());
        System.out.println(evl.eval());
    }
}
