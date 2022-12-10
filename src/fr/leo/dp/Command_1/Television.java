package fr.leo.dp.Command_1;

public class Television implements ElectronicDevice {

	private int volume;

	@Override
	public void allumer() {
		System.out.println("Télé allumée");
	}

	@Override
	public void eteindre() {
		System.out.println("Télé éteinte");
	}

	@Override
	public void volumeUp() {
		volume = volume + 1;
		System.out.println("Le volume est à " + volume);
	}

	@Override
	public void volumeDown() {
		volume = volume - 1;
		System.out.println("Le volume est à " + volume);
	}

}
