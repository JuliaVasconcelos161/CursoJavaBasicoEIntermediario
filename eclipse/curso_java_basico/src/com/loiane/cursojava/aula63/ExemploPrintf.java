package com.loiane.cursojava.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {
		System.out.printf("%s", "Olá, Mundo!");
		System.out.println();
		
		System.out.printf("%S", "Olá, Mundo!");
		System.out.println();
		
		System.out.printf("%c", 'c');
		System.out.println();
		
		System.out.printf("%C", 'c');
		System.out.printf("%n");
		
		int valor = 123456789;
		System.out.printf("%d", valor);
		System.out.printf("%n");
		
		
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);
		
		System.out.println();
		
		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo);
		
		System.out.println();
		
		System.out.printf("%-20s", olaMundo);
		
		System.out.println();
		
		System.out.printf("%+d", valor);
		
		System.out.println();
		
		System.out.printf("%015d", valor);
		
		System.out.println();
		
		System.out.printf("%,d", valor);
		
		int valor2 = -123456789;
		System.out.println();
		
		System.out.printf("% d", valor2);
		System.out.println();
		
		System.out.printf("% d", valor);
		
		System.out.println();
		
		System.out.printf("%.3f", pontoFlutuante);
		
		System.out.println();
		
		System.out.printf("R$%10.2f", pontoFlutuante);
		
		 testeMaisCompleto();
	}
	
	public static void testeMaisCompleto()
	{
		double[] precos = {1000, 123.54, 789.567, 1, 4.56789};
		
		for(int i = 0; i < precos.length; i++)
		{
			System.out.printf("%s %02d: total de RS%10.2f%n", "Item", i+1, precos[i]);
		}
	}
	
	//Java.util.Formater

}
