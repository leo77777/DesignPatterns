package fr.leo.dp.Proxy_3;

public class Main {

	public static void main(String[] args) {

		BusinessObject obj = BusinessObject.create();
		obj.sayHi();

		System.out.println("");
		BusinessObject a = new BusinessObjectImplementation();
		a.sayHi();
	}
}
