package com.loiane.cursojava.exercicios.aula20;

import java.util.Scanner;

public class AgendaMesDiaHora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][][] compromissos = new String [12][31][8];
		
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
					boolean mesValido =  false;
					int mes = 1;
					while(!mesValido)
					{
						System.out.println("Entre com o mês");
						mes = sc.nextInt();
						if(mes > 0 && mes <= 12)
						{
							mesValido = true;
						}
						else
						{
							System.out.println("Mês inválido, digite novamente");
						}
					}
					
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
					int hora = 1;
					while(!horaValida)
					{
						System.out.println("Entre com a hora do compromisso: ");
						hora = sc.nextInt();
						if(hora >= 1 && hora <= 8)
						{
							horaValida = true;
						}
						else
						{
							System.out.println("Hora inválida, digite novamente");
						}
					}
					
					hora--;
					mes--;
					dia--;
					System.out.println("Insira o compromisso: ");
					compromissos[mes][dia][hora] = sc.next();
					break;
				}
					
				case 2://verificar compromisso
				{
					boolean mesValido =  false;
					int mes = 1;
					while(!mesValido)
					{
						System.out.println("Entre com o mês");
						mes = sc.nextInt();
						if(mes > 0 && mes <= 12)
						{
							mesValido = true;
						}
						else
						{
							System.out.println("Mês inválido, digite novamente");
						}
					}
					
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
					int hora = 1;
					while(!horaValida)
					{
						System.out.println("Entre com a hora do compromisso: ");
						hora = sc.nextInt();
						if(hora >= 1 && hora <= 8)
						{
							horaValida = true;
						}
						else
						{
							System.out.println("Hora inválida, digite novamente");
						}
					}
					
					hora--;
					mes--;
					dia--;
					System.out.println("Seu compromisso nesse dia e hora é: \n" + compromissos[mes][dia][hora]);
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
