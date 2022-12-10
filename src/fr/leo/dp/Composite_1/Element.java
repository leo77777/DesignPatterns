package fr.leo.dp.Composite_1;

public class Element extends Composant{


	public Element(String nom) {
		super(nom);
	}

	@Override
	public void operation() {
		String tab = "";
		for (int i = 0; i < niveau; i++) {
			tab= tab + "----";
		}
		System.out.println(tab + " Element " + nom);
	}
}
