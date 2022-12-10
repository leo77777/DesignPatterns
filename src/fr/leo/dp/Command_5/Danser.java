package fr.leo.dp.Command_5;

public class Danser implements Commande {
	Recepteur2 recepteur;

	public Danser(Recepteur2 recepteur) {
		this.recepteur = recepteur;
	}

	@Override
	public void executer() {
		recepteur.danser();
		;
	}
}
