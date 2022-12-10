package fr.leo.dp.FabriqueAbstaiteAvecClasseAbstraite;

import fr.leo.dp.FabriqueAbstaite.garnitures.Garniture;
import fr.leo.dp.FabriqueAbstaite.pate.Pate;
import fr.leo.dp.FabriqueAbstaite.sauce.Sauce;

public abstract class Pizza {
	FabriqueIngredients fabrique;

	String nom;
	Pate pate;
	Sauce sauce;
	Garniture garniture;

	public void preparer() {
		System.out.println("preparation " + this.nom + " " + fabrique.nomFabrique);
	}

	public void cuire() {
		System.out.println("cuisson " + this.nom);
	}

	public void couper() {
		System.out.println("couper " + this.nom);
	}

	public void emballer() {
		System.out.println("emballer " + this.nom);
	}

	public void presenterGarnitures() {
		System.out.println("Sauce : " + this.sauce);
		System.out.println("Pate : " + this.pate);
		System.out.print("Garnitures: ");
		for (String string : garniture.garniture)
			System.out.print(string + " ");
		System.out.println("");
	}

}
