package fr.leo.dp.Mediator_2;

public class StockOfer {

	private int stockShares = 0;
	private String stockSymbol = "";
	private int colleagueCode = 0;

	protected StockOfer(int stockShares, String stockSymbol, int colleagueCode) {
		this.stockShares = stockShares;
		this.stockSymbol = stockSymbol;
		this.colleagueCode = colleagueCode;
	}

	public int getStockShares() {
		return stockShares;
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	public int getColleagueCode() {
		return colleagueCode;
	}
}
