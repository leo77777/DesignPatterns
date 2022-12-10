package fr.leo.dp.Command_2;

public class Lampe {
	String piece;

	protected Lampe(String piece) {
		super();
		this.piece = piece;
	}

	public void marche() {
		System.out.println("Lampe " + piece + " allumée");
	}

	public void arret() {
		System.out.println("Lampe " + piece + " éteinte");
	}

}
