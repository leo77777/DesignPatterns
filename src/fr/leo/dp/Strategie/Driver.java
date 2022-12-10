package fr.leo.dp.Strategie;

public class Driver {

	public static void main(String[] args) {
		TemplateClass templateClass = new TemplateClass(new StrategyOperation1Impl1(), new StrategyOperation2Impl1());
		System.out.println(templateClass.templateMethod());
		
		templateClass = new TemplateClass(new StrategyOperation1Impl2(), new StrategyOperation2Impl2());
		System.out.println(templateClass.templateMethod());
		
		templateClass = new TemplateClass(new StrategyOperation1Impl1(), new StrategyOperation2Impl2());
		System.out.println(templateClass.templateMethod());
		
		templateClass = new TemplateClass(new StrategyOperation1Impl2(), new StrategyOperation2Impl1());
		System.out.println(templateClass.templateMethod());

	}
}
