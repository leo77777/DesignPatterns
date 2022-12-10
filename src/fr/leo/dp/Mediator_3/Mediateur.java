package fr.leo.dp.Mediator_3;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediateur {

	protected Map<String, CollegueJButton> collegues = new HashMap<String, CollegueJButton>();

	protected void addCollegue(String ref, CollegueJButton c) {
		collegues.put(ref, c);
	}

	public abstract void transmettreMessage(Message m);
}	
