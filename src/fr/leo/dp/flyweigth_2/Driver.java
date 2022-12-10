package fr.leo.dp.flyweigth_2;

public class Driver {

	public static void main(String[] args) {

		FabriqueVoyagerLeger fabrique = new FabriqueVoyagerLeger();

		VoyagerLeger vl = fabrique.getVoyagerLeger("voyager");
		VoyagerLeger vlBis = fabrique.getVoyagerLeger("voyager");
		System.out.println("------------------");
		vl.aficher("Context1");
		vlBis.aficher("Context2");

		System.out.println(vl == vlBis);
		System.out.println("------------------");


	}

}
