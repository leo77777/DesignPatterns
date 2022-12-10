package fr.leo.dp.Adapter_2;

import java.util.Vector;

public class Driver {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>();
		v1.add("prem");
		v1.add("deus");
		v1.add("trois");
		
		 AdapteurIteratorAdapterEnumeration  i1 = new
				 AdapteurIteratorAdapterEnumeration(v1.elements());				
		
		while (i1.hasNext()) {
			String string = i1.next();
			System.out.println(string);
		}	
	}
}
