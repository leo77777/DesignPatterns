package fr.leo.dp.FabriqueAbstaite_1;

public class PizzaGrecque extends Pizza {

	public PizzaGrecque(FabriqueIngredients fabrique) {
		nom = "pizza Grecque";
		this.fabrique = fabrique;

		pate = fabrique.creerPate();
		sauce = fabrique.creerSauce();
		garniture = fabrique.creerGarniture();
	}

}
