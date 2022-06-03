package ASTCalc;

public abstract class ASTExpression {
	abstract public int eval();
	abstract protected void print(int indent_level);
//	abstract public void do_something_else();
	
	public void print() {
		print(0);
	}
	protected void printIndent(int indent_level) {
		String indentation = "     ";
		
		for (int i = 0; i < indent_level; i++)
			System.out.print(indentation);
	}
}