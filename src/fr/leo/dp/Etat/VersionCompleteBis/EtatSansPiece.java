package fr.leo.dp.Etat.VersionCompleteBis;

public class EtatSansPiece implements Etat {
	Distributeur distributeur;

	public EtatSansPiece(Distributeur distributeur) {
		this.distributeur = distributeur;
	}

	@Override
	public void insererPiece() {
		System.out.println("Vous avez inséré une pièce");
		distributeur.setEtat(new EtatAPiece(distributeur));
	}

	@Override
	public void ejecterPiece() {
		System.out.println("Vous n’avez pas inséré de pièce");
	}

	@Override
	public void tournerPoignee() {
		System.out.println("Vous avez tourné, mais il n’y a pas de pièce");
	}

	@Override
	public void delivrer() {
		System.out.println("Il faut payer d’abord");
	}

	@Override
	public void remplir(int nombre) {
		distributeur.setNombre(distributeur.getNombre() + nombre);
		System.out.println("Bonbons ajoutés," + " il y a maintenant " + distributeur.getNombre()
				+ " bonbons dans le distributeur");
	}

	@Override
	public String toString() {
		return "Etat sans piece";
	}
}
