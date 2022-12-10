package fr.leo.dp.Proxy_1;

public class EtatAPiece implements Etat {

	private static final long serialVersionUID = -3931959646716358233L;
	transient ServiceDistributeurDistant distributeur; 

	public EtatAPiece(ServiceDistributeurDistant distributeur) {
		this.distributeur = distributeur;
	}

	@Override
	public void insererPiece() {
		System.out.println("Vous ne pouvez pas inserer d'autres pieces");

	}

	@Override
	public void ejecterPiece() {
		System.out.println("Piece retourn�e");
		distributeur.setEtat(distributeur.getEtatSansPiece());

	}

	@Override
	public void tournerPoignee() {
		System.out.println("Vous avez tourn� la poign�e");
		distributeur.setEtat(distributeur.getEtatVendu());
	}

	@Override
	public void delivrer() {
		System.out.println("Pas de bonbons d�livr�s");
	}

	@Override
	public String toString() {
		return "Etat APiece";
	}

}
