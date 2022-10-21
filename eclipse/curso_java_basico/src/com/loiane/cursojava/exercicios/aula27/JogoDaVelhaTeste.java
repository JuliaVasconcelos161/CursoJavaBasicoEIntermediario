package com.loiane.cursojava.exercicios.aula27;

import java.util.Scanner;

public class JogoDaVelhaTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		
		System.out.println("O jogador 1 será o X");
		System.out.println("O jogador 2 será o O");
		
		boolean alguemGanhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!alguemGanhou)
		{
			if(jogoDaVelha.vezJogador1())
			{
				System.out.println("Vez do jogador 1");
				System.out.println("Insira linha e coluna: ");
				sinal = 'X';
			}
			else
			{
				System.out.println("Vez do jogador 2");
				System.out.println("Insira linha e coluna: ");
				sinal = 'O';
			}
			
			linha = valor("Linha",sc);
			coluna = valor("Coluna",sc);
			
			if(!jogoDaVelha.validarJogada(linha, coluna, sinal))
			{
				System.out.println("Esse espaço já está preenchido. Tente novamente");
			}
			
			jogoDaVelha.imprimirTabuleiro();
			
			if(jogoDaVelha.verificarGanhador('X'))
			{
				System.out.println("O jogador 1 venceu!!!");
				alguemGanhou = true;
			}
			else if(jogoDaVelha.verificarGanhador('O'))
			{
				System.out.println("O jogador 2 venceu!!!");
				alguemGanhou = true;
			}
			else if(jogoDaVelha.jogada > 9)
			{
				System.out.println("Ops, deu velha!!!");
				alguemGanhou = true;
			}
					
		}
	}
		

	
	static int valor(String tipoValor, Scanner sc)
	{
		int valor = 0;
		boolean valorValido = false;
		while(!valorValido)
		{
			System.out.println("Entre com uma " + tipoValor + " válida (1 - 2 - 3): ");
			valor = sc.nextInt();
			if(valor > 0 && valor < 4)
			{
				valorValido = true;
			}
			else
			{
				System.out.println("Essa entrada não é válida.");
			}
		}
		valor--;
		return valor;
	}

}
