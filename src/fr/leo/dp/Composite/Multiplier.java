package fr.leo.dp.Composite;

public class Multiplier extends BinrayExpression {

	public Multiplier(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public Double getValue() {
		return this.left.getValue() * this.right.getValue();
	}

}
