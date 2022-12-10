package fr.leo.dp.FabriqueAbstaiteAvecClasseAbstraite;

public class PizzeriaParis extends Pizzeria {

	@Override
	protected Pizza creerPizza(String type) {
		Pizza pizza = null;
		if (type.equals("fromage"))
			pizza = new PizzaFromage(new FabriqueParis());
		if (type.equals("grecque"))
			pizza = new PizzaGrecque(new FabriqueParis());
		if (type.equals("poivron"))
			pizza = new PizzaPoivron(new FabriqueParis());
		if (type.equals("mozarella"))
			pizza = new PizzaMozarella(new FabriqueParis());
		return pizza;
	}

}
