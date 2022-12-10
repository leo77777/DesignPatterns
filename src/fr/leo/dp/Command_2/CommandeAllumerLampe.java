package fr.leo.dp.Command_2;

public class CommandeAllumerLampe implements Commande {

	Lampe lampe;

	protected CommandeAllumerLampe(Lampe lampe) {
		this.lampe = lampe;
	}
	@Override
	public void executer() {
		lampe.marche();
	}

	@Override
	public void annuler() {
		lampe.arret();
	}
}
