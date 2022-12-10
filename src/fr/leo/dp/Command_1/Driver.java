package fr.leo.dp.Command_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// ElectronicDevice theDevice = TVRemote.getDevice();

		Television theDevice = new Television();

		CdeTeleAllumer onCommand = new CdeTeleAllumer(theDevice);
		CdeTeleEteindre ofCommand = new CdeTeleEteindre(theDevice);
		CdeTeleVolumeUp upCommand = new CdeTeleVolumeUp(theDevice);
		CdeTeleVolumeDown downCommand = new CdeTeleVolumeDown(theDevice);

		List<Command> liste = new LinkedList<>();

		DeviceButton onPressed = new DeviceButton(onCommand);
		onPressed.press();
		liste.add(0, onPressed.theCommand);
		onPressed = new DeviceButton(ofCommand);
		onPressed.press();
		liste.add(0, onPressed.theCommand);
		onPressed = new DeviceButton(upCommand);
		onPressed.press();
		liste.add(0, onPressed.theCommand);
		onPressed.press();
		liste.add(0, onPressed.theCommand);
		onPressed.press();
		liste.add(0, onPressed.theCommand);
		onPressed = new DeviceButton(downCommand);
		onPressed.press();
		liste.add(0, onPressed.theCommand);
		onPressed.press();
		liste.add(0, onPressed.theCommand);

		System.out.println("\nDefaire: ");
		for (Command command : liste)
			command.undo();

		System.out.println("\nPlusieurs appareils : tele et radio");
		Television theTv = new Television();
		Radio theRadio = new Radio();

		List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
		allDevices.add(theTv);
		allDevices.add(theRadio);
		CdeToutEteindre toutEteindre = new CdeToutEteindre(allDevices);
		DeviceButton turnThemOf = new DeviceButton(toutEteindre);
		turnThemOf.press();
		turnThemOf.pressUndo();

		System.out.println("\nAvec une télécommande: ");
		RemoteControl r1 = new RemoteControl();
		theDevice = new Television();

		CdeTeleAllumer onCommand2 = new CdeTeleAllumer(theDevice);
		CdeTeleEteindre ofCommand2 = new CdeTeleEteindre(theDevice);
		CdeTeleVolumeUp upCommand2 = new CdeTeleVolumeUp(theDevice);
		CdeTeleVolumeDown downCommand2 = new CdeTeleVolumeDown(theDevice);
		r1.add("Allumer", onCommand2);
		r1.add("Eteindre", ofCommand2);
		r1.add("Fort", upCommand2);
		r1.add("Doux", downCommand2);
		r1.action("Allumer");
		r1.action("Fort");
		r1.action("Doux");
		r1.action("Eteindre");
	}
}
