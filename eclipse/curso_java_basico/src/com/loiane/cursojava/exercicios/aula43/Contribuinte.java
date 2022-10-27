package com.loiane.cursojava.exercicios.aula43;

public abstract class Contribuinte {
	private String nome;
	private double rendaBruta;
	
	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract double calcularImposto();

	@Override
	public String toString() {
		String s = "Contribuinte \n";
		s += "nome = " + nome + "\n";
		s += "rendaBruta = " + rendaBruta + "\n";
		return s;
	}
	
	
}
