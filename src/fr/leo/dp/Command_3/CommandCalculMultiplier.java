package fr.leo.dp.Command_3;
public class CommandCalculMultiplier implements CommandCalcul {

	Calcul op;

	public CommandCalculMultiplier(Calcul op) {
		this.op = op;
	}

	@Override
	public int executer(int a, int b) {
		return op.multiplier(a, b);
	}
}
