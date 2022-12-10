package fr.leo.dp.Stategie.Context;	
public class Context {
	public void apliquerStrategie(int type) {
		if (type == 1) {
			System.out.println("Traitement version 1");
		}else if (type == 2) {
			System.out.println("Traitement version 2");
		}else if(type == 3) {
			System.out.println("Traitement version 3");
		}else {
			System.out.println("Traitement par défaut");
		}
	}
}
