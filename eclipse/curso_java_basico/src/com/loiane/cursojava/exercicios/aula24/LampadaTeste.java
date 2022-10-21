package com.loiane.cursojava.exercicios.aula24;

public class LampadaTeste {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tipos = new String[5];
		lampada.tipos[0] = "led";
		lampada.potencia = 9;
		lampada.cor ="branca";
		lampada.tensao = "bivolt";

		System.out.println(lampada.tipos[0]);
	}

}
