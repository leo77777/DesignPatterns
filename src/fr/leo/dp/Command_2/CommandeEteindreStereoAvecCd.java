package fr.leo.dp.Command_2;

public class CommandeEteindreStereoAvecCd implements Commande {
	Stereo stereo;

	protected CommandeEteindreStereoAvecCd(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void executer() {
		stereo.arret();
	}

	@Override
	public void annuler() {
		stereo.marche();
		stereo.setCd();
		stereo.setVolume();
	}
}
