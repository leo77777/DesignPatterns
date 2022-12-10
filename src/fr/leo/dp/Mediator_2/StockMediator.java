package fr.leo.dp.Mediator_2;

import java.util.ArrayList;

public class StockMediator implements Mediator {

	private ArrayList<Colleague> colleagues;
	private ArrayList<StockOfer> stockBuyOfers;
	private ArrayList<StockOfer> stockSellOfers;
	protected int colleagueCodes = 0;

	public StockMediator() {
		colleagues = new ArrayList<Colleague>();
		stockBuyOfers = new ArrayList<StockOfer>();
		stockSellOfers = new ArrayList<StockOfer>();
	}

	@Override
	public void addColleague(Colleague newcolleague) {
		colleagueCodes = colleagueCodes + 1;
		newcolleague.setCollCode(colleagueCodes);
		colleagues.add(newcolleague);
	}

	@Override
	public void saleOfer(String stock, int shares, int colleagueCode) {
		boolean stockSold = false;
		for (StockOfer ofer : stockBuyOfers) {
			if ((ofer.getStockSymbol() == stock) && (ofer.getStockShares() == shares)) {
				System.out.println(shares + " shares of " + stock 
						+ " sold to colleague code " + ofer.getColleagueCode());
				stockBuyOfers.remove(ofer);
				stockSold = true;
			}
			if (stockSold)
				break;
		}

		if (!stockSold) {
			System.out.println(shares + " share of " + stock + " added to inventory");
			StockOfer newOfering = new StockOfer(shares, stock, colleagueCode);
			stockSellOfers.add(newOfering);
		}
	}

	@Override
	public void buyOfer(String stock, int shares, int colleagueCode) {
		boolean stockBought = false;
		for (StockOfer ofer : stockSellOfers) {
			if ((ofer.getStockSymbol() == stock) && (ofer.getStockShares() == shares)) {
				System.out.println(
						shares + " shares of " + stock + " bought by colleague code " + ofer.getColleagueCode());
				stockSellOfers.remove(ofer);
				stockBought = true;
			}

			if (stockBought)
				break;
		}

		if (!stockBought) {
			System.out.println(shares + " share of " + stock + " added to inventory");
			StockOfer newOfering = new StockOfer(shares, stock, colleagueCode);
			stockBuyOfers.add(newOfering);
		}
	}

	public void getStockOferings() {
		System.out.println("\nStocks for sale:");
		for (StockOfer ofer : stockSellOfers)
			System.out.println(ofer.getStockShares() + " of " + ofer.getStockSymbol());

		System.out.println("\nStock Buys Ofers:");
		for (StockOfer ofer : stockBuyOfers)
			System.out.println(ofer.getStockShares() + " of " + ofer.getStockSymbol());

	}

}
