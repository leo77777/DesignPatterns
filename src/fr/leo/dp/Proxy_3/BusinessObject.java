package fr.leo.dp.Proxy_3;

public abstract class BusinessObject {

	abstract void sayHi();

	public static BusinessObject create() {
		return new BusinessObjectProxy(new BusinessObjectImplementation());
	}

}