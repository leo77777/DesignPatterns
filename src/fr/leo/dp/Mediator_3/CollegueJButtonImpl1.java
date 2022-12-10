package fr.leo.dp.Mediator_3;

import java.awt.Color;

public class CollegueJButtonImpl1 extends CollegueJButton {

	private static final long serialVersionUID = 7844542599968045427L;

	@Override
	public void envoyerMessage(Message m) {
		System.out.println(nom + " envoi un message vers " + m.getDestinataire());
		m.setExpediteur(this);
		mediateur.transmettreMessage(m);
	}

	@Override
	public void recevoirMessage(Message m) {
		System.out.println("CollegueJButtonImpl1 Nom= " + nom);
		System.out.println("Reception du message" + " Contenu: " + m.getContenu() + " Exp: " + m.getExpediteur());
		AFaire(m.getContenu());
		System.out.println("");
	}

	protected CollegueJButtonImpl1() {
		super();
	}

	protected CollegueJButtonImpl1(String nom, Mediateur mediateur) {
		super(nom, mediateur);
	}

	protected CollegueJButtonImpl1(String nom) {
		super(nom);
	}

	private void AFaire(String contenuMessage) {
		switch (contenuMessage) {
		case "rouge":
			this.setBackground(Color.red);
			break;
		case "vert":
			this.setBackground(Color.GREEN);
			break;
		case "yellow":
			this.setBackground(Color.YELLOW);
			break;
		default:
			break;
		}
	}
}
