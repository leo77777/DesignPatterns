package fr.leo.dp.Singletonbis;

public class Driver {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Connection c1 = SingletonConnection.getConnection();
		Connection c2 = SingletonConnection.getConnection();
		Connection c3 = SingletonConnection.getConnection();

	}
}
