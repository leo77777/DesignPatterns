package fr.leo.dp.Etat.VersionTrois;

public class Distributeur {
	// private Etat etatEpuise;
	// private Etat etatSansPiece;
	// private Etat etatAPiece;
	// private Etat etatVendu;

	private Etat etat = new EtatEpuise(this);
	private int nombre = 0;

	public Distributeur(int nombreBonbons) {
		this.nombre = nombreBonbons;
		if (nombreBonbons > 0) {
			etat = new EtatSansPiece(this);
			System.out.println(nombreBonbons);
		}
	}

	public void montrer() {
		if (this.etat.getClass().getName() == (new EtatSansPiece(this)).getClass().getName())
			System.out.println("juste");
	}

	public void insererPiece() {
		if (this.etat.getClass().getName() == (new EtatAPiece(this)).getClass().getName())
		etat.insererPiece();
	}

	public void ejecterPiece() {
		etat.ejecterPiece();
	}

	public void tournerPoignee() {
		etat.tournerPoignee();
		// etat.delivrer();
	}

	void setEtat(Etat etat) {
		this.etat = etat;
	}

	void liberer() {
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
