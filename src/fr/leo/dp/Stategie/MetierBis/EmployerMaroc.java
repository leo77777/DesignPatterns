package fr.leo.dp.Stategie.MetierBis;

public class EmployerMaroc extends Employer {

	public EmployerMaroc(String cin, float salaireBrutMensuel) {
		super(cin, salaireBrutMensuel);
	}
	
	public EmployerMaroc() {
	}

	@Override
	public float calculerIGR() {
		 float sba = salaireBrutMensuel * 12;
		if (sba < 40000) {
			return 5*sba/100;
		}else if (sba < 120000) {
			return sba*20/100;
		}else {
			return sba*42/100;
		}
	}

}
