package fr.leo.dp.Mediator_1;
public class CollegueImpl2 extends Collegue	 {
	
	@Override
	public void envoyerMessage(Message m) {
		System.out.println("CollegueImpl2:");
		System.out.println("   " + nom + " envoi du message " +
		           "\"" + m.getContenu() +  "\"" + " vers " + m.getDestinataire());
		m.setExpediteur(nom);
		mediateur.transmettreMessage(m);
	}

	@Override
	public void recevoirMessage(Message m) {
		System.out.println("CollegueImpl2:");
		System.out.println("   " + m.getDestinataire()  + " réception du message " +
	           "\"" + m.getContenu() +  "\"" + " provenant de " + m.getExpediteur());
		System.out.println("");
	}

	protected CollegueImpl2() {
		super();
	}

	protected CollegueImpl2(String nom, Mediateur mediateur) {
		super(nom, mediateur);
	}

	protected CollegueImpl2(String nom) {
		super(nom);
	}
}
