package fr.leo.dp.Stategie.Metier;

public class Employer {
	
	private String cin;
	private float salaireBrutMensuel;
	private ICalculIGR methodeCalculIGR;
	
	public Employer(String cin, float salaireBrutMensuel) {
		super();
		this.cin = cin;
		this.salaireBrutMensuel = salaireBrutMensuel;
	}
	
	public ICalculIGR getMethodeCalculIGR() {
		return methodeCalculIGR;	
	}

	public void setMethodeCalculIGR(ICalculIGR methodeCalculIGR) {
		this.methodeCalculIGR = methodeCalculIGR;
	}

	public float calculerIGR() {
		return methodeCalculIGR.calculerIGR(salaireBrutMensuel *12);
	}
	
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
