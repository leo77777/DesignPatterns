package fr.leo.dp.Command_1;

public class CdeTeleVolumeUp implements CommandTele {
	ElectronicDevice theDevice;

	protected CdeTeleVolumeUp(ElectronicDevice theDevice) {
		this.theDevice = theDevice;
	}

	@Override
	public void execute() {
		theDevice.volumeUp();
	}

	@Override
	public void undo() {
		theDevice.volumeDown();
	}
}
