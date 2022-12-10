package fr.leo.dp.Adapter_5;

public class Driver {

	public static void main(String[] args) {

		Voiture v1 = Voiture.getVoiture();
		// NouvelleVoiture nv1 = new NouvelleVoiture();
		// AdapterVoiture v1 = new AdapterVoiture(nv1);
		// VoitureAncienne v1 = new VoitureAncienne();
		v1.avancer();
		v1.reculer();
		v1.tourner();

		System.out.println("");
		Voiture v12 = new AdapterVoitureHeritage();
		v12.avancer();
		v12.reculer();
		v12.tourner();
	}

	// public Driver(int a) {
	// a = 10;
	// }
	//
	// public Driver(int a, int b) {
	// this(a);
	// }

}
