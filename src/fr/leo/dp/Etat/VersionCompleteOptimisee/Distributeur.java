package fr.leo.dp.Etat.VersionCompleteOptimisee;

public class Distributeur {
	// private Etat etatEpuise;
	// private Etat etatSansPiece;
	// private Etat etatAPiece;
	// private Etat etatVendu;

	private Etat etat = new EtatEpuise(this);
	private int nombre = 0;

	public Distributeur(int nombreBonbons) {
		nombre = nombreBonbons;
		if (nombreBonbons > 0)
			etat = new EtatSansPiece(this);
	}

	public void insererPiece() {
		etat.insererPiece();
	}

	public void ejecterPiece() {
		etat.ejecterPiece();
	}

	public void tournerPoignee() {
		etat.tournerPoignee();
		etat.delivrer(); // Delivrer n'est pas une action externe faite par
							// l'utilisateur
							// donc il faut que ce soit le Distributeur qui
							// lance cette action !!!
	}

	public void remplir(int nombre) {
		etat.remplir(nombre);
	}

	void setEtat(Etat etat) {
		this.etat = etat;
	}

	protected void liberer() {
		System.out.println("Un bonbon va sortir ...");
		if (nombre != 0)
			nombre = nombre - 1;
		System.out.println("Il reste " + getNombre() + " bonbons dans la machine !");
	}

	public Etat getEtat() {
		return etat;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}


}
