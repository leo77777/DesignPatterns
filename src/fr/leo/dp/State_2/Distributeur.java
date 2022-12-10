package fr.leo.dp.State_2;

public class Distributeur {
	private Etat etatEpuise;
	private Etat etatSansPiece;
	private Etat etatAPiece;
	private Etat etatVendu;

	private Etat etat = etatEpuise;
	private int nombre = 0;

	public Distributeur(int nombreBonbons) {

		etatEpuise = new EtatEpuise(this);
		etatSansPiece = new EtatSansPiece(this);
		etatAPiece = new EtatAPiece(this);
		etatVendu = new EtatVendu(this);

		this.nombre = nombreBonbons;
		if (nombreBonbons > 0) {
			etat = etatSansPiece;
			System.out.println(nombreBonbons);
		}
	}

	public void insererPiece() {
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

	public Etat getEtatEpuise() {
		return etatEpuise;
	}

	public Etat getEtatSansPiece() {
		return etatSansPiece;
	}

	public Etat getEtatAPiece() {
		return etatAPiece;
	}

	public Etat getEtatVendu() {
		return etatVendu;
	}

	public Etat getEtat() {
		return etat;
	}

	public int getNombre() {
		return nombre;
	}

	public void setEtatEpuise(Etat etatEpuise) {
		this.etatEpuise = etatEpuise;
	}

	public void setEtatSansPiece(Etat etatSansPiece) {
		this.etatSansPiece = etatSansPiece;
	}

	public void setEtatAPiece(Etat etatAPiece) {
		this.etatAPiece = etatAPiece;
	}

	public void setEtatVendu(Etat etatVendu) {
		this.etatVendu = etatVendu;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

}
