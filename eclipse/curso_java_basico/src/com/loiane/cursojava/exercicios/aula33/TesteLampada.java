package com.loiane.cursojava.exercicios.aula33;

public class TesteLampada {

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
