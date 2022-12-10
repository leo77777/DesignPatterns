package fr.leo.dp.Mediator_1;

import java.util.ArrayList;
import java.util.List;

public class MediateurImpl2 extends Mediateur {
	
	private List<Message> conversations = new ArrayList<>();

	@Override
	public void transmettreMessage(Message m) {
		System.out.println("MediateurImpl2:");
		System.out.println("   " + "transmission du message de "
			     + m.getExpediteur()+ " vers " + m.getDestinataire()+ ", contenu:" + "\"" +  m.getContenu() + "\"");
		Collegue dest = collegues.get(m.getDestinataire());
		dest.recevoirMessage(m);
		conversations.add(m);
	}
	
	public void analyserConversation() {
		for (Message message : conversations) {
			System.out.println(message.toString());
		}		
	}
}
