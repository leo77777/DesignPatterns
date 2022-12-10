package fr.leo.dp.FabriqueAbstaite_1;

import fr.leo.dp.FabriqueAbstaite.garnitures.Garniture;
import fr.leo.dp.FabriqueAbstaite.garnitures.Garniture2;
import fr.leo.dp.FabriqueAbstaite.pate.Pate;
import fr.leo.dp.FabriqueAbstaite.pate.PateSemoule;
import fr.leo.dp.FabriqueAbstaite.sauce.Sauce;
import fr.leo.dp.FabriqueAbstaite.sauce.SauceTomate;

public class FabriqueMarseille implements FabriqueIngredients {

	public String nom = "Fabrique De Marseille";

	@Override
	public Pate creerPate() {
		return new PateSemoule();
	}

	@Override
	public Sauce creerSauce() {
		return new SauceTomate();
	}

	@Override
	public Garniture creerGarniture() {
		return new Garniture2();
	}

	@Override
	public String toString() {
		return nom;
	}

}
