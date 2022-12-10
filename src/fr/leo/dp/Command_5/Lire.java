package fr.leo.dp.Command_5;

public class Lire implements Commande {
	Recepteur1 recepteur;

	public Lire(Recepteur1 recepteur) {
		this.recepteur = recepteur;
	}

	@Override
	public void executer() {
		recepteur.lire();
	}
}
