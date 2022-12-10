package fr.leo.dp.State_1;

public class HasPin implements ATMState {

	ATMMachine atmMachine;

	public HasPin(ATMMachine newAtmMachine) {
		atmMachine = newAtmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("you can't enter more than one card");
	}

	@Override
	public void ejectCard() {
		System.out.println("card ejected !");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinInsered) {
		System.out.println("already entered pin !");
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		if (atmMachine.cashInMachine >= cashToWithdraw) {
			System.out.println(cashToWithdraw + " is provided by the machine");
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
			System.out.println("card ejected !");
			atmMachine.setATMState(atmMachine.getNoCardState());
			if (atmMachine.cashInMachine <= 0)
				atmMachine.setATMState(atmMachine.getNoCashState());
		} else {
			System.out.println("don't have that cash");
			System.out.println("card rejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}

	}

}
