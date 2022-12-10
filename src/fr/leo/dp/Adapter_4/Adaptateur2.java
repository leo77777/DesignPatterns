package fr.leo.dp.Adapter_4;
public class Adaptateur2  implements Standard{
	
	StandardImplInadaptee si1 = new StandardImplInadaptee();
	
	@Override
	public String operation(int a, int b)  {
		String temp = si1.operation2(a, b);
		temp = "ImplementationStandard " + temp.substring(31, 33) +
				" ImplementationStandard " + temp.substring(34, 36) ;
		return temp;
	}
}
