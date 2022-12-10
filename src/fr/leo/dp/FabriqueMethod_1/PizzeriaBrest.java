package fr.leo.dp.FabriqueMethod_1;

public class PizzeriaBrest extends Pizzeria {

	@Override
	protected Pizza creerPizza(String type) {
		Pizza pizza = null;
		if (type.equals("fromage"))
			pizza = new PizzaFromageBrest();
		if (type.equals("grecque"))
			pizza = new PizzaGrecqueBrest();
		if (type.equals("poivron"))
			pizza = new PizzaPoivronBrest();
		if (type.equals("mozarella"))
			pizza = new PizzaMozarellaBrest();
		return pizza;
	}

}
