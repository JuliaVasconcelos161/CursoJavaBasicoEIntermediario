package com.loiane.cursojava.aula85_100;

import java.util.Random;

public class GerandoNumerosAleatorios {

	public static void main(String[] args) {
		System.out.println(Math.floor(Math.random()*100));
		
		Random aleatorio = new Random();		
		System.out.println(aleatorio.nextInt());
		
		//É considerado até 100
		System.out.println(aleatorio.nextInt(101));
		
		//Gera entre 0 e 5
		System.out.println(aleatorio.nextInt(5 + 1));
	}

}
