package fr.leo.dp.Etat.VersionCompleteOptimisee;

public class EtatEpuise extends Etat {

	Distributeur distributeur;

	public EtatEpuise(Distributeur distributeur) {
		this.distributeur = distributeur;
	}

	@Override
	public void insererPiece() {
		System.out.println("D�sole mais il n'y a plus de bonbons !");
	}

	@Override
	public void ejecterPiece() {
		System.out.println("Vous n'avez pas mis de piece ...");
	}

	@Override
	public void tournerPoignee() {
		System.out.println("D�sol� le distributeur est vide !");
	}

	@Override
	public void delivrer() {
		System.out.println("D�sol� le distributeur est vide !");
	}

	@Override
	public String toString() {
		return "Le distributeur est dans l' etat Epuis� !";
	}

	@Override
	public void remplir(int nombre) {
		distributeur.setNombre(distributeur.getNombre() + nombre);
		System.out.println("Bonbons ajout�s," + " il y a maintenant " + distributeur.getNombre()
				+ " bonbons dans le distributeur");
		distributeur.setEtat(new EtatSansPiece(distributeur));
	}

}
