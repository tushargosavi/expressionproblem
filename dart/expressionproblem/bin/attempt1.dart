abstract class Exp {
  int eval();
}

class Lit implements Exp {
  int value;
  Lit(this.value);
  
  int eval() => this.value;
}

class Add implements Exp {
  Exp left, right;
  Add(this.left, this.right);

  @override
  int eval() => this.left.eval() + this.right.eval();
}

// Can't add new operation and it breaks all implementations.

void main() {
  Exp expr = new Add(new Lit(1), new Lit(2));
  print(expr.eval());
  print("Hello, World!");
}
