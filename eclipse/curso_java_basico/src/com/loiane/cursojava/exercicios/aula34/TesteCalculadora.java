package com.loiane.cursojava.exercicios.aula34;

public class TesteCalculadora {

	static void imprimirNumTela(double num)
	{
		System.out.println(num);
	}
	public static void main(String[] args) {
		
		imprimirNumTela(Calculadora.somar(3, 4));
		
		imprimirNumTela(Calculadora.subtrair(4,3));
		
		imprimirNumTela(Calculadora.multiplicar(5,5));
		
		imprimirNumTela(Calculadora.dividir(72, 8));
		
		imprimirNumTela(Calculadora.elevarAPotencia(4, 3));


	}

}
