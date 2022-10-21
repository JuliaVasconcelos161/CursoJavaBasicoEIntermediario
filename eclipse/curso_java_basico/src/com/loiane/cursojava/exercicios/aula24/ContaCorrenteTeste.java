package com.loiane.cursojava.exercicios.aula24;

public class ContaCorrenteTeste {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.limite = 1000;
		contaCorrente.saldo = 2000;
		contaCorrente.status = "Especial";
		contaCorrente.numConta = "34834";
		
		
		System.out.println("O saldo da conta " + contaCorrente.numConta + " é R$ " + contaCorrente.saldo);

	}

}
