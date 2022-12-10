package fr.leo.dp.FabriqueSimple_2;

public class FabriqueParis implements FabriqueSimple {

	@Override
	public Pizza creerPizza(String type) {
		Pizza pizza = null;
		if (type.equals("poivron"))
			pizza = new PizzaPoivron();
		if (type.equals("mozarella"))
			pizza = new PizzaMozarella();
		return pizza;
	}

}
