package fr.leo.dp.Command_1;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {

	Map<String, Command> theCommmands = new HashMap<String, Command>();

	public void add(String nomCommande, Command theCommand) {
		theCommmands.put(nomCommande, theCommand);
	}

	public void action(String nomCommmande) {
		theCommmands.get(nomCommmande).execute();
	}

}
