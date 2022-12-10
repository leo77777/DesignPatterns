package fr.leo.dp.FabriqueAbstaiteAvecClasseAbstraite;

public class PizzeriaMarseille extends Pizzeria {

	@Override
	protected Pizza creerPizza(String type) {
		Pizza pizza = null;
		if (type.equals("fromage"))
			pizza = new PizzaFromage(new FabriqueMarseille());
		if (type.equals("grecque"))
			pizza = new PizzaGrecque(new FabriqueMarseille());
		if (type.equals("poivron"))
			pizza = new PizzaPoivron(new FabriqueMarseille());
		if (type.equals("mozarella"))
			pizza = new PizzaMozarella(new FabriqueMarseille());
		return pizza;
	}

}
