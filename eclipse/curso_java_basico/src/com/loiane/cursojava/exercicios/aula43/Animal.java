package com.loiane.cursojava.exercicios.aula43;

public class Animal {
	private String nome;
	private double comprimento;
	private int numPatas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Animal()
	{
		this.numPatas = 4;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		String s = "\nAnimal \n";
		s += "nome = " + nome + "\n";
		s += "comprimento = " + comprimento + " cm \n";
		s += "numPatas = " + numPatas + "\n";
		s += "cor = " + cor + "\n";
		s += "ambiente = " + ambiente + "\n";
		s += "velocidade = " + velocidade + " m/s \n";
		
		return s;
	}
	
	
	
	
}
