package fr.leo.dp.FabriqueSimple_1;

public class Pizzeria {

	public void commanderPizza(String type) {

		Pizza pizza = FabriqueSimple.creerPizza(type);
		if (pizza != null) {
			pizza.preparer();
			pizza.cuire();
			pizza.couper();
			pizza.emballer();
		} else
			System.out.println("Ce genre de pizza n'existe pas !");
	}
}
