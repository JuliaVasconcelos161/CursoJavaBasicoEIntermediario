package com.loiane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		int i = 1;
		int max = 10;
		
		System.out.println("Contando ate " + max);
		 while (i <= max)
		 {
			 System.out.println("O valor de i: " + i); 
			 i++;
		 }
		 
		 System.out.println(i);
		 
		 do
		 {
			 i++;
			 System.out.println("Valor de i: " + i);
		 }while(i < 13);
		 
		 System.out.println(i);
	}

}
