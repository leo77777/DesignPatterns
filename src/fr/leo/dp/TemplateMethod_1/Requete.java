package fr.leo.dp.TemplateMethod_1;

public abstract class Requete {

	public Requete() {
	}

	public void action() {
		System.out.println("connexion base de donn�es");
		System.out.println("... requete " + getString());
		System.out.println("deconnexion base de donn�es");
	}

	abstract protected String getString();

}
