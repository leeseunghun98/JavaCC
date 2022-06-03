package CalcVisitor;

public class ASTIntegerLiteral extends ASTExpression {
	private int value_;
	
	public ASTIntegerLiteral(int value) { // constructor
		value_ = value;
	}
	
	public int value() {	// getter
		return value_;
	}
	
	public void setValue(int value) { // setter
		value_ = value;
	}
	
	public Object accept(ASTVisitor v) {
		return v.VisitIntegerLiteral(this); //callback
	}
	
	/*
	public int eval() {
		return value_;
	}
	
	public void print(int indent_level) {
		printIndent(indent_level);
		System.out.println(value_);
	}
	*/
}
