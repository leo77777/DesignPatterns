package fr.leo.dp.Strategie_1;
public class Driver {
	public static void main(String[] args) {
		Context context = new Context();
		
		context.setStrategy(new StrategyImp1());
		context.apliquerStrategie();
		
		context.setStrategy(new StrategyImp2());
		context.apliquerStrategie();
		
		context.setStrategy(new StrategyImp3());
		context.apliquerStrategie();
	}
}
