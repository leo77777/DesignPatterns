package fr.leo.dp.Composite;

public class Subtracter extends BinrayExpression {


	public Subtracter(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public Double getValue() {
		return this.left.getValue() - this.right.getValue();
	}

}
