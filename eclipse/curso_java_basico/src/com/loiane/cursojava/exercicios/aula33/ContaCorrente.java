package com.loiane.cursojava.exercicios.aula33;

public class ContaCorrente {
	private String numConta;
	private double saldo;
	private double limiteEspecial;
	private boolean especial;
	
	public ContaCorrente(String numConta, double saldo, double limiteEspecial, boolean especial)
	{
		this.numConta = numConta;
		this.saldo = saldo;
		this.limiteEspecial = limiteEspecial;
		this.especial = especial;
	}
	
	public ContaCorrente()
	{
		
	}
	
	public String getNumConta()
	{
		return this.numConta;
	}
	
	public void setNumConta(String numConta)
	{
		this.numConta = numConta;
	}
	
	public double getSaldo()
	{
		return this.saldo;
	}
	
	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}
	
	public double getLimiteEspecial()
	{
		return this.limiteEspecial;
	}
	
	public void setLimiteEspecial(double limiteEspecial)
	{
		this.limiteEspecial = limiteEspecial;
	}
	
	public boolean isEspecial()
	{
		return this.especial;
	}
	
	public void setEspecial(boolean especial)
	{
		this.especial = especial;
	}
	
	public boolean realizarSaque(double quantiaASacar)
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
	
	public void depositarDinheiro(double valorDepositado)
	{
		saldo += valorDepositado;
	}
	
	public void consultarSaldo(String numConta)
	{
		System.out.println("O saldo da conta " + numConta + " é R$ " + saldo);
	}
	
	public boolean verificarChequeEspecial()
	{
		return saldo < 0;
	}
}
