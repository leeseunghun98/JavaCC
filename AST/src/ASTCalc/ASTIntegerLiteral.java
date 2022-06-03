package ASTCalc;

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
	
	public int eval() {
		return value_;
	}
	
	public void print(int indent_level) {
		for(int i = 0; i < indent_level - 1; i++) {
			System.out.print("    ");
		}
		if (indent_level > 0) {
			System.out.print("|__ ");
		}
		System.out.println(value_);
	}
}
