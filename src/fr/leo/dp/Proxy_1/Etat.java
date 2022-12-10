package fr.leo.dp.Proxy_1;

import java.io.Serializable;

public interface Etat extends Serializable {

	void insererPiece();

	void ejecterPiece();

	void tournerPoignee();

	void delivrer();

}
