package fr.leo.dp.FabriqueAbstaite_1;

import fr.leo.dp.FabriqueAbstaite.garnitures.Garniture;
import fr.leo.dp.FabriqueAbstaite.garnitures.Garniture3;
import fr.leo.dp.FabriqueAbstaite.pate.Pate;
import fr.leo.dp.FabriqueAbstaite.pate.PateFine;
import fr.leo.dp.FabriqueAbstaite.sauce.Sauce;
import fr.leo.dp.FabriqueAbstaite.sauce.SauceMoutarde;

public class FabriqueParis implements FabriqueIngredients {

	public String nom = "Fabrique De Paris";

	@Override
	public Pate creerPate() {
		return new PateFine();
	}

	@Override
	public Sauce creerSauce() {
		return new SauceMoutarde();
	}

	@Override
	public Garniture creerGarniture() {
		return new Garniture3();
	}

	@Override
	public String toString() {
		return nom;
	}

}
