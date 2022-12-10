package fr.leo.dp.Prototype_1;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Figure c1 = new Cercle(new Point(10,10), new Point(20, 20));
		Figure r1 = new Rectangle(new Point(30,30), new Point(40, 40));		
		
		System.out.println(c1  + "Surface: " + c1.surface());
		
		System.out.println("");
		System.out.println(r1 + "Surface " + r1.surface());		
	
		System.out.println("");
		Figure c2 =  c1.clone();
		System.out.println(c2  + "Surface: " + c2.surface());
		
		
		System.out.println("\nOn change la valeur x d'un point: ");
		c1.p1.x = 100;
		System.out.println(c1  + "Surface: " + c1.surface());
		System.out.println("");
		System.out.println(c2  + "Surface: " + c2.surface());
	}
}
