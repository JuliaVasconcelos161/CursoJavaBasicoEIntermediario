package com.loiane.cursojava.aula13;
import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado =  resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta e ";
		String segundoNome = "uma String concatenada";
		String terceitoNome = primeiroNome + segundoNome;
		System.out.println(terceitoNome);
		
		
		resultado = resultado + 1; 
		System.out.println(resultado);
		
		resultado++; 
		System.out.println(resultado);
		
		System.out.println(resultado++);
		//Vai ser igual 
		System.out.println(resultado);
//		Pois o resultado sera printado antes da incrementacao
		
		System.out.println(++resultado);
//		Sera o mesmo que
		resultado+=1;
		System.out.println(resultado);
//		Nesse caso o resultado sera incrementado antes de qualquer coisa e depois printado
		
		resultado--;
		System.out.println(resultado);
		
		System.out.println(resultado--);
		System.out.println(--resultado);
		
		 
		
		

	}

}
