package fr.leo.dp.Mediator_3;

public class MediateurImpl1 extends Mediateur {

	@Override
	public void transmettreMessage(Message m) {
		System.out.println("Transmisson du message par MediateurImpl1 !");
		System.out.println("De " + m.getExpediteur() + " vers " + m.getDestinataire() + " Contenu : " + m.getContenu());
		System.out.println("ICI" + m.getDestinataire());
	}
}
