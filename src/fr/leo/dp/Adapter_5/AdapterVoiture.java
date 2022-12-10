package fr.leo.dp.Adapter_5;

public class AdapterVoiture implements Voiture {

	NouvelleVoiture nv1 = new NouvelleVoiture();

	public AdapterVoiture() {
	}

	@Override
	public void tourner() {
		nv1.tournerPlus();
	}

	@Override
	public void avancer() {
		nv1.avancerPlus();
	}

	@Override
	public void reculer() {
		nv1.reculerPlus();
	}
}
