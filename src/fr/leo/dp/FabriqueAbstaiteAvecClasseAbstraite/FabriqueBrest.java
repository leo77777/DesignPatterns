package fr.leo.dp.FabriqueAbstaiteAvecClasseAbstraite;

import fr.leo.dp.FabriqueAbstaite.garnitures.Garniture1;
import fr.leo.dp.FabriqueAbstaite.pate.PateAncienne;
import fr.leo.dp.FabriqueAbstaite.sauce.SauceBeharnaise;

public class FabriqueBrest extends FabriqueIngredients {

	public FabriqueBrest() {
		nomFabrique = "Fabrique de Brest";
	}

	@Override
	public void creerIngredients() {
		this.pate = new PateAncienne();
		this.sauce = new SauceBeharnaise();
		this.garniture = new Garniture1();
	}

}
