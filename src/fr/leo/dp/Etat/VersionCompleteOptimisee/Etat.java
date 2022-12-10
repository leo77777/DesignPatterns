package fr.leo.dp.Etat.VersionCompleteOptimisee;

public abstract class Etat {

	void insererPiece() {
		System.out.println("Vous avez d�ja inserer une piece");
	}

	abstract void ejecterPiece();

	abstract void tournerPoignee();

	abstract void delivrer();

	abstract void remplir(int nombre);

}
