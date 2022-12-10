package fr.leo.dp.Stategie.MetierBis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import fr.leo.dp.Stategie.MetierBis.Employer;


public class Driver {
	public static void main(String[] args) {
		
		String nomClasse = null;
		Class<?> c;
		
		try {
			Scanner sc = new Scanner(new File("C:\\E\\Java\\YoussfiDesignsPattern\\src\\fr\\leo\\youssfi\\designsPattern\\Stategie\\MetierBis\\config.txt"));
			nomClasse = sc.next();
			c = Class.forName(nomClasse); 	
			Employer e = (Employer) c.newInstance();
			e.setSalaireBrutMensuel(14000);
			System.out.println(e.getSalaireNetMensuel());
			sc.close();
		} catch (FileNotFoundException | ClassNotFoundException | InstantiationException | IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		
		
		

		Employer e2 = new EmployerMaroc("A2", 14000);
		System.out.println(e2.getSalaireNetMensuel());
		
		
	}
}
