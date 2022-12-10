package fr.leo.dp.DecoratorBoisson;

public class Deca extends Boisson {

	public Deca() {
		Description = "Deca";
	}

	@Override
	public double cout() {
		return 5;
	}
}
