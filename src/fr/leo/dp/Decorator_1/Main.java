package fr.leo.dp.Decorator_1;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame jf1 = new JFrame();
		GraphicalComponent tf = new TextField();
		jf1.add(tf);
		jf1.setSize(300, 400);
		jf1.setVisible(true);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		tf = tf.addContent("la la la \n");
		// tf = tf.addContent("la2 la la \n");
		// tf = tf.addContent("la3 la la \n");
		// tf = tf.addContent("la4 la la \n");
		tf.paint();
		System.out.println(tf);

		System.out.println("");
		// tf = tf.addContent("la la la");
		tf.paint();
		System.out.println(tf);

		System.out.println("");
		tf = tf.addContent("la la la");
		tf.paint();
		System.out.println(tf);

		System.out.println("");
		tf = new BorderDecorator(tf);
		tf.paint();
		System.out.println(tf);

		// System.out.println("");
		// tf.addContent("le le le");
		// tf.addContent("le le ler");
		// tf.addContent("le le les");
		// tf.addContent("le le les");
		// tf.addContent("le le les");
		// tf.paint();
		// System.out.println(tf);
		//
		// System.out.println("");
		// tf = new SrollBarDecorator(tf);
		// tf.paint();
		// System.out.println(tf);
		//
		// System.out.println("");
		// tf.addContent("plus ........");
		// tf.paint();
		// System.out.println(tf);
		
		


		// System.out.println("");
		// tf = new SrollBarDecorator(tf);
		// tf.paint();
		//
		// System.out.println("");
		// tf = tf.addContent("li li li ");
		// tf.paint();
		//
		// System.out.println("");
		// tf = tf.addContent("le le le");
		// tf.paint();
		//
		// System.out.println("");
		// tf = tf.addContent("le le le");
		// tf.paint();
		// GraphicalComponent tf = constructHPoeme();
		// tf.paint();

		// System.out.println("Prem: " + tf + " " + tf.hashCode());
		// tf = new BorderDecorator(tf);
		// add border to the textField !
		// System.out.println("Deus: " + tf + " " + tf.hashCode());
		// tf.paint();
		// tf.addContent("eaezaeza");
		// tf.paint();
	}

	public static GraphicalComponent constructHPoeme() {
		GraphicalComponent tf = new TextField();
		// tf = tf.addContent("la la la");
		// tf = tf.addContent("li li li ");
		// tf = tf.addContent("le le le");
		return tf;
	}
}
