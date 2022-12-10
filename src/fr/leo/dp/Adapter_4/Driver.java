package fr.leo.dp.Adapter_4;
public class Driver {
	public static void main(String[] args) {
		Client c1 = new Client(new StandardImpl1());
		System.out.println(c1.interfaceStandard.operation(10, 20));
		Client c2 = new Client(new StandardImpl2());
		System.out.println(c2.interfaceStandard.operation(30, 40));
		
		StandardImplInadaptee c4 = new StandardImplInadaptee();
		System.out.println(c4.operation2(50, 60));
		
		Client c3 = new Client(new Adaptateur());
		System.out.println(c3.interfaceStandard.operation(50, 60));
		
		Client c5 = new Client(new Adaptateur2());
		System.out.println(c5.interfaceStandard.operation(50, 60));
	}
}
