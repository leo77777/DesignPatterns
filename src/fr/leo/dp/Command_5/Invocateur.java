package fr.leo.dp.Command_5;

import java.util.HashMap;
import java.util.Map;

public class Invocateur {

	Map<String, Commande> hm1 = new HashMap<>();

	public void add(String string, Commande commande) {
		hm1.put(string, commande);
	}

	public void invoquer(String nom) {
		(hm1.get(nom)).executer();
	}
}
