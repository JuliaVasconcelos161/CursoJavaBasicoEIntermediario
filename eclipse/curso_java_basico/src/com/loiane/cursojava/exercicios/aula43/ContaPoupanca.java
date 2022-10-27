package com.loiane.cursojava.exercicios.aula43;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
	private int diaRendimento;

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public boolean calcularNovoSaldo(double taxaDeRendimento)
	{
		Calendar hoje = Calendar.getInstance();
		
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH))
		{
//			saldo += saldo * taxaDeRendimento;
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaDeRendimento));
			return true;
		}
		return false;
	}
	
@Override
	public String toString() {
		String s = super.toString();
		s += "\ndiaRendimento = " + diaRendimento + "\n";
		return s;
	}

}
