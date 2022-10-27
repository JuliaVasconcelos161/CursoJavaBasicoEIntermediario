package com.loiane.cursojava.exercicios.aula43;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		conta.setNomeCliente("Giovanni");
		conta.setNumConta("123456");
		conta.setSaldo(1000);
		realizarSaque(conta,1000);
		System.out.println(conta.toString());
		realizarSaque(conta,10);
		System.out.println(conta.toString());
		conta.depositar(1000);
		System.out.println(conta.toString());
		
		System.out.println("\n");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Aline");
		contaPoupanca.setNumConta("195867");
		contaPoupanca.setDiaRendimento(25);
		contaPoupanca.setSaldo(100);
		System.out.println(contaPoupanca.toString());
		realizarSaque(contaPoupanca,50);
		realizarSaque(contaPoupanca,70);
		System.out.println(contaPoupanca.toString());
		
		
		if(contaPoupanca.calcularNovoSaldo(0.5))
		{
			System.out.println("Rendimento aplicado, novo saldo é de RS" + contaPoupanca.getSaldo());
		}
		else
		{
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
		}
		System.out.println(contaPoupanca.toString());

		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Joao");
		contaEspecial.setNumConta("290837");
		contaEspecial.setLimite(50);
		contaEspecial.depositar(100);
		System.out.println(contaEspecial.toString());
		realizarSaque(contaEspecial,50);
		realizarSaque(contaEspecial,70);
		realizarSaque(contaEspecial,80);
		System.out.println(contaEspecial.toString());
	}
	
	public static void realizarSaque(ContaBancaria conta, double dinheiroASacar)
	{
		if(conta.sacar(dinheiroASacar))
		{
			System.out.println("Saque de RS " + dinheiroASacar + " efetuado com sucesso!");
		}
		else
		{
			System.out.println("Saldo insuficiente!, saque de RS" + dinheiroASacar + " não efetuado");
		}
	}
	
}
