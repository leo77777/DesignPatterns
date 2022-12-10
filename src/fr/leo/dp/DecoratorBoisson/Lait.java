package fr.leo.dp.DecoratorBoisson;

public class Lait extends DecorateurBoisson {

	public Lait(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " au lait";
	}

	@Override
	public double cout() {
		return 10 + boisson.cout();
	}
}
