package fr.leo.dp.Adapter_2;

import java.util.Vector;

public class Driver2 {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>();
		v1.add("prem");
		v1.add("deus");
		v1.add("trois");

		AdapteurEnumerationAdapterIterator e2 = new AdapteurEnumerationAdapterIterator(v1.iterator());

		System.out.println(e2.nextElement());
		System.out.println(e2.nextElement());
		System.out.println(e2.nextElement());
	}
}
