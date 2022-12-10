package fr.leo.dp.Mediator_3;

import java.util.ArrayList;
import java.util.List;

public class MediateurImpl2 extends Mediateur {
	
	private List<Message> conversations = new ArrayList<>();

	@Override
	public void transmettreMessage(Message m) {
		System.out.println("Transmisson du message par MediateurImpl2 !");
		System.out.println("De " + m.getExpediteur() + " vers " + m.getDestinataire() + " Contenu : " + m.getContenu());
		CollegueJButton dest = m.getDestinataire();
		dest.recevoirMessage(m);
		conversations.add(m);
	}
	
	public void analyserConversation() {
		for (Message message : conversations) {
			System.out.println(message.toString());
		}		
	}
}
