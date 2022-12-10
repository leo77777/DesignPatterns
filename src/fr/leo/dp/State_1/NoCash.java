package fr.leo.dp.State_1;

public class NoCash implements ATMState {

	ATMMachine atmMachine;

	public NoCash(ATMMachine newAtmMachine) {
		atmMachine = newAtmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("we don't have money");
	}

	@Override
	public void ejectCard() {
		System.out.println("we don't have money. You didn't enter a card");

	}

	@Override
	public void insertPin(int pinInsered) {
		System.out.println("we don't have money");
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("we don't have money");
	}
}
