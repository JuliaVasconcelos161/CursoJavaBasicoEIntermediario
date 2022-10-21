package com.loiane.cursojava.exercicios.aula27;

public class ContaCorrenteTeste {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.limiteEspecial = 500;
		contaCorrente.saldo = -10;
		contaCorrente.especial = true;
		contaCorrente.numConta = "34834";
		
		
		contaCorrente.consultarSaldo(contaCorrente.numConta);
		
		boolean saqueEfetuado = contaCorrente.realizarSaque(10);
		System.out.println("Saque 10 reais");
		if(saqueEfetuado)
		{
			System.out.println("Saldo realizado com sucesso");
		}
		else
		{
			System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
			
		}
		
		contaCorrente.consultarSaldo(contaCorrente.numConta);
		
		System.out.println("Deposito de 500 reais");
		contaCorrente.depositarDinheiro(500);
		contaCorrente.consultarSaldo(contaCorrente.numConta);
		
		if(contaCorrente.verificarChequeEspecial())
		{
			System.out.println("Usa cheque especial");
		}
		else
		{
			System.out.println("Não usa cheque especial");
		}
		
		contaCorrente.realizarSaque(600);
		contaCorrente.consultarSaldo(contaCorrente.numConta);
		if(contaCorrente.verificarChequeEspecial())
		{
			System.out.println("Usa cheque especial");
		}
		else
		{
			System.out.println("Não usa cheque especial");
		}
	}

}
