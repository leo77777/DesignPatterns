package fr.leo.dp.Etat.Version2;

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
		// Etat ev1 = new EtatVendu(distributeur);
		// distributeur.setEtat(ev1);
		distributeur.setEtat(new EtatVendu(distributeur));
		// distributeur.setEtatVendu(new EtatVendu(distributeur));
		// distributeur.setEtat(distributeur.getEtatVendu());
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
