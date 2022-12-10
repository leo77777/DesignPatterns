package fr.leo.dp.State_1;

public class HasCard implements ATMState {

	ATMMachine atmMachine;

	public HasCard(ATMMachine newAtmMachine) {
		atmMachine = newAtmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("you can't enter more than one card !");
	}

	@Override
	public void ejectCard() {
		System.out.println("card ejected !");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinInsered) {
		if (pinInsered == 1234) {
			System.out.println("Correct pin");
			atmMachine.correctPinEntered = true;
			atmMachine.setATMState(atmMachine.getHasPin());
		} else {
			System.out.println("Wrong pin");
			atmMachine.correctPinEntered = false;
			System.out.println("card rejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("enter pin first");

	}

}
