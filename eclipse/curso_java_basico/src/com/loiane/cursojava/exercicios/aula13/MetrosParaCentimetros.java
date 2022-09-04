package com.loiane.cursojava.exercicios.aula13;
import java.util.Scanner;

public class MetrosParaCentimetros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double centimetros;
		double metros;
		
		System.out.println("Converta de metros para centimetros\n");
		System.out.println("Insira os metros: ");
		metros = scan.nextDouble();
		centimetros = metros * 100;
		System.out.println("Centimetros: " + centimetros + " cm");
		

	}

}
