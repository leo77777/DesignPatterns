package fr.leo.dp.Strategie;

public class TemplateClass {
	private StrategyOperation1 operation1;
	private StrategyOperation2 operation2;
	
	public TemplateClass(StrategyOperation1 operation1, 
			StrategyOperation2 operation2) {
		super();
		this.operation1 = operation1;
		this.operation2 = operation2;
	}
	
	public int templateMethod(){
		int a = operation1.operation1();
		int somme =0 ;
		for (int i = 0; i < a; i++) {
			int b = operation2.operation2();
			somme = somme +b;
		}
		return somme;
	}
}
