package com.loiane.cursojava.aula58;

public class TesteAutoBoxing {

	public static void main(String[] args) {
		//autoboxing
		Short num1 = 1;
		Byte num2 = 10;
		Integer num3 = 100;
		Long num4 = 100000l;//new Long(100000l);
		float num5 = 3.5f;
		double num6 = 6.5;
		boolean flag = true;
		char a = 'a';
		
		//autounboxing
		int num7 = num3;//num3.intValue();
		
		num3++;//autoboxing em expressoes
		
		System.out.println(num3);
		
		//auto unboxing num3 ->autoboxing num7/num3 -> num14
		Integer num8 = num7/num3;
		
		//mau uso
		Double d, b, c;
		
		//autoboxing
		d = 10.0;
		b = 12.2;
		c = 4.7;

		Double media = (d+b+c)/3;
		System.out.println(media);
	}

}
