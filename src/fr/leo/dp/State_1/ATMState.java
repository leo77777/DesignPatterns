package fr.leo.dp.State_1;

public interface ATMState {

	void insertCard();

	void ejectCard();

	void insertPin(int pinInsered);

	void requestCash(int cashToWithdraw);

}
