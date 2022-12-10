package fr.leo.dp.Proxy_2;

public class Client {
	// @Autowired // ensuite dans l'application vous lui dite
	// autowired, alors le proxy va etre injecté, une instance du proxy !
	// C'est ce qui fait que quand vous travaillé avec Spring tout devient
	// trés simple, c'est parce que lui il génere dynamiquement .
	private IMetier metier = new Proxy();

	public Client() {
		System.out.println(metier.calcul());
	}

	public static void main(String[] args) {
		new Client();
	}
}
