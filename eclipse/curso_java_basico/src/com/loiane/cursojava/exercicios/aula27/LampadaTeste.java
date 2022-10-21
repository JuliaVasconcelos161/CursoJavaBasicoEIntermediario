package com.loiane.cursojava.exercicios.aula27;

public class LampadaTeste {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.ligarLampada();

		lampada.mostrarEstado();
		
		lampada.desligarLampada();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
	}
}
