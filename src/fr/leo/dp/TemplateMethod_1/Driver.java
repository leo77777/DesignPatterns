package fr.leo.dp.TemplateMethod_1;

import java.io.File;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws Exception {
		Requete rq1 = new Requete1();
		rq1.action();

		System.out.println("");
		Requete rq2 = new Requete2();
		rq2.action();

		System.out.println("");
		Scanner fichier = new Scanner(new File("./src/config.txt"));
		String string = fichier.nextLine();
		Requete2 c = (Requete2) Class.forName(string).newInstance();
		c.action();
		fichier.close();

	}
}
