package fr.leo.dp.FabriqueSimple_2;

public class Driver {

	public static void main(String[] args) {
		Pizzeria p = new Pizzeria(new FabriqueMarseille());
		p.commanderPizza("fromage");

	}

}
