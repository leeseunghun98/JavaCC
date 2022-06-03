package ASTCalc;

public abstract class ASTExpression {
	abstract public int eval();
	abstract public void print(int indent_level);
}