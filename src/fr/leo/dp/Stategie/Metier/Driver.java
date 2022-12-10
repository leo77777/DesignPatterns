package fr.leo.dp.Stategie.Metier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		String nomClasse = null;
		Class<?> c;
		ICalculIGR mci = null;
		Employer e = new Employer("A1", 14000);
		
		try {
			Scanner sc = new Scanner(new File("C:\\E\\Java\\YoussfiDesignsPattern\\src\\fr\\leo\\youssfi\\designsPattern\\Stategie\\Metier\\config.txt"));
			nomClasse = sc.next();
			c = Class.forName(nomClasse);
			mci = (ICalculIGR) c.newInstance();
			sc.close();
		} catch (FileNotFoundException | ClassNotFoundException | InstantiationException | IllegalAccessException e1) {
			e1.printStackTrace();
		}


		
		//e.setMethodeCalculIGR(new IGRMaroc());
		e.setMethodeCalculIGR(mci);
		System.out.println("Salaire net mensuel: " + e.getSalaireNetMensuel());
		
		e.setMethodeCalculIGR(new IGRAlgerie());
		System.out.println("Salaire net mensuel: " + e.getSalaireNetMensuel());

	}

}
