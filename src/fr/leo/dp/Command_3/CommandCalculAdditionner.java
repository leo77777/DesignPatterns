package fr.leo.dp.Command_3;
public class CommandCalculAdditionner implements CommandCalcul {

	Calcul op;

	public CommandCalculAdditionner(Calcul op) {
		this.op = op;
	}

	@Override
	public int executer(int a, int b) {
		return op.somme(a, b);
	}
}
