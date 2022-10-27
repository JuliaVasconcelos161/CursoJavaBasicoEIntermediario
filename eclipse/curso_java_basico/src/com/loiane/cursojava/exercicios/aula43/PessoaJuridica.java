package com.loiane.cursojava.exercicios.aula43;

public class PessoaJuridica extends Contribuinte{

	private String cnpj;
	
	
	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	@Override
	public double calcularImposto() {
		
		return this.getRendaBruta() * 0.1;
	}
	
	
	public String toString() {
		String s = super.toString();
		s += "Pessoa jurídica \n";
		s += "cnpj = " + cnpj + "\n";
		s += "Imposto a ser pago = " + calcularImposto() + "\n";
		return s;
	}


}
