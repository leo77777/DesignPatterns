package fr.leo.dp.Adapter_2;

import java.util.Enumeration;
import java.util.Iterator;

public class AdapteurIteratorAdapterEnumeration implements Iterator<String> {
	Enumeration<String> enumeration;

	public AdapteurIteratorAdapterEnumeration(Enumeration<String> enumeration) {
		super();
		this.enumeration = enumeration;
	}

	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public String next() {
		return enumeration.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
