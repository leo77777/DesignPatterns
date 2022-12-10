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
			System.out.println("Vous ne pouvez plus ins�rer de pi�ces");
		else if (etat == SANS_PIECE) {
			etat = A_PIECE;
			System.out.println("Vous avez ins�r� une pi�ce");
		} else if (etat == EPUISE)
			System.out.println("Vous ne pouvez pas ins�rer de pi�ces, nous sommes en rupture      de stock");
		else if (etat == VENDU)
			System.out.println("Veuillez patienter, le bonbon va tomber");
	}

	public void ejecterPiece() {
		if (etat == A_PIECE) {
			System.out.println("Pi�ce retourn�e");
			etat = SANS_PIECE;
		} else if (etat == SANS_PIECE)
			System.out.println("Vous n�avez pas ins�r� de pi�ce");
		else if (etat == VENDU)
			System.out.println("Vous avez d�j� tourn� la poign�e");
		else if (etat == EPUISE)
			System.out.println("�jection impossible, vous n�avez pas ins�r� de pi�ce");
	}

	public void tournerPoignee() {
		if (etat == VENDU)
			System.out.println("Inutile de tourner deux fois !");
		else if (etat == SANS_PIECE)
			System.out.println("Vous avez tourn� mais il n�y a pas de pi�ce");
		else if (etat == EPUISE)
			System.out.println("Vous avez tourn�, mais il n�y a pas de bonbons");
		else if (etat == A_PIECE) {
			System.out.println("Vous avez tourn�...");
			etat = VENDU;
			delivrer();
		}
	}

	public void delivrer() {
		if (etat == VENDU) {
			System.out.println("Un bonbon va sortir");
			nombre = nombre - 1;
			if (nombre == 0) {
				System.out.println("A�e, plus de bonbons !");
				etat = EPUISE;
			} else
				etat = SANS_PIECE;
		} else if (etat == SANS_PIECE)
			System.out.println("Il faut payer d�abord");
		else if (etat == EPUISE)
			System.out.println("Pas de bonbon d�livr�");
		else if (etat == A_PIECE)
			System.out.println("Pas de bonbon d�livr�");
	}

	@Override
	public String toString() {
		return Integer.toString(nombre);
	}
}
