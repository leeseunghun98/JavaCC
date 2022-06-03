package CalcVisitor;

public class PrintAST implements ASTVisitor {
	private int indent_level;
	private static String[] operatorSymbols_ = {"Error", "+", "-", "*", "/"};
	public Object VisitIntegerLiteral(ASTIntegerLiteral literal) {
		for(int i = 0; i < indent_level - 1; i++) {
			System.out.print("     ");
		}
		if(indent_level > 0) {
			System.out.print("|____");
		}
		System.out.println(literal.value());
		return Integer.valueOf(literal.value());
	}
	
	public Object VisitOperatorExpression(ASTOperatorExpression opexp) {
		for(int i = 0; i < indent_level - 1; i++) {
			System.out.print("     ");
		}
		if(indent_level > 0) {
			System.out.print("|____");
		}
		System.out.println(operatorSymbols_[opexp.operator()]);
		indent_level++;
		int leftValue = ((Integer) opexp.left().accept(this)).intValue();
		int rightValue = ((Integer) opexp.right().accept(this)).intValue();
		indent_level--;
		
		if (opexp.operator() == ASTOperatorExpression.PLUS) 
			return Integer.valueOf(leftValue + rightValue);
		else if (opexp.operator() == ASTOperatorExpression.MINUS)
			return Integer.valueOf(leftValue - rightValue);
		else if (opexp.operator() == ASTOperatorExpression.MULTIPLY)
			return Integer.valueOf(leftValue * rightValue);
		else if (opexp.operator() == ASTOperatorExpression.DIVIDE)
			return Integer.valueOf(leftValue / rightValue);
		else
			return Integer.valueOf(0);
	}
}
