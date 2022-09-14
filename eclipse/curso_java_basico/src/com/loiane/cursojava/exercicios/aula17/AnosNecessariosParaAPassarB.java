package com.loiane.cursojava.exercicios.aula17;

public class AnosNecessariosParaAPassarB {

	public static void main(String[] args) {
		int anosParaUltrapassar = 0;
		int habitantesA = 80000;
		int habitantesB = 200000;

		
		while(habitantesA < habitantesB)
		{
			habitantesA += habitantesA * 0.03; 
			habitantesB += habitantesB * 0.015;
			anosParaUltrapassar++;
		}
		
		System.out.println("Populacao A: " + habitantesA);
		System.out.println("Populacao B: " + habitantesB);
		System.out.println("Anos para ultrapassar seriam: " + anosParaUltrapassar);
		
	}

}
