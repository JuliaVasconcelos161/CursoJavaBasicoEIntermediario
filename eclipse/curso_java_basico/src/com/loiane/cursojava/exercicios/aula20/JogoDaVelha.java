package com.loiane.cursojava.exercicios.aula20;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] matrizJogoVelha = new char[3][3];
		char sinal = ' ';
		
		System.out.println("O jogador 1 será o X");
		System.out.println("O jogador 2 será o O");
		
		boolean alguemGanhou = false;
		int jogada = 1;
		int linha = 0, coluna = 0;
		
		while(!alguemGanhou)
		{
			if(jogada % 2 == 1)
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
			
			boolean linhaValida = false;
			while(!linhaValida)
			{
				System.out.println("Entre com uma linha válida (1 - 2 - 3): ");
				linha = sc.nextInt();
				if(linha > 0 && linha < 4)
				{
					linhaValida = true;
				}
				else
				{
					System.out.println("Essa linha não é válida.");
				}
			}
			
			boolean colunaValida = false;
			while(!colunaValida)
			{
				System.out.println("Entre com uma coluna válida (1 - 2 - 3): ");
				coluna = sc.nextInt();
				if(coluna > 0 && coluna < 4)
				{
					colunaValida = true;
				}
				else
				{
					System.out.println("Essa coluna não é válida.");
				}
			}
			
			linha--;
			coluna--;
			if(matrizJogoVelha[linha][coluna] == 'X' || matrizJogoVelha[linha][coluna] == 'O')
			{
				System.out.println("Esse espaço já está preenchido. Tente novamente");
			}
			else
			{
				matrizJogoVelha[linha][coluna] = sinal;
				jogada++;
			}
			
			for(int i = 0; i < matrizJogoVelha.length; i++)
			{
				for(int j = 0; j < matrizJogoVelha[i].length; j++)
				{
					System.out.print(matrizJogoVelha[i][j] + " | ");
				}
				System.out.println();
			}
			
			//verifica se há ganhador
			if((matrizJogoVelha[0][0] == 'X' && matrizJogoVelha[0][1] == 'X' && matrizJogoVelha[0][2] == 'X') //linha1
					|| (matrizJogoVelha[1][0] == 'X' && matrizJogoVelha[1][1] == 'X' && matrizJogoVelha[1][2] == 'X') || //linha2
					(matrizJogoVelha[2][0] == 'X' && matrizJogoVelha[2][1] == 'X' && matrizJogoVelha[2][2] == 'X') || //linha3
					(matrizJogoVelha[0][0] == 'X' && matrizJogoVelha[1][0] == 'X' && matrizJogoVelha[2][0] == 'X') || //coluna1
					(matrizJogoVelha[0][1] == 'X' && matrizJogoVelha[1][1] == 'X' && matrizJogoVelha[2][1] == 'X') || //coluna2
					(matrizJogoVelha[0][2] == 'X' && matrizJogoVelha[1][2] == 'X' && matrizJogoVelha[2][2] == 'X') || //coluna3
					(matrizJogoVelha[0][0] == 'X' && matrizJogoVelha[1][1] == 'X' && matrizJogoVelha[2][2] == 'X') || //diagonal
					(matrizJogoVelha[0][2] == 'X' && matrizJogoVelha[1][1] == 'X' && matrizJogoVelha[2][0] == 'X') ) //diagonal "inversa"
			{
				System.out.println("O jogador 1 venceu!!!");
				alguemGanhou = true;
			}
			else if((matrizJogoVelha[0][0] == 'O' && matrizJogoVelha[0][1] == 'O' && matrizJogoVelha[0][2] == 'O') //linha1
					|| (matrizJogoVelha[1][0] == 'O' && matrizJogoVelha[1][1] == 'O' && matrizJogoVelha[1][2] == 'O') || //linha2
					(matrizJogoVelha[2][0] == 'O' && matrizJogoVelha[2][1] == 'O' && matrizJogoVelha[2][2] == 'O') || //linha3
					(matrizJogoVelha[0][0] == 'O' && matrizJogoVelha[1][0] == 'O' && matrizJogoVelha[2][0] == 'O') || //coluna1
					(matrizJogoVelha[0][1] == 'O' && matrizJogoVelha[1][1] == 'O' && matrizJogoVelha[2][1] == 'O') || //coluna2
					(matrizJogoVelha[0][2] == 'O' && matrizJogoVelha[1][2] == 'O' && matrizJogoVelha[2][2] == 'O') || //coluna3
					(matrizJogoVelha[0][0] == 'O' && matrizJogoVelha[1][1] == 'O' && matrizJogoVelha[2][2] == 'O') || //diagonal
					(matrizJogoVelha[0][2] == 'O' && matrizJogoVelha[1][1] == 'O' && matrizJogoVelha[2][0] == 'O') ) //diagonal "inversa"
			{
				System.out.println("O jogador 2 venceu!!!");
				alguemGanhou = true;
			}
			else if(jogada > 9)
			{
				System.out.println("Ops, deu velha!!!");
				alguemGanhou = true;
			}
		}

	}

}
