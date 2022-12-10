package fr.leo.dp.DecoratorInputStream;
import java.io.InputStream;

public abstract class DecorateurInputStream extends InputStream {	
	InputStream is;
	
	public DecorateurInputStream(InputStream is) {
		this.is = is;
	}	
}
