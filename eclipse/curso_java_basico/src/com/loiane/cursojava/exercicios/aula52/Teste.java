package com.loiane.cursojava.exercicios.aula52;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int opcao = 1;
		
		while(opcao != 3)
		{
			opcao = obterOpcaoMenu(sc);
			
			if(opcao == 1)
			{
				//consultar contato
				consultarContato(sc, agenda);
				
			}
			else if(opcao == 2)
			{
				//adicionar contato
				adicionarContato(sc, agenda);
			}

		}

	}
	public static void adicionarContato(Scanner sc, Agenda agenda)
	{
		System.out.println("Criando o contato entre com as informações: ");
		String nome = leInformacaoString(sc, "Entre com o nome do contato: ");
		String telefone = leInformacaoString(sc, "Entre com o telefone do contato: ");
		String email = leInformacaoString(sc, "Entre com o email do contato: ");
		
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);
		
		try {
			agenda.adicionarContato(contato);
			System.out.println("Contato a ser criado:\n");
			System.out.println(contato);
			
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			System.out.println("Contatos da agenda");	
			System.out.println(agenda);
		}

	}
	
	public static void consultarContato(Scanner sc, Agenda agenda)
	{
		String nomeContato = leInformacaoString(sc, "Entre com o nome do contato:");
		try {
			if(agenda.consultarContatoPorNome(nomeContato) >= 0)
			{
				System.out.println("Contato existe");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());

		}
	}
	
	public static String leInformacaoString(Scanner sc, String msg)
	{
		System.out.println(msg);
		String entrada = sc.nextLine();
		return entrada;
	}
	
	public static int obterOpcaoMenu(Scanner sc) 
	{
		boolean entradaValida = false;
		int opcao = 3;
		while(!entradaValida)
		{
			System.out.println("Digite a opção desejada: ");
			System.out.println("1: Consultar Contato ");
			System.out.println("2: Adicionar Contato ");
			System.out.println("3: Sair");
		
			
			try 
			{
					String entrada = sc.nextLine();
					opcao = Integer.parseInt(entrada);
					if(opcao == 1 | opcao == 2 | opcao == 3)
					{
						entradaValida = true;
					}
					else
					{
						throw new Exception();
					}
	
			}
			catch(Exception e)
			{
				System.out.println("Entrada inválda, digite novamente\n");
			}
			
		}
		
		return opcao;

	}
}
