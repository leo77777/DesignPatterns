package fr.leo.dp.Mediator_2;

public class Driver {

	public static void main(String[] args) {
		StockMediator nyse = new StockMediator();
		Toto toto = new Toto(nyse);
		JTToto jtToto = new JTToto(nyse);

		System.out.println("");
		jtToto.buyOfer("Velos", 10);
		jtToto.saleOfer("Velos", 10);

		System.out.println("");
		toto.saleOfer("Velos", 100);
		toto.saleOfer("Livres", 50);

		
		System.out.println("");
		jtToto.buyOfer("Velos", 100);


		System.out.println("");
		jtToto.saleOfer("Ponts", 10);
		toto.buyOfer("Ponts", 10);

		
		nyse.getStockOferings();


	}

}
