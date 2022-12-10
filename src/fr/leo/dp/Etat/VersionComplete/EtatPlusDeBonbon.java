package fr.leo.dp.Etat.VersionComplete;

public class EtatPlusDeBonbon implements Etat {
	Distributeur distributeur;

	public EtatPlusDeBonbon(Distributeur distributeur) {
		this.distributeur = distributeur;
	}

	@Override
	public void insererPiece() {
		System.out.println("Plus de bonbons");

	}

	@Override
	public void ejecterPiece() {
		System.out.println("Vous n'avez pas mis de piece");

	}

	@Override
	public void tournerPoignee() {
		System.out.println("Plus de bonbon");
	}


	@Override
	public void delivrer() {
		System.out.println("Plus de bonbons");
	}

	@Override
	public String toString() {
		return "Etat Plus de bonbon";
	}

}
