package com.loiane.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro;
		boolean resultado2 = falso && verdadeiro;//curto circuito
//		No caso de curto circuito o programa nem verifica o segundo boolean se conseguir identificar o valor da expressão verificando apenas o primeiro
		System.out.println(resultado1);
		System.out.println(resultado2);

		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado);
	}

}
