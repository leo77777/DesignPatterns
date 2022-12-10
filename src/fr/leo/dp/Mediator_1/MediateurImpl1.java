package fr.leo.dp.Mediator_1;

public class MediateurImpl1 extends Mediateur {

	@Override
	public void transmettreMessage(Message m) {
		System.out.println("");
		System.out.println("MediateurImpl1:");
		System.out.println("transmission du message de "
		     + m.getExpediteur()+ " vers " + m.getDestinataire()+ ", contenu:" + "\"" +  m.getContenu() + "\"");
		Collegue dest = collegues.get(m.getDestinataire());
		dest.recevoirMessage(m);
	}
}
