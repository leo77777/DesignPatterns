package fr.leo.dp.Command_2;

public abstract class CommandeVentilateur implements Commande {
	Ventilateur ventilateur;
	int derniereVitesse;

	public CommandeVentilateur(Ventilateur ventilateur) {
		this.ventilateur = ventilateur;
	}

	@Override
	public abstract void executer();

	@Override
	public void annuler() {
		if (derniereVitesse == Ventilateur.RAPIDE)
			ventilateur.rapide();
		else if (derniereVitesse == Ventilateur.MOYEN)
			ventilateur.moyen();
		else if (derniereVitesse == Ventilateur.LENT)
			ventilateur.lent();
		else if (derniereVitesse == Ventilateur.ARRET)
			ventilateur.arret();
	}
}
