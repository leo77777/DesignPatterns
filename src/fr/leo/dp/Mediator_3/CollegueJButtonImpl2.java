package fr.leo.dp.Mediator_3;

public class CollegueJButtonImpl2 extends CollegueJButton	 {

	private static final long serialVersionUID = 7844542599968045427L;

	@Override
	public void envoyerMessage(Message m) {
		System.out.println(nom + " envoi un message vers " + m.getDestinataire());	
		m.setExpediteur(this);
		m.setExpediteur(this);
		mediateur.transmettreMessage(m);
	}

	@Override
	public void recevoirMessage(Message m) {
		System.out.println("CollegueJButtonImpl2 Nom= " + nom);
		System.out.println("Reception du message " + "Contenu: " + m.getContenu() + " Exp: " + m.getExpediteur());	
		AFaire(m.getContenu());
		System.out.println("");
	}

	protected CollegueJButtonImpl2() {
		super();
	}

	protected CollegueJButtonImpl2(String nom, Mediateur mediateur) {
		super(nom, mediateur);
	}

	protected CollegueJButtonImpl2(String nom) {
		super(nom);
	}
	
	private void AFaire(String contenuMessage) {
		this.setText(contenuMessage);
	}
}
