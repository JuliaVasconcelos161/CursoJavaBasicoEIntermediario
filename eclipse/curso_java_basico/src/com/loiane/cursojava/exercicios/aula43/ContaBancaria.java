package com.loiane.cursojava.exercicios.aula43;

public class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public ContaBancaria()
	{
		
	}
	public ContaBancaria(String nomeCliente, String nomeConta, double saldo)
	{
		this.nomeCliente = nomeCliente;
		this.numConta = nomeConta;
		this.saldo = saldo;
	}
	


	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeConta(String nomeConta) {
		this.numConta = nomeConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public boolean sacar(double dinheiroASacar)
	{
		if((this.saldo - dinheiroASacar) > 0)
		{
			this.saldo -= dinheiroASacar; 
			return true;
		}
		
		return false;
	}
	

	public void depositar(double dinheiroADepositar)
	{
		this.saldo += dinheiroADepositar;
		System.out.println("Seu depósito de RS" + dinheiroADepositar + " foi efetivado");
	}
	
	
	@Override
	public String toString() {
		String s = "ContaBancaria\n";
		s += "nomeCliente = " + nomeCliente + "\n";
		s += "numConta = " + numConta + "\n";
		s += "saldo = " + saldo; 
		return s;
	}
	
	
	
	
}
