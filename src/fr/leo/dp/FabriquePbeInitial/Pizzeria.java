package fr.leo.dp.FabriquePbeInitial;

public class Pizzeria {

	public Pizza commanderPizza(String type) {
		Pizza pizza = null;

		if (type.equals("fromage"))
			pizza = new PizzaFromage();
		if (type.equals("grecque"))
			pizza = new PizzaGrecque();
		if (type.equals("poivron"))
			pizza = new PizzaPoivron();

		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();
		return pizza;
	}
}
