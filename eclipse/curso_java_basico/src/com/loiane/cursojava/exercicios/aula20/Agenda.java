package com.loiane.cursojava.exercicios.aula20;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] compromissos = new String [31][24];
		
		boolean sair = false;
		byte opcao;
		while(!sair)
		{
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			opcao = sc.nextByte();
			
					
			switch (opcao)
			{
				case 1://adicionar compromisso
				{
					boolean diaValido =  false;
					int dia = 1;
					while(!diaValido)
					{
						System.out.println("Entre com o dia do mês");
						dia = sc.nextInt();
						if(dia > 0 && dia <= 31)
						{
							diaValido = true;
						}
						else
						{
							System.out.println("Dia inválido, digite novamente");
						}
					}

					boolean horaValida =  false;
					int hora = 0;
					while(!horaValida)
					{
						System.out.println("Entre com a hora do compromisso: ");
						hora = sc.nextInt();
						if(hora >= 0 && hora < 24)
						{
							horaValida = true;
						}
						else
						{
							System.out.println("Hora inválida, digite novamente");
						}
					}
					
					dia--;
					System.out.println("Insira o compromisso: ");
					compromissos[dia][hora] = sc.next();
					break;
				}
					
				case 2://verificar compromisso
				{
					boolean diaValido =  false;
					int dia = 1;
					while(!diaValido)
					{
						System.out.println("Entre com o dia do mês");
						dia = sc.nextInt();
						if(dia > 0 && dia <= 31)
						{
							diaValido = true;
						}
						else
						{
							System.out.println("Dia inválido, digite novamente");
						}
					}

					boolean horaValida =  false;
					int hora = 0;
					while(!horaValida)
					{
						System.out.println("Entre com a hora do compromisso: ");
						hora = sc.nextInt();
						if(hora >= 0 && hora < 24)
						{
							horaValida = true;
						}
						else
						{
							System.out.println("Hora inválido, digite novamente");
						}
					}
					
					dia--;
					System.out.println("Seu compromisso nesse dia e hora é: \n" + compromissos[dia][hora]);
					break;
				}
				case 0:
					sair = true;
					break;
				default:
					System.out.println("Opção inválida, digite novamente");
					break;
					
			}
		}

	}

}
