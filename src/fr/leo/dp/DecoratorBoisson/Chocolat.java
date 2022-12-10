package fr.leo.dp.DecoratorBoisson;


public class Chocolat extends DecorateurBoisson {

	public Chocolat(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " au chocolat";
	}

	@Override
	public double cout() {
		return 12 + boisson.cout();
	}
}
