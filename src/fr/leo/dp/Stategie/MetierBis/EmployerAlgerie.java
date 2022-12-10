package fr.leo.dp.Stategie.MetierBis;

public class EmployerAlgerie extends Employer {

	public EmployerAlgerie() {
	}
	
	public EmployerAlgerie(String cin, float salaireBrutMensuel) {
		super(cin, salaireBrutMensuel);
	}		

	@Override
	public float calculerIGR() {
		 float sba = salaireBrutMensuel * 12;
		return sba*35/100;
	}
}
