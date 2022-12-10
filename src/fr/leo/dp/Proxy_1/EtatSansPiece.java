package fr.leo.dp.Proxy_1;

public class EtatSansPiece implements Etat {

	private static final long serialVersionUID = -6699886304534852290L;
	transient ServiceDistributeurDistant distributeur;

	public EtatSansPiece(ServiceDistributeurDistant distributeur) {
		this.distributeur = distributeur;
	}

	@Override
	public void insererPiece() {
		System.out.println("Vous avez inséré une pièce");
		distributeur.setEtat(distributeur.getEtatAPiece());
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
	public String toString() {
		return "Etat sans piece";
	}
}
