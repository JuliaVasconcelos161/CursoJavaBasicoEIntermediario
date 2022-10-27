package com.loiane.cursojava.exercicios.aula43;

public class PessoaFisica extends Contribuinte{
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		double renda = this.getRendaBruta();
		if(renda <= 1400)
		{
			return 0;
		}
		else if(renda <= 2100)
		{
			return (renda * 0.1) - 100;
		}
		else if(renda <= 2800)
		{
			return (renda * 0.15) - 270;
		}
		else if(renda <= 3600)
		{
			return (renda * 0.25) - 500;
		}

		return (renda * 0.3) - 700;
		
	}
	
	public String toString() {
		String s = super.toString();
		s += "Pessoa física \n";
		s += "cpf = " + cpf + "\n";
		s += "Imposto a ser pago = " + calcularImposto() + "\n";
		return s;
	}
}
