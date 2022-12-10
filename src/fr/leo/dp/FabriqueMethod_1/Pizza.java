package fr.leo.dp.FabriqueMethod_1;

import java.util.ArrayList;

public class Pizza {
	String nom;
	String pate;
	String sauce;
	ArrayList<String> garnitures = new ArrayList<>();

	public void preparer() {
		pate = "pate fine";
		sauce = "sauce marinara";
		garnitures.add("ail");
		garnitures.add("oignon");
		garnitures.add("salade");
		System.out.println("Preparation de la pizza " + nom);
		System.out.println("etalage de la pate " + pate);
		System.out.println("ajout de la sauce " + sauce);
		System.out.print("ajout des garnitures: ");
		for (String string : garnitures)
			System.out.print(string + " ");
		System.out.println("");
	}

	public void cuire() {
		System.out.println("cuisson " + this.nom + " en 25 minutes");
	}

	public void couper() {
		System.out.println("couper " + this.nom + " en part triangulaires");
	}

	public void emballer() {
		System.out.println("emballer " + this.nom + " dans une boite");
	}

}
