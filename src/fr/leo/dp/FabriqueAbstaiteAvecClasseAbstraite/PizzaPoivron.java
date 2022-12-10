package fr.leo.dp.FabriqueAbstaiteAvecClasseAbstraite;

public class PizzaPoivron extends Pizza {

	public PizzaPoivron(FabriqueIngredients fabrique) {
		nom = "pizza poivron";
		this.fabrique = fabrique;
		fabrique.creerIngredients();
		this.pate = fabrique.pate;
		this.sauce = fabrique.sauce;
		this.garniture = fabrique.garniture;
	}

}
