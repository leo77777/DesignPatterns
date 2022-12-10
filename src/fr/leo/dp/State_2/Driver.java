package fr.leo.dp.State_2;

public class Driver {

	public static void main(String[] args) {

		Distributeur d = new Distributeur(10);

		System.out.println("\n1");
		System.out.println(d.getEtat());
		d.insererPiece();

		System.out.println("\n2");
		System.out.println(d.getEtat());
		d.tournerPoignee();

		System.out.println("\n3");
		System.out.println(d.getEtat());
		d.liberer();
	}

}
