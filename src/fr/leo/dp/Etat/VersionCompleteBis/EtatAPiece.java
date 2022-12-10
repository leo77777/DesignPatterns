package fr.leo.dp.Etat.VersionCompleteBis;

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
		if (num == 3)
			distributeur.setEtat(new EtatGagnant(distributeur));
		else
			distributeur.setEtat(new EtatVendu(distributeur));
	}

	@Override
	public void delivrer() {
		System.out.println("Pas de bonbons délivrés");
	}

	@Override
	public String toString() {
		return "Etat APiece";
	}

	@Override
	public void remplir(int nombre) {
		distributeur.setNombre(distributeur.getNombre() + nombre);
		System.out.println("Bonbons ajoutés," + " il y a maintenant " + distributeur.getNombre()
				+ " bonbons dans le distributeur");
	}

}
