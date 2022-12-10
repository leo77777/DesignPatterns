package fr.leo.dp.Composite;

public class Divider extends BinrayExpression {

	public Divider(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public Double getValue() {
		return this.left.getValue() / this.right.getValue();
	}

}
