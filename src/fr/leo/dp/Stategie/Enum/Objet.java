package fr.leo.dp.Stategie.Enum;

public class Objet {

	// StrategieEnum strategieEnum = StrategieEnum.Strategie1;
	Strategie strategie;

	public Objet() {
		this.strategie = new Strategie1();
	}

	public void setStrategie(StrategieEnum strategieEnum) {
		if (strategieEnum.equals(StrategieEnum.Strategie1))
			this.strategie = new Strategie1();
		else if (strategieEnum.equals(StrategieEnum.Strategie2))
			this.strategie = new Strategie2();
	}

	public void doIt() {
		strategie.aFaire();
	}
}
