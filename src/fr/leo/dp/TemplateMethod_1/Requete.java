package fr.leo.dp.TemplateMethod_1;

public abstract class Requete {

	public Requete() {
	}

	public void action() {
		System.out.println("connexion base de données");
		System.out.println("... requete " + getString());
		System.out.println("deconnexion base de données");
	}

	abstract protected String getString();

}
