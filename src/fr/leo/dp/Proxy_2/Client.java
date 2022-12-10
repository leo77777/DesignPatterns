package fr.leo.dp.Proxy_2;

public class Client {
	// @Autowired // ensuite dans l'application vous lui dite
	// autowired, alors le proxy va etre inject�, une instance du proxy !
	// C'est ce qui fait que quand vous travaill� avec Spring tout devient
	// tr�s simple, c'est parce que lui il g�nere dynamiquement .
	private IMetier metier = new Proxy();

	public Client() {
		System.out.println(metier.calcul());
	}

	public static void main(String[] args) {
		new Client();
	}
}
