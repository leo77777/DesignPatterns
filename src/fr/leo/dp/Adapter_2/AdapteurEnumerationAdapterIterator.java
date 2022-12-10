package fr.leo.dp.Adapter_2;

import java.util.Enumeration;
import java.util.Iterator;

public class AdapteurEnumerationAdapterIterator implements Enumeration<String> {

	Iterator<String> i1;

	public AdapteurEnumerationAdapterIterator(Iterator<String> i1) {
		super();
		this.i1 = i1;
	}

	@Override
	public boolean hasMoreElements() {
		return i1.hasNext();
	}

	@Override
	public String nextElement() {
		return i1.next();
	}

}
