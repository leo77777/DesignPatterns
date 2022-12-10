package fr.leo.dp.DecoratorBoisson;
public class Colombia extends Boisson {
	
	public Colombia() {
		Description = "Colombia";
	}

	@Override
	public double cout() {
		return 7;
	}
}
