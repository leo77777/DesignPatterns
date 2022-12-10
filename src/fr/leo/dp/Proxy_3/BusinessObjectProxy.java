package fr.leo.dp.Proxy_3;

public class BusinessObjectProxy extends BusinessObject {

	private BusinessObject target;

	public BusinessObjectProxy(BusinessObject target) {
		this.target = target;
	}

	@Override
	public void sayHi() {
		System.out.println("je travaille avant ...");
		target.sayHi();
		System.out.println("J'ai bien fermé toutes les vannes");
	}
}
