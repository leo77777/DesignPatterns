package fr.leo.dp.Command;

public class Demo {

	public static void main(String[] args) {
		System.out.println("La somme de 1 à 100 est: " + sum(1, 100, new Addition()));
		System.out.println("La carré de 1 à 10 est: " + sum(1, 10, new Carre()));
	}
	private static int sum(int lower, int upper, Function f) {
		int sum = 0;
		for (int i = lower; i <= upper; i++)
			sum = sum + f.apply(i);
		return sum;
	}
}
