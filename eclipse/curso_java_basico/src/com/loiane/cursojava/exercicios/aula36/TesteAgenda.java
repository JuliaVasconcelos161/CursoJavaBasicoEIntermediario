package com.loiane.cursojava.exercicios.aula36;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Insira um nome para a agenda: ");
		String nome = sc.nextLine();
		
		Agenda agenda = new Agenda();
		agenda.setNome(nome);
		
		Contato[] contatos = new Contato[3];
		
		for(int i = 0; i < contatos.length; i++)
		{
			System.out.println("Insira as informações do contato " + (i + 1));
			Contato c = new Contato();
			
			System.out.println("Entre com o nome:");
			nome = sc.nextLine();
			c.setNome(nome);
			
			System.out.println("Entre com o telefone:");
			String telefone = sc.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Entre com o email:");
			String email = sc.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
		
		agenda.setContatos(contatos);
		
		if(agenda != null)
		{
			System.out.println(agenda.obterInfo());
		}
		
	}

}
