package fr.leo.dp.Proxy_1;

public class EtatEpuise implements Etat {

	private static final long serialVersionUID = -2572366931900837146L;
	transient ServiceDistributeurDistant distributeur;

	public EtatEpuise(ServiceDistributeurDistant distributeur) {
		this.distributeur = distributeur;
	}

	@Override
	public void insererPiece() {
		System.out.println("Désole mais il n'y a plus de bonbons !");
	}

	@Override
	public void ejecterPiece() {
		System.out.println("Vous n'avez pas mis de piece ...");
	}

	@Override
	public void tournerPoignee() {
		System.out.println("Désolé le distributeur est vide !");
	}

	@Override
	public void delivrer() {
		System.out.println("Désolé le distributeur est vide !");
	}

	@Override
	public String toString() {
		return "Le distributeur est vide !";
	}

}
