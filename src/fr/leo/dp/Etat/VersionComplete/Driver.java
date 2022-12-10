package fr.leo.dp.Etat.VersionComplete;

public class Driver {

	public static void main(String[] args) {

		Distributeur d1 = new Distributeur(100);
		System.out.println("\n1: " + d1.getEtat());

		d1.insererPiece();
		System.out.println("\n2: " + d1.getEtat());

		d1.tournerPoignee();
		System.out.println("\n3: " + d1.getEtat());


	}

}
