package fr.leo.dp.Stategie.Enum;

public class Driver {
	public static void main(String[] args) {
		Objet o1 = new Objet();
		o1.doIt();

		o1.setStrategie(StrategieEnum.Strategie2);
		o1.doIt();

		o1.setStrategie(StrategieEnum.Strategie1);
		o1.doIt();

		System.out.println("");
		System.out.print("Entrez un nombre: ");
		//Scanner clavier = new Scanner(System.in);
		// if (clavier.hasNextByte())
		// System.out.println("Voila: " + clavier.nextByte());
		// else
		// System.out.println("");

		System.out.println(Math.ceil(2.9));
		System.out.println(Math.floor(2.9));
		System.out.println(Math.max(10, 12));
		System.out.println(Math.round(10.2));
		System.out.println(Math.round(10.7));
		float aze = Math.round(10.2);
		System.out.println(aze);
		System.out.println(Math.random()); 
		System.out.println(Math.random()* 10 ); 

		System.out.println((int) (Math.random() * 10)); 
		System.out.println((int) (Math.random() * 11)); 
														

		System.out.println((10 > 20) | (10 > 4));
		System.out.println((10 > 20) || (10 > 4));

		System.out.println((10 > 2) & (10 > 4)); 
		System.out.println((10 > 2) && (10 > 4));

		System.out.println((10 > 20) ^ (10 > 4));

		int un = 10;
		int deus = 2;
		int res = (un > deus) ? un : deus;
		System.out.println(res);

		String s1 = "test";
		switch (s1) {
		case "Test":
		case "test":
			System.out.println("super !");
			break;
		case "Test1":
			System.out.println("pas ok");
			break;
		case "Test2":
			System.out.println("toujours pas ok !");
			break;
		}

		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);

		char a = 65;
		char b = 'A';
		System.out.println("a " + a + "     " + "b " + b);

		char escapedCarac = '\\'; // n line feed, f form feed, r carriage return
									// b back space , t tab, " double quote, '
									// single quote
									// \ back slash

		System.out.println(escapedCarac);

		int entier = 124;
		String string1 = Integer.toString(entier);
		string1 = string1.substring(1);
		System.out.println(string1);

		double double1 = 10.123456789;
		float float1 = (float) double1;
		System.out.println(float1);

		System.out.println("");
		float float2 = 10.123456789f;
		double double2 = float2;
		System.out.println(float2);
		System.out.println(double2);

		System.out.println("");
		float float3 = 100000000001.1234f;
		int int1 = (int) float3;
		System.out.println(float3);
		System.out.println(int1);
		System.out.println(Integer.MAX_VALUE);		

		String prem = "111";
		int stringToInt = Integer.parseInt(prem);
		System.out.println(stringToInt);
		System.out.println(stringToInt + 5);
	}
}
