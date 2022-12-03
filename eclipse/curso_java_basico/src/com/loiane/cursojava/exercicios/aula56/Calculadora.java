package com.loiane.cursojava.exercicios.aula56;

public class Calculadora {

	public static void main(String[] args) {
		
		double x = 4;
		double y = 2;
		
		
		for(Operacoes op: Operacoes.values())
		{
			System.out.println(x + " " + op.toString() + " " + y + " = " + op.executarOperacao(x, y));
		}
		
		

	}

}
