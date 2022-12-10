package fr.leo.dp.Composite;

abstract public class BinrayExpression implements Expression {

	protected Expression left;
	protected Expression right;

	public BinrayExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
}
