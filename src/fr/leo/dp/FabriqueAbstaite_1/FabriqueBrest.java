package fr.leo.dp.FabriqueAbstaite_1;

import fr.leo.dp.FabriqueAbstaite.garnitures.Garniture;
import fr.leo.dp.FabriqueAbstaite.garnitures.Garniture1;
import fr.leo.dp.FabriqueAbstaite.pate.Pate;
import fr.leo.dp.FabriqueAbstaite.pate.PateAncienne;
import fr.leo.dp.FabriqueAbstaite.sauce.Sauce;
import fr.leo.dp.FabriqueAbstaite.sauce.SauceBeharnaise;

public class FabriqueBrest implements FabriqueIngredients {

	public String nom = "Fabrique De Brest";

	@Override
	public Pate creerPate() {
		return new PateAncienne();
	}

	@Override
	public Sauce creerSauce() {
		return new SauceBeharnaise();
	}

	@Override
	public Garniture creerGarniture() {
		return new Garniture1();
	}

	@Override
	public String toString() {
		return nom;
	}

}
