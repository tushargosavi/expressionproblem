abstract class ExpAlg<E> {
  E lit(int);
  E add(E lhs, E rhs);
}

abstract class IPrint {
  String print();
}

// Add a operations.
class PrintExp implements ExpAlg<IPrint> {
  
  @override
  IPrint add(IPrint lhs, IPrint rhs) => new PrintAdd(lhs, rhs);

  @override
  IPrint lit(int n) => new PrintLit(n);
}

class PrintAdd implements IPrint {
  IPrint rhs, lhs;
  PrintAdd(this.lhs, this.rhs);
  
  @override
  String print() => this.lhs.print() + " + " + this.rhs.print();
}

class PrintLit implements IPrint {
  int val;
  PrintLit(this.val);
  

  @override
  String print() => this.val.toString();
}

// Add another operation.
abstract class IEval {
  int eval();
}

class EvalExpr implements ExpAlg<IEval> {
  
  @override
  IEval add(IEval lhs, IEval rhs) => new AddEval(lhs, rhs);

  @override
  IEval lit(int n) => new LitEval(n);
}

class AddEval implements IEval {
  IEval lhs, rhs;
  AddEval(this.lhs, this.rhs);
  
  int eval() => lhs.eval() + rhs.eval();
}

class LitEval implements IEval {
  int val;
  LitEval(this.val);
  
  int eval() => val;
}

abstract class MultAlg<E> extends ExpAlg<E> {
  E mult(E lhs, E rhs);
}

class PrintMultExp extends PrintExp implements MultAlg<IPrint> {
  IPrint mult(IPrint lhs, IPrint rhs) => new PrintMult(lhs, rhs);
}

class PrintMult implements IPrint {
  IPrint lhs, rhs;
  PrintMult(this.lhs, this.rhs);
  
  @override
  String print() => lhs.print() + " * " + rhs.print();
}

makeExpr(MultAlg a) => a.mult(a.lit(2), a.add(a.lit(10), a.lit(20)));

void main() {
  IPrint prn = makeExpr(new PrintMultExp());
  print(prn.print());
}

