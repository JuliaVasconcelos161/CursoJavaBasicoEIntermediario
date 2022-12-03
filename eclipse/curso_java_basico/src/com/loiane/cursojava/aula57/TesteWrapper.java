package com.loiane.cursojava.aula57;

public class TesteWrapper {
	public static void main(String[] args)
	{
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 100000l;
		float num5 = 3.5f;
		double num6 = 6.5;
		boolean flag = true;
		char a = 'a';
		
		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte)10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000l);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(6.5);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
		
		
		//Pode gerar uma exceção (NumberFormatException)
		Integer num13 = new Integer("100");
		Double num14 = new Double("10.4");
		
		System.out.println(num13.intValue());
		System.out.println(num13.longValue());
		
		Long num15 = num13.longValue();
		
		//Também pode gerar uma exceção (NumberFormatException)
		int num16 = Integer.parseInt("1000000");
		
		double num17 = Double.parseDouble("3.44444");
		System.out.println(num17);
		
		Integer num18 = Integer.valueOf(1343);//transforma um tipo inteiro primitivo em uma instancia da classe Integer
		System.out.println(num18);
		
		//Comparacao de tipos primitivos
		
		//Não se usa == para comparar Wrappers
		System.out.println(num9 == num13);
	}
}
