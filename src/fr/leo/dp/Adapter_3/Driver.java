package fr.leo.dp.Adapter_3;

public class Driver {

	public static void main(String[] args) {
		System.out.println("\nAncien objet:");
		OldCustomer oldCustomer = new OldCustomer();
		oldCustomer.setName("Tom");
		oldCustomer.setAge("30");
		oldCustomer.setAddress("GoldStreet,10,20021,New York");
		System.out.println("Name: " + oldCustomer.getName());
		System.out.println("Age: " + oldCustomer.getAge());
		System.out.println("Adresse: " + oldCustomer.getAddress());

		System.out.println("\nAdapateur: ");
		Customer customer = new CustomerAdapter(oldCustomer);
		System.out.println("Name: " + customer.getName());
		System.out.println("Age: " + customer.getAge());
		System.out.println("Adresse: " + customer.getAddress());

		System.out.println("\nNouvel objet:");
		NewCustomer nc1 = new NewCustomer();
		Address adr = new Address();
		adr.setCity("Stockolm");
		adr.setHouseNumber(23);
		adr.setPostalCode(7000);
		adr.setStreetName("rue des semis");
		nc1.setAddress(adr);
		nc1.setAge(10);
		nc1.setName("Jonas");
		System.out.println("Name: " + nc1.getName());
		System.out.println("Age: " + nc1.getAge());
		System.out.println("Adresse: " + nc1.getAddress());

	}

}
