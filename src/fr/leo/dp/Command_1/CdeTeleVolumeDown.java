package fr.leo.dp.Command_1;

public class CdeTeleVolumeDown implements CommandTele {
	ElectronicDevice theDevice;

	protected CdeTeleVolumeDown(ElectronicDevice theDevice) {
		this.theDevice = theDevice;
	}

	@Override
	public void execute() {
		theDevice.volumeDown();
		;
	}

	@Override
	public void undo() {
		theDevice.volumeUp();
	}
}
