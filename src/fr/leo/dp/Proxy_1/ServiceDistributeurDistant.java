package fr.leo.dp.Proxy_1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceDistributeurDistant extends UnicastRemoteObject
		implements InterfaceDistributeurDistant {

	private static final long serialVersionUID = 4156107851804404336L;
	private Etat etatEpuise;
	private Etat etatSansPiece;
	private Etat etatAPiece;
	private Etat etatVendu;

	private Etat etat = etatEpuise;
	private int nombre = 0;
	private String emplacemement;

	public ServiceDistributeurDistant(String emplacement, int nombreBonbons) throws RemoteException {
		emplacemement = emplacement;
		etatEpuise = new EtatEpuise(this);
		etatSansPiece = new EtatSansPiece(this);
		etatAPiece = new EtatAPiece(this);
		etatVendu = new EtatVendu(this);

		this.nombre = nombreBonbons;
		if (nombreBonbons > 0)
			etat = etatSansPiece;
	}

	public void insererPiece() {
		etat.insererPiece();
	}

	public void ejecterPiece() {
		etat.ejecterPiece();
	}

	public void tournerPoignee() {
		etat.tournerPoignee();
		etat.delivrer();
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

	@Override
	public Etat getEtat() {
		return etat;
	}

	@Override
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

	@Override
	public String getEmplacement() throws RemoteException {
		return emplacemement;
	}

}
