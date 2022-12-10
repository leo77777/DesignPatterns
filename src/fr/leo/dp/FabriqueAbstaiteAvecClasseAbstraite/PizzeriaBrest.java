package fr.leo.dp.FabriqueAbstaiteAvecClasseAbstraite;

public class PizzeriaBrest extends Pizzeria {

	@Override
	protected Pizza creerPizza(String type) {
		FabriqueIngredients fabrique = new FabriqueBrest();
		Pizza pizza = null;
		if (type.equals("fromage"))
			pizza = new PizzaFromage(fabrique);
		if (type.equals("grecque"))
			pizza = new PizzaGrecque(fabrique);
		if (type.equals("poivron"))
			pizza = new PizzaPoivron(fabrique);
		if (type.equals("mozarella"))
			pizza = new PizzaMozarella(fabrique);
		return pizza;
	}

}
