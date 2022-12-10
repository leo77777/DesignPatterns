package fr.leo.dp.Command_2;

public class CommandeAllumerGroupe implements Commande {

	Commande[] commandes;

	public CommandeAllumerGroupe(Commande[] commandes) {
		this.commandes = commandes;
	}

	@Override
	public void executer() {
		for (Commande commande : commandes)
			commande.executer();
	}

	@Override
	public void annuler() {
		for (Commande commande : commandes)
			commande.annuler();

	}
}
