package fr.leo.dp.Adapter_5;

public class AdapterVoitureHeritage extends NouvelleVoiture implements Voiture {

	@Override
	public void tourner() {
		this.tournerPlus();
	}

	@Override
	public void avancer() {
		this.avancerPlus();
	}

	@Override
	public void reculer() {
		this.reculerPlus();
	}

}
