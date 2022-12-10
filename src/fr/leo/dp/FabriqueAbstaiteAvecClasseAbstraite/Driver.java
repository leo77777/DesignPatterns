package fr.leo.dp.FabriqueAbstaiteAvecClasseAbstraite;

public class Driver {

	public static void main(String[] args) {
		Pizzeria p = new PizzeriaBrest();
		p.commanderPizza("mozarella");

		System.out.println("");
		Pizzeria p2 = new PizzeriaMarseille();
		p2.commanderPizza("mozarella");

		System.out.println("");
		Pizzeria p3 = new PizzeriaParis();
		p3.commanderPizza("poivron");

	}

}
