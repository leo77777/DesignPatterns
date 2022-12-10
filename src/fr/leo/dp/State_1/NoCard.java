package fr.leo.dp.State_1;

public class NoCard implements ATMState {
	
	ATMMachine atmMachine;
	
	public NoCard(ATMMachine newAtmMachine) {
		atmMachine = newAtmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("please enter a pin !");
		atmMachine.setATMState(atmMachine.getYesCardState());
	}

	@Override
	public void ejectCard() {
		System.out.println("enter a card first !");
	}

	@Override
	public void insertPin(int pinInsered) {
		System.out.println("enter a card first !");
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("enter a card first !");
	}
}
