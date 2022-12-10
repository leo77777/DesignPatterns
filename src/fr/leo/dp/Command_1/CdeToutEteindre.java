package fr.leo.dp.Command_1;

import java.util.List;

public class CdeToutEteindre implements Command {

	List<ElectronicDevice> theDevices;

	protected CdeToutEteindre(List<ElectronicDevice> theDevices) {
		this.theDevices = theDevices;
	}

	@Override
	public void execute() {
		for (ElectronicDevice electronicDevice : theDevices)
			electronicDevice.eteindre();
	}

	@Override
	public void undo() {
		for (ElectronicDevice electronicDevice : theDevices)
			electronicDevice.allumer();
	}

}
