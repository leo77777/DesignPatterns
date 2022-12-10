package fr.leo.dp.Composite;

public class Variable implements Expression {

	private double value;

	@Override
	public Double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
