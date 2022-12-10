package fr.leo.dp.FabriqueSimple_1;

public class FabriqueSimple {

	public static Pizza creerPizza(String type) {
		Pizza pizza = null;
		if (type.equals("fromage"))
			pizza = new PizzaFromage();
		if (type.equals("grecque"))
			pizza = new PizzaGrecque();
		if (type.equals("poivron"))
			pizza = new PizzaPoivron();
		if (type.equals("mozarella"))
			pizza = new PizzaMozarella();
		return pizza;
	}

}
