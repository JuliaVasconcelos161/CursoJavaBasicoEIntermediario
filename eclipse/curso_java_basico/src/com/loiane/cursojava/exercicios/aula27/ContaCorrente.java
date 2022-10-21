package com.loiane.cursojava.exercicios.aula27;

public class ContaCorrente {
	String numConta;
	double saldo;
	double limiteEspecial;
	boolean especial;
	
	boolean realizarSaque(double quantiaASacar)
	{
		//tem saldo na conta
		if(saldo >= quantiaASacar)
		{
			saldo -= quantiaASacar;
			return true;
		}
		//não tem saldo na conta
		else
		{
			if(especial)
			{
				//verificar se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
				if(limite >= quantiaASacar)
				{
					saldo -= quantiaASacar;
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
	}
	
	void depositarDinheiro(double valorDepositado)
	{
		saldo += valorDepositado;
	}
	
	void consultarSaldo(String numConta)
	{
		System.out.println("O saldo da conta " + numConta + " é R$ " + saldo);
	}
	
	boolean verificarChequeEspecial()
	{
		return saldo < 0;
	}
}
