package fr.leo.dp.Command_1;

public class DeviceButton {

	Command theCommand;

	protected DeviceButton(Command theCommand) {
		this.theCommand = theCommand;
	}

	public void press() {
		theCommand.execute();
	}

	public void pressUndo() {
		theCommand.undo();
	}
}
