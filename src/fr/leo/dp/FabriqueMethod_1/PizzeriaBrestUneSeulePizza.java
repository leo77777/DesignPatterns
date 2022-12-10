package fr.leo.dp.FabriqueMethod_1;

public class PizzeriaBrestUneSeulePizza extends PizzeriaUneSeulePizza {

	@Override
	protected Pizza creerPizza() {
		Pizza pizza = null;
		pizza = new PizzaUneSeulePizzaBrest();
		return pizza;
	}

}
