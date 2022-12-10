package fr.leo.dp.DecoratorBoisson;
public abstract class Boisson {
	
	protected String Description;
	
	public abstract double cout();

	public String getDescription() {
		return Description;
	}
}
