package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class NomeESenhaDeUsuario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean valoresValidos = true;
		String nome;
		String senha;
		
		do {
			System.out.println("Insira um nome de usuário: ");
			nome = scan.nextLine();
			System.out.println("Insira uma senha: ");
			senha = scan.nextLine();
			if (nome.equalsIgnoreCase(senha))
			{
				valoresValidos = false;
				System.out.println("O nome e senha não podem ser iguais.");
			}
			else
			{
				System.out.println("O nome é: " + nome + " e a senha é " + senha + ".");
			}
		}while(!valoresValidos);

	}

}
