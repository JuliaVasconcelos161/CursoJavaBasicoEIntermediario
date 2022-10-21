package com.loiane.cursojava.aula24_25_26_27;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia()
	{
		System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel);
	}
	
	double obterAutonomia()
	{
		System.out.println("O método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularcombustivel(double km)
	{
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}

}
