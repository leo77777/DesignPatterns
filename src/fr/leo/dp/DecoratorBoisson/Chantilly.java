package fr.leo.dp.DecoratorBoisson;

public class Chantilly extends DecorateurBoisson {

	public Chantilly(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " à la Chantilly";
	}

	@Override
	public double cout() {
		return 1 + boisson.cout();
	}
}
