package fr.leo.dp.Adapter_5;

public interface Voiture {
	void tourner();

	void avancer();

	void reculer();

	public static Voiture getVoiture() {
		return new AdapterVoitureHeritage();
	}
}
