package com.loiane.cursojava.aula52;

public class DivisaoNaoExata extends Exception {

	private int den;
	private int num;
	
	public DivisaoNaoExata(int den, int num) {
		super();
		this.den = den;
		this.num = num;
	}

	
	@Override
	public String toString() {
		return "Resultado de " + num + "/" + den + " não é um inteiro";
	}


}
