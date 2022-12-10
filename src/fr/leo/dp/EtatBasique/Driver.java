package fr.leo.dp.EtatBasique;

public class Driver {

	public static void main(String[] args) {
		Distributeur d1 = new Distributeur(10);
		d1.insererPiece();
		d1.tournerPoignee();
		d1.insererPiece();
		d1.ejecterPiece();

		System.out.println("");
		Distributeur distributeur = new Distributeur(5);
		System.out.println(distributeur);
		distributeur.insererPiece();
		distributeur.tournerPoignee();
		System.out.println(distributeur);
		distributeur.insererPiece();
		distributeur.ejecterPiece();
		distributeur.tournerPoignee();
		System.out.println(distributeur);
		distributeur.insererPiece();
		distributeur.tournerPoignee();
		distributeur.insererPiece();
		distributeur.tournerPoignee();
		distributeur.ejecterPiece();
		System.out.println(distributeur);
		distributeur.insererPiece();
		distributeur.insererPiece();
		distributeur.tournerPoignee();
		distributeur.insererPiece();
		distributeur.tournerPoignee();
		distributeur.insererPiece();
		distributeur.tournerPoignee();
		System.out.println(distributeur);

	}

}
