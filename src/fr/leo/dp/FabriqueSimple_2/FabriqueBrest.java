package fr.leo.dp.FabriqueSimple_2;

public class FabriqueBrest implements FabriqueSimple {

	@Override
	public Pizza creerPizza(String type) {
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
