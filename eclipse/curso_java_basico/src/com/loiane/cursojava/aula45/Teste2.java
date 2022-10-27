package com.loiane.cursojava.aula45;

public class Teste2 {

	public static void main(String[] args) {
		Object obj1 = obterString();//upcasting
		String s1 = (String) obj1;//downcasting
		
		Object obj2 = "Minha Stringg"; //upcasting
		String s2 = (String) obj2;//downcasting
		
		Object obj3 = new Object();
		String s3 = (String) obj3;//falhará em tempo de execução
		
		Object obj4 = obterInteiro();
		String s4 = (String) obj4;//falhará
	}
	
	public static String obterString()
	{
		return "Minha String";
	}
	
	public static int obterInteiro()
	{
		return 1;
	}

}
