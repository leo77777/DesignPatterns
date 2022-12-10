package fr.leo.dp.Command_2;

public class Ventilateur {

	public static final int RAPIDE = 3;
	public static final int MOYEN = 2;
	public static final int LENT = 1;
	public static final int ARRET = 0;
	String localisation;
	int vitesse;

	public Ventilateur(String localisation) {
		this.localisation = localisation;
		vitesse = ARRET;
	}

	public void rapide() {
		vitesse = RAPIDE;
		System.out.println("ventilateur vitesse rapide ...");
	}

	public void moyen() {
		vitesse = MOYEN;
		System.out.println("ventilateur vitesse moyenne ...");
		// code pour r�gler la vitesse sur moyen
	}

	public void lent() {
		vitesse = LENT;
		System.out.println("ventilateur vitesse lente ...");
		// code pour r�gler la vitesse sur lent
	}

	public void arret() {
		vitesse = ARRET;
		System.out.println("ventilateur � l'arret ...");
		// code pour arr�ter le ventilateur
	}

	public int getVitesse() {
		return vitesse;
	}
}
