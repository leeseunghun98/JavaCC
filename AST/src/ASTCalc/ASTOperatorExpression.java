package ASTCalc;

public class ASTOperatorExpression extends ASTExpression {
	private ASTExpression left_;
	private ASTExpression right_;
	private int operator_;
	
	public static final int ERROR = 0;
	public static final int PLUS = 1;
	public static final int MINUS = 2;
	public static final int MULTIPLY = 3;
	public static final int DIVIDE = 4;
	
	// constructors
	public ASTOperatorExpression(ASTExpression left, ASTExpression right, int operator) {
		left_ = left;
		right_ = right;
		operator_ = operator;
	}
	
	public ASTOperatorExpression(ASTExpression left, ASTExpression right, String operator) {
		left_ = left;
		right_ = right;
		
		if (operator.compareTo("+") == 0)
			operator_ = PLUS;
		else if (operator.compareTo("-") == 0)
			operator_ = MINUS;
		else if (operator.compareTo("*") == 0)
			operator_ = MULTIPLY;
		else if (operator.compareTo("/") == 0)
			operator_ = DIVIDE;
		else 
			operator_ = ERROR;
	}
	
	public int eval() {
		int leftValue = left().eval();
		int rightValue = right().eval();
		
		if (operator() == PLUS) 
			return leftValue + rightValue;
		else if (operator() == MINUS)
			return leftValue - rightValue;
		else if (operator() == MULTIPLY)
			return leftValue * rightValue;
		else if (operator() == DIVIDE)
			return leftValue / rightValue;
		else
			return 0;
	}
	
	public void print(int indent_level) {
		for(int i = 0; i < indent_level - 1; i++) {
			System.out.print("    ");
		}
		if (indent_level > 0) {
			System.out.print("|__ ");
		}
		if (operator_ == 1)
			System.out.println("+");
		else if (operator_ == 2)
			System.out.println("-");
		else if (operator_ == 3)
			System.out.println("*");
		else if (operator_ == 4)
			System.out.println("/");
		else 
			System.out.println("ERROR");
		left_.print(indent_level + 1);
		right_.print(indent_level + 1);
	}
	
	// getter
	public ASTExpression left() {
		return left_;
	}
	
	public ASTExpression right() {
		return right_;
	}
	
	public int operator() {
		return operator_;
	}
}
