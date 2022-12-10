package fr.leo.dp.FabriqueAbstaite_1;

public class PizzeriaBrest extends Pizzeria {

	@Override
	protected Pizza creerPizza(String type) {
		Pizza pizza = null;
		if (type.equals("fromage"))
			pizza = new PizzaFromage(new FabriqueBrest());
		if (type.equals("grecque"))
			pizza = new PizzaGrecque(new FabriqueBrest());
		if (type.equals("poivron"))
			pizza = new PizzaPoivron(new FabriqueBrest());
		if (type.equals("mozarella"))
			pizza = new PizzaMozarella(new FabriqueBrest());
		return pizza;
	}

}
