package com.loiane.cursojava.aula31;

public class Carro {
	public String marca;
	public String modelo;
	int numPassageiros;
	private double capCombustivel;
	double consumoCombustivel;
		
	public void exibirAutonomia()
	{
		System.out.println("A autonomia do carro é " + this.capCombustivel * this.consumoCombustivel);
	}
	
	public double obterAutonomia()
	{
		System.out.println("O método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKmPorComsumoDeCombustivel(double km)
	{
		return km/this.consumoCombustivel;
	}
	public double calcularcombustivel(double km)
	{
		return divideKmPorComsumoDeCombustivel(km);
	}
}
