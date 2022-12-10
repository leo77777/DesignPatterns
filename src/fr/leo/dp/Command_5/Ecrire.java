package fr.leo.dp.Command_5;

public class Ecrire implements Commande {
	Recepteur1 recepteur;

	public Ecrire(Recepteur1 recepteur) {
		this.recepteur = recepteur;
	}

	@Override
	public void executer() {
		recepteur.ecrire();
		;
	}
}
