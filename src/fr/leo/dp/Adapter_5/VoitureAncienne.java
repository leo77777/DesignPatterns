package fr.leo.dp.Adapter_5;

public class VoitureAncienne implements Voiture {

	@Override
	public void tourner() {
		System.out.println("je tourne");
	}

	@Override
	public void avancer() {
		System.out.println("j'avance");
	}

	@Override
	public void reculer() {
		System.out.println("je recule");

	}

}
