package fr.leo.dp.Adapter_3;

public class CustomerAdapter extends NewCustomer implements Customer {
	private OldCustomer oldCustomer;

	public CustomerAdapter(OldCustomer oldCustomer) {
		this.oldCustomer = oldCustomer;
		this.adaptData();
	}

	private void adaptData() {
		this.setName(oldCustomer.getName());
		this.setAge(Integer.valueOf(oldCustomer.getAge()));
		Address address = new Address();
		String[] oldAdress = oldCustomer.getAddress().split(",");

		address.setStreetName(oldAdress[0]);
		address.setHouseNumber(Integer.valueOf(oldAdress[1]));
		address.setPostalCode(Integer.valueOf(oldAdress[2]));
		address.setCity(oldAdress[3]);
		this.setAddress(address);

	}

}
