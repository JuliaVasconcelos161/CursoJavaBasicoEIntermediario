package com.loiane.cursojava.exercicios.aula27;

import java.util.Scanner;

public class JogoDaVelha {
	char[][] matrizJogoVelha;
	char sinal = ' ';
	
	int jogada;
	
	public JogoDaVelha()
	{
		jogada = 1;
		matrizJogoVelha = new char[3][3];
	}
	
	
	boolean validarJogada(int linha, int coluna, char sinal)
	{
		if(matrizJogoVelha[linha][coluna] == 'X' || matrizJogoVelha[linha][coluna] == 'O')
		{
			return false;
		}
		else
		{
			matrizJogoVelha[linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}
	
	void imprimirTabuleiro()
	{
		for(int i = 0; i < matrizJogoVelha.length; i++)
		{
			for(int j = 0; j < matrizJogoVelha[i].length; j++)
			{
				System.out.print(matrizJogoVelha[i][j] + " | ");
			}
			System.out.println();
		}
	}
	
	boolean verificarGanhador(char sinal)
	{
		if((matrizJogoVelha[0][0] == sinal && matrizJogoVelha[0][1] == sinal && matrizJogoVelha[0][2] == sinal) //linha1
				|| (matrizJogoVelha[1][0] == sinal && matrizJogoVelha[1][1] == sinal && matrizJogoVelha[1][2] == sinal) || //linha2
				(matrizJogoVelha[2][0] == sinal && matrizJogoVelha[2][1] == sinal && matrizJogoVelha[2][2] == sinal) || //linha3
				(matrizJogoVelha[0][0] == sinal && matrizJogoVelha[1][0] == sinal && matrizJogoVelha[2][0] == sinal) || //coluna1
				(matrizJogoVelha[0][1] == sinal && matrizJogoVelha[1][1] == sinal && matrizJogoVelha[2][1] == sinal) || //coluna2
				(matrizJogoVelha[0][2] == sinal && matrizJogoVelha[1][2] == sinal && matrizJogoVelha[2][2] == sinal) || //coluna3
				(matrizJogoVelha[0][0] == sinal && matrizJogoVelha[1][1] == sinal && matrizJogoVelha[2][2] == sinal) || //diagonal
				(matrizJogoVelha[0][2] == sinal && matrizJogoVelha[1][1] == sinal && matrizJogoVelha[2][0] == sinal) ) //diagonal "inversa"
		{
			return true;
		}
			return false;
	}
	
	boolean vezJogador1()
	{
		if(jogada % 2 == 1)
		{
			return true;
		}
		return false;
	}
	
	
}
