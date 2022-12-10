package fr.leo.dp.Adapter_4;
public class Adaptateur extends StandardImplInadaptee implements Standard{
	
	@Override
	public String operation(int a, int b)  {
		String temp = super.operation2(a, b);
		temp = "ImplementationStandard " + temp.substring(31, 33) +
				" ImplementationStandard " + temp.substring(34, 36) ;
		return temp;
	}
}
