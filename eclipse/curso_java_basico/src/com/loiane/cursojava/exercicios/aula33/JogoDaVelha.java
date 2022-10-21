package com.loiane.cursojava.exercicios.aula33;

public class JogoDaVelha {
	private char[][] matrizJogoVelha = new char[3][3];
	private int jogada = 1;
	
	public JogoDaVelha()
	{
		matrizJogoVelha = new char[3][3];
		jogada = 1;
	}

	public char[][] getJogoVelha() {
		return matrizJogoVelha;
	}

	public void setJogoVelha(char[][] matrizJogoVelha) {
		this.matrizJogoVelha = matrizJogoVelha;
	}

	public int getJogada() {
		return jogada;
	}

	public void setJogada(int jogada) {
		this.jogada = jogada;
	}
	
	public boolean validarJogada(int linha, int coluna, char sinal)
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
	
	public void imprimirTabuleiro()
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
	
	public boolean verificarGanhador(char sinal)
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
	
	public boolean vezJogador1()
	{
		if(jogada % 2 == 1)
		{
			return true;
		}
		return false;
	}
}
