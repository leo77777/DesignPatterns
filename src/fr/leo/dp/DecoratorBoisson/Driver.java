package fr.leo.dp.DecoratorBoisson;
public class Driver {
	public static void main(String[] args) {
		Boisson b1 = new Espresso();

		System.out.println();
		b1 = new Lait(b1);
		System.out.println(b1.getDescription());
		System.out.println(b1.cout());

		System.out.println();
		b1 = new Chocolat(b1);
		System.out.println(b1.getDescription());
		System.out.println(b1.cout());

		b1 = new Lait(new Chocolat(new Chantilly(b1)));
		System.out.println(b1.getDescription());
		System.out.println(b1.cout());
	}
}
