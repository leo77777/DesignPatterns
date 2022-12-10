package fr.leo.dp.DecoratorBoisson;
public class Espresso extends Boisson {
	
	public Espresso() {
		Description = "Espresso";
	}

	@Override
	public double cout() {
		return 7;
	}
}
