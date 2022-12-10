package fr.leo.dp.FabriqueAbstaite_1;

public class PizzaMozarella extends Pizza {

	public PizzaMozarella(FabriqueIngredients fabrique) {
		nom = "pizza mozarella";
		this.fabrique = fabrique;

		pate = fabrique.creerPate();
		sauce = fabrique.creerSauce();
		garniture = fabrique.creerGarniture();
	}

}
