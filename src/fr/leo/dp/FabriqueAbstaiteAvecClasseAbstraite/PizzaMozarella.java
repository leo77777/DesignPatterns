package fr.leo.dp.FabriqueAbstaiteAvecClasseAbstraite;

public class PizzaMozarella extends Pizza {

	public PizzaMozarella(FabriqueIngredients fabrique) {
		nom = "pizza mozarella";
		this.fabrique = fabrique;
		fabrique.creerIngredients();
		this.pate = fabrique.pate;
		this.sauce = fabrique.sauce;
		this.garniture = fabrique.garniture;
	}

}
