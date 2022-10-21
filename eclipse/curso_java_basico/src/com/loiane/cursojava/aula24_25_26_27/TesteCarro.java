package com.loiane.cursojava.aula24_25_26_27;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro é " + autonomia);
		System.out.println("A autonomia do carro é " + van.obterAutonomia());
		
		double qtdCombustivel10 = van.calcularcombustivel(10);
		double qtdCombustivel15 = van.calcularcombustivel(15);
		
		System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
		System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
	}

}
