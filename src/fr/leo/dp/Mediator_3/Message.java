package fr.leo.dp.Mediator_3;

import java.util.Date;

public class Message {
	private String contenu;
	private CollegueJButton expediteur;
	private CollegueJButton destinataire;
	private Date date;

	protected Message(String contenu, CollegueJButton expediteur, CollegueJButton destinataire, Date date) {
		super();
		this.contenu = contenu;
		this.expediteur = expediteur;
		this.destinataire = destinataire;
		this.date = date;
	}

	protected Message(String contenu, CollegueJButton dest) {
		super();
		this.contenu = contenu;
		this.destinataire = dest;
	}

	protected Message() {
		super();
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public CollegueJButton getExpediteur() {
		return expediteur;
	}

	public void setExpediteur(CollegueJButton expediteur) {
		this.expediteur = expediteur;
	}

	public CollegueJButton getDestinataire() {
		return destinataire;
	}

	public void setDestinataire(CollegueJButton destinataire) {
		this.destinataire = destinataire;
	}

	@Override
	public String toString() {
		return "Message [contenu=" + contenu + ", expediteur=" + expediteur + ", destinataire=" + destinataire
				+ ", date=" + date + "]";
	}
}
