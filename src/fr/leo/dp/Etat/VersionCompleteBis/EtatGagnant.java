package fr.leo.dp.Etat.VersionCompleteBis;

public class EtatGagnant implements Etat {
	Distributeur distributeur;

	public EtatGagnant(Distributeur distributeur) {
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
		System.out.println("Vous avez gagné 2 bonbons !");
		distributeur.liberer();
		if (distributeur.getNombre() > 0) {
			distributeur.liberer();
			if (distributeur.getNombre() > 0) {
				System.out.println("retour a l'etat sans piece");
				distributeur.setEtat(new EtatSansPiece(distributeur));
			}
			else {
				System.out.println("Aïe, plus de bonbons !");
				distributeur.setEtat(new EtatEpuise(distributeur));
			}
		} else {
			System.out.println("Aïe, plus de bonbons !");
			distributeur.setEtat(new EtatEpuise(distributeur));
		}
	}

	@Override
	public void remplir(int nombre) {
		distributeur.setNombre(distributeur.getNombre() + nombre);
		System.out.println("Bonbons ajoutés," + " il y a maintenant " + distributeur.getNombre()
				+ " bonbons dans le distributeur");
	}

	@Override
	public String toString() {
		return "Etat Gagnant !";
	}

}
