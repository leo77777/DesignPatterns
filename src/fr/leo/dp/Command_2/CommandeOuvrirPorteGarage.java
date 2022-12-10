package fr.leo.dp.Command_2;

public class CommandeOuvrirPorteGarage implements Commande {
	PorteGarage porteGarage;

	protected CommandeOuvrirPorteGarage(PorteGarage porteGarage) {
		this.porteGarage = porteGarage;
	}

	@Override
	public void executer() {
		porteGarage.ouvrir();
	}

	@Override
	public void annuler() {
		porteGarage.fermer();
	}
}
