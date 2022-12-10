package fr.leo.dp.FabriqueMethod_1;

public class PizzeriaParis extends Pizzeria {

	@Override
	protected Pizza creerPizza(String type) {
		Pizza pizza = null;
		if (type.equals("fromage"))
			pizza = new PizzaFromageParis();
		if (type.equals("grecque"))
			pizza = new PizzaGrecqueParis();
		if (type.equals("poivron"))
			pizza = new PizzaPoivronParis();
		if (type.equals("mozarella"))
			pizza = new PizzaMozarellaParis();
		return pizza;
	}

}
