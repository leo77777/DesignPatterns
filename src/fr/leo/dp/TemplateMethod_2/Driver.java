package fr.leo.dp.TemplateMethod_2;

public class Driver {

	public static void main(String[] args) {

		TemplateClass templateClass = new Implementation1();
		System.out.println(templateClass.templateMethod());

		templateClass = new Implementation2();
		System.out.println(templateClass.templateMethod());

	}
}
