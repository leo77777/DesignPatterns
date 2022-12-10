package fr.leo.dp.DecoratorBoisson;
public class Sumatra extends Boisson {
	
	public Sumatra() {
		Description  = "Sumatra";
	}
	
	@Override
	public double cout() {
		return 6;
	}
}
