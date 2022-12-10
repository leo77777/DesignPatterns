package fr.leo.dp.Strategie_1;	
public class Context {
	
	protected Strategy strategy;
	
	public Context() {
		strategy = new StrategyImp1();
	}
	
	public void apliquerStrategie() {
		strategy.operationStrategy();
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
}
