package fr.leo.dp.Command_1;

public class CdeTeleEteindre implements CommandTele {
	ElectronicDevice theDevice;

	protected CdeTeleEteindre(ElectronicDevice theDevice) {
		this.theDevice = theDevice;
	}

	@Override
	public void execute() {
		theDevice.eteindre();
	}

	@Override
	public void undo() {
		theDevice.allumer();
	}
}
