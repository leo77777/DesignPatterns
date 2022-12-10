package fr.leo.dp.Proxy;

public class Main {
	public static void main(String[] args) {
		BusinessObject obj = new BusinessObjectProxy(new BusinessObjectImplementation());
		obj.sayHi();

		System.out.println("");
		BusinessObject a = new BusinessObjectImplementation();
		a.sayHi();
	}
}
