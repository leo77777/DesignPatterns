package fr.leo.dp.FabriqueMethod_1;

public abstract class PizzeriaUneSeulePizza {

	public void commanderPizza() {

		Pizza pizza = creerPizza();
		if (pizza != null) {
			pizza.preparer();
			pizza.cuire();
			pizza.couper();
			pizza.emballer();
		} else
			System.out.println("Ce genre de pizza n'existe pas !");
	}

	protected abstract Pizza creerPizza();
}
