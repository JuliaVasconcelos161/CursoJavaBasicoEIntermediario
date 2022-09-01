package com.loiane.cursojava.aula12;
import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		/*System.out.println("\nDigite seu nome completo:\n");
		String nomeCompleto = scan.nextLine();
		
		System.out.println("\nDigite seu primeiro nome:\n");
		String primeiroNome = scan.next();*/
		//retorna apenas a primeira palavra
		
		/*System.out.println("\nDigite sua idade:\n");
		int idade = scan.nextInt();
		
		System.out.println("\nDigite sua altura:\n");
		double altura = scan.nextDouble();*/
		
		System.out.println("\nDigite seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação\n");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte quantidadeFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temBichinhoDeEstimacao = scan.nextBoolean();
		
		/*System.out.println("Seu nome completo é " + nomeCompleto);
		System.out.println("Seu primeiro nome é " + primeiroNome);
		System.out.println("Sua idade é " + idade);*/
		
		System.out.println("Você digitou os seguintes valores: \n");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + quantidadeFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem bichinho de estimacao: " + temBichinhoDeEstimacao);
	}

}
