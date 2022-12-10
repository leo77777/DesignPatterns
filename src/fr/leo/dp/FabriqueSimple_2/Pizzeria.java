package fr.leo.dp.FabriqueSimple_2;

public class Pizzeria {
	FabriqueSimple fabrique;

	public Pizzeria(FabriqueSimple fabrique) {
		this.fabrique = fabrique;
	}

	public void commanderPizza(String type) {

		Pizza pizza = fabrique.creerPizza(type);
		if (pizza != null) {
			pizza.preparer();
			pizza.cuire();
			pizza.couper();
			pizza.emballer();
		} else
			System.out.println("Nou ne servons ce type de pizza !");
	}
}
