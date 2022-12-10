package fr.leo.dp.Command_2;

public class CommandeAllumerStereoAvecCd implements Commande {
	Stereo stereo;

	protected CommandeAllumerStereoAvecCd(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void executer() {
		stereo.marche();
		stereo.setCd();
		stereo.setVolume();
	}

	@Override
	public void annuler() {
		stereo.arret();
	}
}
