package com.loiane.cursojava.exercicios.aula56;

public enum Operacoes {
	
	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			return x + y;
		}
	}, DIVIDIR ("/"){
		@Override
		public double executarOperacao(double x, double y) {
			return x / y;
		}
	}, MULTIPLICAR ("*"){
		@Override
		public double executarOperacao(double x, double y) {
			return x * y;
		}
	}, SUBTRAIR ("-"){
		@Override
		public double executarOperacao(double x, double y) {
			return x - y;
		}
	};
	
	
	
	private String sinal;

	Operacoes(String sinal)
	{
		this.sinal = sinal;
	}
	
	public abstract double executarOperacao(double x, double y);
	
	public String toString()
	{
		return this.sinal;
	}
}
