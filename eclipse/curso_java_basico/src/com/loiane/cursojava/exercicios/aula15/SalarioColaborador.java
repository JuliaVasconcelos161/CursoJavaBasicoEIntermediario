package com.loiane.cursojava.exercicios.aula15;

import java.util.Scanner;

public class SalarioColaborador {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double salario;
		double novoSalario;
		double aumento;
		double percentual;
		
		System.out.println("Insira o seu salário: ");
		salario = scan.nextDouble();
		
		if(salario <= 280)
		{
			percentual = 0.2;
			aumento = percentual * salario;
			novoSalario = salario + aumento; 
			System.out.println("\n Salario: " + salario + "\n Percentual: " + percentual + "\n Aumento: " + aumento + "\n Novo salário: " + novoSalario );
		}
		else if(salario > 280 && salario < 700)
		{
			percentual = 0.15;
			aumento = percentual * salario;
			novoSalario = salario + aumento; 
			System.out.println("\n Salario: " + salario + "\n Percentual: " + percentual + "\n Aumento: " + aumento + "\n Novo salário: " + novoSalario );
		}
		else if(salario >= 700 && salario < 1500)
		{
			percentual = 0.1;
			aumento = percentual * salario;
			novoSalario = salario + aumento; 
			System.out.println("\n Salario: " + salario + "\n Percentual: " + percentual + "\n Aumento: " + aumento + "\n Novo salário: " + novoSalario );
		}
		else if(salario >= 1500)
		{
			percentual = 0.05;
			aumento = percentual * salario;
			novoSalario = salario + aumento; 
			System.out.println("\n Salario: " + salario + "\n Percentual: " + percentual + "\n Aumento: " + aumento + "\n Novo salário: " + novoSalario );
		}
	}

}
