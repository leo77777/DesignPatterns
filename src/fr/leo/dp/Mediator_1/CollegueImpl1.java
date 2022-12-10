package fr.leo.dp.Mediator_1;

public class CollegueImpl1 extends Collegue	 {
	
	@Override
	public void envoyerMessage(Message m) {
		System.out.println("CollegueImpl1:");
		System.out.println("   " + nom + " envoi du message " +
	           "\"" + m.getContenu() +  "\"" + " vers " + m.getDestinataire());
		m.setExpediteur(nom);
		mediateur.transmettreMessage(m);
	}

	@Override
	public void recevoirMessage(Message m) {
		System.out.println("CollegueImpl1:");
		System.out.println("   " + m.getDestinataire()  + " réception du message " +
	           "\"" + m.getContenu() +  "\"" + " provenant de " + m.getExpediteur());
		System.out.println("");
	}

	protected CollegueImpl1() {
		super();
	}

	protected CollegueImpl1(String nom, Mediateur mediateur) {
		super(nom, mediateur);
	}

	protected CollegueImpl1(String nom) {
		super(nom);
	}
}
