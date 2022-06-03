package CalcVisitor;

public abstract class ASTExpression {  // element (data)
	public abstract Object accept(ASTVisitor v);
	
	/*
	abstract public int eval();
	abstract protected void print(int indent_level);

	public void print() {
		print(0);
	}
	
	protected void printIndent(int indent_level) {
		String indentation = "    ";
		
		for (int i = 0; i < indent_level; i++)
			System.out.print(indentation);
	}
	*/
}