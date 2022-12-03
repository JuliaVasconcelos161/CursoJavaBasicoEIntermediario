package com.loiane.cursojava.aula75_84;

public class StringModificandoLetras {

	public static void main(String[] args) {
		String teste = "Teste";
		String testeMinusculo = teste.toLowerCase();
		String testeMaiusculo = teste.toUpperCase();
		
		System.out.println(testeMinusculo);
		System.out.println(testeMaiusculo);
		
		//if(teste.toLowerCase().equals(teste.toLowerCase()))
		//Compara strings sem usar metodo equalsIgnoreCase

	}

}
