package com.loiane.cursojava.exercicios.aula43;

public class ContaEspecial extends ContaBancaria {
	private double limite;

	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	public boolean sacar(double dinheiroASacar)
	{
		double saldoComLimite = this.getSaldo() + limite;
		
		if((saldoComLimite - dinheiroASacar) > 0)
		{
			this.setSaldo(this.getSaldo() - dinheiroASacar);
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\nlimite = " + limite + "\n";
		return s;
	}
}
