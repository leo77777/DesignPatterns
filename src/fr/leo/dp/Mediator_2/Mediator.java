package fr.leo.dp.Mediator_2;

public interface Mediator {

	public void saleOfer(String stock, int shares, int colleagueCode);
	public void buyOfer(String stock, int shares, int colleagueCode);
	public void addColleague(Colleague colleague);

}
