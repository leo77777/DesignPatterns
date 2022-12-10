package fr.leo.dp.Etat.VersionTrois;

public class Driver {

	public static void main(String[] args) {

		Distributeur d1 = new Distributeur(100);
		d1.montrer();

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
