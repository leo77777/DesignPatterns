package fr.leo.dp.Command_2;

public class TelecommandeSimple {
	Commande emplacement;

	public TelecommandeSimple() {
	}

	public void setCommande(Commande commande) {
		emplacement = commande;
	}

	public void boutonPresse() {
		emplacement.executer();
	}
}
