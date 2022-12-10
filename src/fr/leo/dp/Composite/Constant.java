package fr.leo.dp.Composite;

public class Constant implements Expression {

	private double value;

	public Constant(double value) {
		this.value = value;
	}

	@Override
	public Double getValue() {
		return this.value;
	}

}
