package fr.leo.dp.Stategie.MetierBis;

public abstract class  Employer {
	
	private String cin;
	protected float salaireBrutMensuel;
	
	public Employer() {}	
	
	public Employer(String cin, float salaireBrutMensuel) {
		super();
		this.cin = cin;
		this.salaireBrutMensuel = salaireBrutMensuel;
	}

	public abstract float calculerIGR() ;	
	
	public float getSalaireNetMensuel() {
		float igr = calculerIGR();
		float sNM = salaireBrutMensuel* 12 - igr;
		return sNM/12;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public float getSalaireBrutMensuel() {
		return salaireBrutMensuel;
	}
	public void setSalaireBrutMensuel(float salaireBrutMensuel) {
		this.salaireBrutMensuel = salaireBrutMensuel;
	}
}
