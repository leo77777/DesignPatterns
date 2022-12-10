package fr.leo.dp.Proxy_1;

public class EtatVendu implements Etat {

	private static final long serialVersionUID = 5373898659705027900L;
	transient ServiceDistributeurDistant distributeur;

	public EtatVendu(ServiceDistributeurDistant distributeur) {
		this.distributeur = distributeur;
	}

	@Override
	public void insererPiece() {
		System.out.println("Veuillez patienter, le bonbon va tomber");
	}

	@Override
	public void ejecterPiece() {
		System.out.println("Vous avez déjà tourné la poignée");
	}

	@Override
	public void tournerPoignee() {
		System.out.println("Inutile de tourner deux fois !");
	}

	@Override
	public void delivrer() {
		distributeur.liberer();
		if (distributeur.getNombre() > 0)
			distributeur.setEtat(distributeur.getEtatSansPiece());
		else {
			System.out.println("Aïe, plus de bonbons !");
			distributeur.setEtat(distributeur.getEtatEpuise());
		}
	}

	@Override
	public String toString() {
		return "Etat vendu";
	}
}
