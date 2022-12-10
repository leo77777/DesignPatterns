package fr.leo.dp.Mediator_1;
import java.util.HashMap;
import java.util.Map;
public abstract class Mediateur {

	protected Map<String, Collegue> collegues = new HashMap<String, Collegue>();

	protected void addCollegue(String ref, Collegue c) {
		collegues.put(ref, c);
	}
	
	public abstract void transmettreMessage(Message m) ;
}
