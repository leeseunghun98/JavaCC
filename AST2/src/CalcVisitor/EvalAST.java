package CalcVisitor;

public class EvalAST implements ASTVisitor {

	public Object VisitIntegerLiteral(ASTIntegerLiteral literal) {
		return Integer.valueOf(literal.value());
	}
	
	public Object VisitOperatorExpression(ASTOperatorExpression opexp) {
		int leftValue = ((Integer) opexp.left().accept(this)).intValue();
		int rightValue = ((Integer) opexp.right().accept(this)).intValue();
		
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
