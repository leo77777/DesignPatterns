package fr.leo.dp.Command_1;

public class Radio implements ElectronicDevice {

	private int volume;

	@Override
	public void allumer() {
		System.out.println("Radio allumée");
	}

	@Override
	public void eteindre() {
		System.out.println("Radio éteinte");
	}

	@Override
	public void volumeUp() {
		volume = volume + 1;
		System.out.println("Radio Le volume est à " + volume);
	}

	@Override
	public void volumeDown() {
		volume = volume - 1;
		System.out.println("Radio Le volume est à " + volume);
	}

}
