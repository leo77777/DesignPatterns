package fr.leo.dp.Mediator_3;

import javax.swing.JButton;

public abstract class CollegueJButton extends JButton {

	private static final long serialVersionUID = 4983922016670344894L;
	protected Mediateur mediateur;
	protected String nom;

	public CollegueJButton(String nom, Mediateur mediateur) {
		super();
		this.mediateur = mediateur;
		this.nom = nom;
		mediateur.addCollegue(nom, this);
	}

	public CollegueJButton(String nom) {
		this.nom = nom;
	}

	public CollegueJButton() {
		super();
	}

	public abstract void envoyerMessage(Message m);

	public abstract void recevoirMessage(Message m);

	public Mediateur getMediateur() {
		return mediateur;
	}

	public void setMediateur(Mediateur mediateur) {
		this.mediateur = mediateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}
}
