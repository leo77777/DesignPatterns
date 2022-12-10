package fr.leo.dp.FabriqueAbstaiteAvecClasseAbstraite;

public abstract class Pizzeria {

	public void commanderPizza(String type) {

		Pizza pizza = creerPizza(type);
		if (pizza != null) {
			pizza.preparer();
			pizza.cuire();
			pizza.couper();
			pizza.emballer();
			pizza.presenterGarnitures();
		} else
			System.out.println("Ce genre de pizza n'existe pas !");
	}

	protected abstract Pizza creerPizza(String type);
}
