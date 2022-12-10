package fr.leo.dp.Etat.VersionComplete;

import java.util.Random;

public class EtatAPiece implements Etat {
	Distributeur distributeur;

	public EtatAPiece(Distributeur distributeur) {
		this.distributeur = distributeur;
	}

	@Override
	public void insererPiece() {
		System.out.println("Vous ne pouvez pas inserer d'autres pieces");

	}

	@Override
	public void ejecterPiece() {
		System.out.println("Piece retournée");

	}

	@Override
	public void tournerPoignee() {
		System.out.println("Vous avez tourné la poignée");
		Random aleatoire = new Random();
		int num = aleatoire.nextInt(10) + 1;
		if (num == 3) {
			distributeur.setEtat(new EtatGagnant(distributeur));
			distributeur.getEtat().delivrer();
		} else {
			distributeur.setEtat(new EtatVendu(distributeur));
			distributeur.getEtat().delivrer();
		}
	}

	@Override
	public void delivrer() {
		System.out.println("Pas de bonbons délivrés");
	}

	@Override
	public String toString() {
		return "Etat APiece";
	}

}
