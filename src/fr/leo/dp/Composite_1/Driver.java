package fr.leo.dp.Composite_1;
public class Driver {
	public static void main(String[] args) {
		
		Composite racine = new Composite("racine");
		Composite composite2 = new Composite("composite2");		
		racine.add(composite2);
		racine.add(new Element("fichier 11"));
		racine.add(new Element("fichier 12"));
		racine.add(new Element("fichier 13"));
		composite2.add(new Element("fichier 21"));
		composite2.add(new Element("fichier 22"));		
		racine.operation();
		
		System.out.println("");
		composite2.operation();
	}
}
