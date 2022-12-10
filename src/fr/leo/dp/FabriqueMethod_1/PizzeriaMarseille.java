package fr.leo.dp.FabriqueMethod_1;

public class PizzeriaMarseille extends Pizzeria {

	@Override
	protected Pizza creerPizza(String type) {
		Pizza pizza = null;
		if (type.equals("fromage"))
			pizza = new PizzaFromageMarseille();
		if (type.equals("grecque"))
			pizza = new PizzaGrecqueMarseille();
		if (type.equals("poivron"))
			pizza = new PizzaPoivronMarseille();
		if (type.equals("mozarella"))
			pizza = new PizzaMozarellaMarseille();
		return pizza;
	}

}
