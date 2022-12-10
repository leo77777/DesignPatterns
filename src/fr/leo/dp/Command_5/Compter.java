package fr.leo.dp.Command_5;

public class Compter implements Commande {
	Recepteur1 recepteur;

	public Compter(Recepteur1 recepteur) {
		this.recepteur = recepteur;
	}

	@Override
	public void executer() {
		recepteur.compter();
		;
	}
}
