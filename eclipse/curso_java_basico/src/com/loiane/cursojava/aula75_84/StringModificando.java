package com.loiane.cursojava.aula75_84;

public class StringModificando {

	public static void main(String[] args) {
		String teste = "Isso é um teste.";
		
		System.out.println(teste);
		
		System.out.println(teste.substring(10));//imprime a partir do 10
		System.out.println(teste.substring(10, 15));//imprime a partir do 10, ate o indice 14(o indice final não é inclusivo)
		
		String ola = "olá";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo); //ola + mundo
		System.out.println(olaMundo);
		
		String espacos = "i s p a ç o";
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);
		
		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);
		
		String nome = " meu nome é: ";
		System.out.println(nome);
		System.out.println(nome.trim());
		//tira espaços antes e depois
		
		//web services
		//XML
		//CSV (excel)
		
	}

}
