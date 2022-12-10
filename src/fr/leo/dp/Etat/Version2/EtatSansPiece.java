package fr.leo.dp.Etat.Version2;

public class EtatSansPiece implements Etat {
	Distributeur distributeur;

	public EtatSansPiece(Distributeur distributeur) {
		this.distributeur = distributeur;
	}

	@Override
	public void insererPiece() {
		System.out.println("Vous avez ins�r� une pi�ce");
		distributeur.setEtat(new EtatAPiece(distributeur));
	}

	@Override
	public void ejecterPiece() {
		System.out.println("Vous n�avez pas ins�r� de pi�ce");
	}

	@Override
	public void tournerPoignee() {
		System.out.println("Vous avez tourn�, mais il n�y a pas de pi�ce");
	}

	@Override
	public void delivrer() {
		System.out.println("Il faut payer d�abord");
	}

	@Override
	public String toString() {
		return "Etat sans piece";
	}
}
