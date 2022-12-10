package fr.leo.dp.DecoratorInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class Driver {

	public static void main(String[] args) {
		InputStream is = null;
		int resultat = 0;
		
		try {
			is = new FileInputStream("src/fr/leo/youssfi/designsPattern/DecorateurInputStream/test.txt");
			is = new DecryptInputStream(is);
			resultat = is.read();
			System.out.println("\nresultat: " + resultat);
			is.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
