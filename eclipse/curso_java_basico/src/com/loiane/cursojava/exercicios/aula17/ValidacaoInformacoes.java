package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class ValidacaoInformacoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		boolean infoValida = true;
		
		do
		{
			System.out.println("Digite seu nome: ");
			nome = scan.next();
			infoValida = true;
			if(nome.length() < 3)
			{
				infoValida = false;
				System.out.println("São necessários ao menos 3 caracteres");
			}
		}while(!infoValida);
		
		do
		{
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			infoValida = true;
			if(idade > 150 || idade < 0)
			{
				infoValida = false;
				System.out.println("A idade deve ficar entre 0 e 150");
			}
		}while(!infoValida);
		
		do
		{
			System.out.println("Digite seu salario: ");
			salario = scan.nextDouble();
			infoValida = true;
			if(salario < 0)
			{
				infoValida = false;
				System.out.println("O salário deve ser maior que 0");
			}
		}while(!infoValida);

		do
		{
			System.out.println("Digite seu sexo: (f ou m) ");
			sexo = scan.next();
			infoValida = true;
			if(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"))
			{
				infoValida = false;
				System.out.println("O sexo deve ser representado por f ou m");
			}
		}while(!infoValida);
		
		do
		{
			System.out.println("Digite seu estado civil: (s, c, v, ou d) ");
			estadoCivil = scan.next();
			infoValida = true;
			if(!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d"))
			{
				infoValida = false;
				System.out.println("O estado civil deve ser representado por s, c, v, ou d");
			}
		}while(!infoValida);
		
		System.out.println("As informações coletadas foram: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
		
	}

}
