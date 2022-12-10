package fr.leo.dp.Decorator_2;

public class Driver {

	public static void main(String[] args) throws Exception {

		ComposantAbstrait c = new ComposantConcretImp1();
		c.operation();

		System.out.println("-----------------");
		System.out.println("Decorateur 1");
		System.out.println("-----------------");
		c = new DecorateurConcretImp1(c);
		c.operation();

		System.out.println("-----------------");
		System.out.println("Decorateur 2");
		System.out.println("-----------------");
		c = new DecorateurConcretImp2(c);
		c.operation();
	}
}
