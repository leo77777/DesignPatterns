package fr.leo.dp.FabriqueAbstaite_1;

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
		String intituléNomEtNomFabrique = this.nom + " " + this.fabrique;
		System.out.println("preparation " + intituléNomEtNomFabrique);
	}

	public void cuire() {
		String intituléNomEtNomFabrique = this.nom + " " + this.fabrique;
		System.out.println("cuisson " + intituléNomEtNomFabrique);
	}

	public void couper() {
		String intituléNomEtNomFabrique = this.nom + " " + this.fabrique;
		System.out.println("couper " + intituléNomEtNomFabrique);
	}

	public void emballer() {
		String intituléNomEtNomFabrique = this.nom + " " + this.fabrique;
		System.out.println("emballer " + intituléNomEtNomFabrique);
	}

	public void poserGarnitures() {
		System.out.println("Listes des ingrédients: ");
		System.out.println(pate);
		System.out.println(sauce);
		System.out.print("Garnitures :");
		for (String string : garniture.garniture)
			System.out.print(string + " ");
		System.out.println("");
	}

}
