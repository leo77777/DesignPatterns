package fr.leo.dp.Command_1;

public class CdeTeleAllumer implements CommandTele {
	ElectronicDevice theDevice;

	protected CdeTeleAllumer(ElectronicDevice theDevice) {
		this.theDevice = theDevice;
	}

	@Override
	public void execute() {
		theDevice.allumer();
	}

	@Override
	public void undo() {
		theDevice.eteindre();
	}
}
