package fr.leo.dp.Command_1;

public class Radio implements ElectronicDevice {

	private int volume;

	@Override
	public void allumer() {
		System.out.println("Radio allum�e");
	}

	@Override
	public void eteindre() {
		System.out.println("Radio �teinte");
	}

	@Override
	public void volumeUp() {
		volume = volume + 1;
		System.out.println("Radio Le volume est � " + volume);
	}

	@Override
	public void volumeDown() {
		volume = volume - 1;
		System.out.println("Radio Le volume est � " + volume);
	}

}
