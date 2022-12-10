package fr.leo.dp.TemplateMethod_2;

public abstract class TemplateClass {
	
	protected abstract int operation1();
	protected	 abstract int operation2();
	
	public int templateMethod(){
		int a = operation1();
		int somme =0 ;
		for (int i = 0; i < a; i++) {
			int b = operation2();
			somme = somme +b;
		}
		return somme;
	}
}
