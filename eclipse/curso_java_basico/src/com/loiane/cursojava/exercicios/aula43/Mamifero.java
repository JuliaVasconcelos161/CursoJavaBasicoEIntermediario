package com.loiane.cursojava.exercicios.aula43;

public class Mamifero extends Animal{
	private String alimento;

	public Mamifero()
	{
		this.setAmbiente("Terra");
	}
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "Tipo: Mamifero \n";
		s += "alimento = " + alimento;
		
		return s;
	}
}
