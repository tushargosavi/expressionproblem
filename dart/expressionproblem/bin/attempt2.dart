
abstract class Expr {
  accept(Visitor v);
}

abstract class Visitor {
  visitLit(Lit e);
  VisitAdd(Add e);
}

class Lit extends Expr {
  int value;
  Lit(this.value);
  
  accept(Visitor v) => v.visitLit(this);
}

class Add extends Expr {
  Expr lhs, rhs;
  Add(this.lhs, this.rhs);
  
  @override
  accept(Visitor v) => v.VisitAdd(this);
}

class EvalVisitor implements Visitor {
  
  @override
  VisitAdd(Add e) => e.lhs.accept(this) + e.rhs.accept(this);

  @override
  visitLit(Lit e) => e.value;
}

// Can't add new Datatype and its break all visitor implementations.

void main() {
  Expr expr = new Add(new Lit(1), new Lit(2));
  Visitor v = new EvalVisitor();
  print(expr.accept(v));
  print("Hello World");
}