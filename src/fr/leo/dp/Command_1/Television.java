package fr.leo.dp.Command_1;

public class Television implements ElectronicDevice {

	private int volume;

	@Override
	public void allumer() {
		System.out.println("T�l� allum�e");
	}

	@Override
	public void eteindre() {
		System.out.println("T�l� �teinte");
	}

	@Override
	public void volumeUp() {
		volume = volume + 1;
		System.out.println("Le volume est � " + volume);
	}

	@Override
	public void volumeDown() {
		volume = volume - 1;
		System.out.println("Le volume est � " + volume);
	}

}
