package com.loiane.cursojava.aula11;

public class CuriosidadeDosInteiros {

	public static void main(String[] args) {
		int var1 = 2147483647;
		int var2 = 1;
		
		System.out.println(var1 + var2);
		//O valor sera -2147483647
		//Pois quando da overflow retorna para o menor numero que pode ser representado por int

	}

}
