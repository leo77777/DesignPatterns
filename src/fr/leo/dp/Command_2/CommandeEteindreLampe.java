package fr.leo.dp.Command_2;

public class CommandeEteindreLampe implements Commande {

	Lampe lampe;

	protected CommandeEteindreLampe(Lampe lampe) {
		this.lampe = lampe;
	}
	@Override
	public void executer() {
		lampe.arret();
	}

	@Override
	public void annuler() {
		lampe.marche();
	}
}
