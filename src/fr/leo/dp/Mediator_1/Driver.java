package fr.leo.dp.Mediator_1;

public class Driver {

	public static void main(String[] args) {
		MediateurImpl2 mediateur1 = new MediateurImpl2();
		CollegueImpl1 collegue1 = new CollegueImpl1("Collegue1", mediateur1);
		CollegueImpl1 collegue2 = new CollegueImpl1("Collegue2", mediateur1);
		CollegueImpl2 collegue3 = new CollegueImpl2("Collegue3", mediateur1);
		
		collegue1.envoyerMessage(new Message("message1", "Collegue2"));
		collegue1.envoyerMessage(new Message("message2", "Collegue3"));
		collegue2.envoyerMessage(new Message("message3", "Collegue1"));
		collegue1.envoyerMessage(new Message("message4", "Collegue1", "Collegue3"));
		collegue3.envoyerMessage(new Message("message5", "Collegue2"));

		mediateur1.analyserConversation();
	}
}
