package fr.leo.dp.Composite;

public class Adder extends BinrayExpression {

	public Adder(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public Double getValue() {
		return this.left.getValue() + this.right.getValue();
	}

}
