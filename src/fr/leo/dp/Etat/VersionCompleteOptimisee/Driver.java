package fr.leo.dp.Etat.VersionCompleteOptimisee;

public class Driver extends Thread {
	Distributeur d1 = new Distributeur(1);

	public static void main(String[] args) {
		Driver d12 = new Driver();
		d12.start();
	}

	@Override
	public void run() {
		System.out.println("\n1: " + d1.getEtat());

		d1.insererPiece();
		System.out.println("\n2: " + d1.getEtat());
		d1.tournerPoignee();
		System.out.println("\n3: " + d1.getEtat());

		d1.insererPiece();
		System.out.println("\n4: " + d1.getEtat());

		System.out.println("");
		d1.remplir(10);
		System.out.println("\n4: " + d1.getEtat());

		d1.insererPiece();
		System.out.println("\n5: " + d1.getEtat());
		d1.tournerPoignee();
		System.out.println("\n6: " + d1.getEtat());

		System.out.println("");
		d1.tournerPoignee();
		System.out.println("\n7: " + d1.getEtat());
	}

}
