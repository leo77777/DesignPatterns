package fr.leo.dp.EtatBasique;

public class Distributeur {
	final static int EPUISE = 0;
	final static int SANS_PIECE = 1;
	final static int A_PIECE = 2;
	final static int VENDU = 3;
	int etat = EPUISE;
	int nombre = 0;

	public Distributeur(int nombre) {
		this.nombre = nombre;
		if (nombre > 0)
			etat = SANS_PIECE;
	}

	public void insererPiece() {
		if (etat == A_PIECE)
			System.out.println("Vous ne pouvez plus insérer de pièces");
		else if (etat == SANS_PIECE) {
			etat = A_PIECE;
			System.out.println("Vous avez inséré une pièce");
		} else if (etat == EPUISE)
			System.out.println("Vous ne pouvez pas insérer de pièces, nous sommes en rupture      de stock");
		else if (etat == VENDU)
			System.out.println("Veuillez patienter, le bonbon va tomber");
	}

	public void ejecterPiece() {
		if (etat == A_PIECE) {
			System.out.println("Pièce retournée");
			etat = SANS_PIECE;
		} else if (etat == SANS_PIECE)
			System.out.println("Vous n’avez pas inséré de pièce");
		else if (etat == VENDU)
			System.out.println("Vous avez déjà tourné la poignée");
		else if (etat == EPUISE)
			System.out.println("Éjection impossible, vous n’avez pas inséré de pièce");
	}

	public void tournerPoignee() {
		if (etat == VENDU)
			System.out.println("Inutile de tourner deux fois !");
		else if (etat == SANS_PIECE)
			System.out.println("Vous avez tourné mais il n’y a pas de pièce");
		else if (etat == EPUISE)
			System.out.println("Vous avez tourné, mais il n’y a pas de bonbons");
		else if (etat == A_PIECE) {
			System.out.println("Vous avez tourné...");
			etat = VENDU;
			delivrer();
		}
	}

	public void delivrer() {
		if (etat == VENDU) {
			System.out.println("Un bonbon va sortir");
			nombre = nombre - 1;
			if (nombre == 0) {
				System.out.println("Aïe, plus de bonbons !");
				etat = EPUISE;
			} else
				etat = SANS_PIECE;
		} else if (etat == SANS_PIECE)
			System.out.println("Il faut payer d’abord");
		else if (etat == EPUISE)
			System.out.println("Pas de bonbon délivré");
		else if (etat == A_PIECE)
			System.out.println("Pas de bonbon délivré");
	}

	@Override
	public String toString() {
		return Integer.toString(nombre);
	}
}
