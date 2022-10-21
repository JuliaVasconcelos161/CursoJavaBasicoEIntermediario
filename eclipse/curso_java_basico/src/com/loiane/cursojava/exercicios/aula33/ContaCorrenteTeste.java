package com.loiane.cursojava.exercicios.aula33;


public class ContaCorrenteTeste {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setLimiteEspecial(500);
		contaCorrente.setSaldo(-10);
		contaCorrente.setEspecial(true);
		contaCorrente.setNumConta("34834");
		
		
		contaCorrente.consultarSaldo(contaCorrente.getNumConta());
		
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
		
		contaCorrente.consultarSaldo(contaCorrente.getNumConta());
		
		System.out.println("Deposito de 500 reais");
		contaCorrente.depositarDinheiro(500);
		contaCorrente.consultarSaldo(contaCorrente.getNumConta());
		
		if(contaCorrente.verificarChequeEspecial())
		{
			System.out.println("Usa cheque especial");
		}
		else
		{
			System.out.println("Não usa cheque especial");
		}
		
		contaCorrente.realizarSaque(600);
		System.out.println("Saque de 600 reais");
		
		contaCorrente.consultarSaldo(contaCorrente.getNumConta());
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
