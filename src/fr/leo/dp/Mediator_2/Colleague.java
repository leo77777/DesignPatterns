package fr.leo.dp.Mediator_2;

public abstract class Colleague {

	private Mediator mediator;
	public int colleagueCode;

	protected Colleague(Mediator mediator) {
		this.mediator = mediator;
		mediator.addColleague(this);
	}

	public void saleOfer(String stock, int shares) {
		mediator.saleOfer(stock, shares, this.colleagueCode);
	}

	public void buyOfer(String stock, int shares) {
		mediator.buyOfer(stock, shares, this.colleagueCode);
	}

	public void setCollCode(int collCode) {
		colleagueCode = collCode;
	}
}
