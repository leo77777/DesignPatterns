package fr.leo.dp.State_1;

public class Driver {

	public static void main(String[] args) {

		ATMMachine atm1 = new ATMMachine();
		atm1.insertCard();
		atm1.ejectCard();
		atm1.insertCard();
		atm1.insertPin(1234);
		atm1.requestCash(1900);
		atm1.insertCard();
		atm1.insertPin(1234);
		atm1.requestCash(300);
	}

}
