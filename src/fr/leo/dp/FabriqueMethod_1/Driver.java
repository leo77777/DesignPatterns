package fr.leo.dp.FabriqueMethod_1;

public class Driver {

	public static void main(String[] args) {
		Pizzeria p = new PizzeriaBrest();
		p.commanderPizza("fromage");

		System.out.println("");
		Pizzeria p2 = new PizzeriaMarseille();
		p2.commanderPizza("mozarella");

		System.out.println("");
		Pizzeria p3 = new PizzeriaParis();
		p3.commanderPizza("poivron");

		System.out.println("");
		PizzeriaUneSeulePizza p4 = new PizzeriaBrestUneSeulePizza();
		p4.commanderPizza();
	}

}
