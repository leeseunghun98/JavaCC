package CalcVisitor;

public interface ASTVisitor { // visitor side to define visit methods
	// visit methods
	public Object VisitIntegerLiteral(ASTIntegerLiteral literal);
	public Object VisitOperatorExpression(ASTOperatorExpression opexp);
}
