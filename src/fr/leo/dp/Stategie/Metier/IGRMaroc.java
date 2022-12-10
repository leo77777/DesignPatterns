package fr.leo.dp.Stategie.Metier;

public class IGRMaroc implements ICalculIGR {
	
	public IGRMaroc(String titi) {
		// TODO Auto-generated constructor stub
	}
	
	public IGRMaroc() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculerIGR(float sba) {
		if (sba < 40000) {
			return 5*sba/100;
		}else if (sba < 120000) {
			return sba*20/100;
		}else {
			return sba*42/100;
		}
	}
}
