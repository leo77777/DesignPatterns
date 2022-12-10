package fr.leo.dp.Composite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Driver {

	public static void main(String[] args) {
		Constant a = new Constant(10.0);
		Constant b = new Constant(20.0);
		Multiplier c = new Multiplier(a, b);
		System.out.println(c.getValue());

		System.out.println("");
		Expression ce1 = new Divider(
				new Multiplier(new Adder(new Constant(3.0), new Constant(5.0)), new Constant(100.0)),
				new Adder(new Constant(2.0), new Constant(64.0)));
		System.out.println(ce1.getValue());
	}
	
	@Test
	public void test2ComplexExpression() {
		Expression ce1 = new Divider(
				new Multiplier(new Adder(new Constant(3.0), new Constant(5.0)), new Constant(100.0)),
				new Adder(new Constant(2.0), new Constant(64.0)));
		assertEquals(12.121212, ce1.getValue(), 0.1);
	}

}
