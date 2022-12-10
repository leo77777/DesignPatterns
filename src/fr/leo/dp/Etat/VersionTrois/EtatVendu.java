package fr.leo.dp.Etat.VersionTrois;

public class EtatVendu implements Etat {

	Distributeur distributeur;

	public EtatVendu(Distributeur distributeur) {
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
			distributeur.setEtat(new EtatSansPiece(distributeur));
		else {
			System.out.println("Aïe, plus de bonbons !");
			distributeur.setEtat(new EtatEpuise(distributeur));
		}
	}

	@Override
	public String toString() {
		return "Etat vendu";
	}
}
