package fr.leo.dp.DecoratorInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecryptInputStream extends DecorateurInputStream {

	public DecryptInputStream(InputStream is) {
		super(is);
	}

	@Override
	public int read() {
		byte[] tempo = new byte[3] ;
		int resultat = 0;
		
		try {
			is.read(tempo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (byte b : tempo) {
			resultat = resultat + (int) b;
			System.out.println(b);
		}
		
		return resultat;
	}
}
