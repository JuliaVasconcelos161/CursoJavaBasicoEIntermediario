package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class AnosNecessariosComInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean valido = false;
		
		double anosParaUltrapassar = 0;
		double habitantesA;
		double habitantesB;
		double taxaA;
		double taxaB;
		
		do
		{
			System.out.println("Entre com a população A: ");
			habitantesA = scan.nextDouble();
			if(habitantesA > 0)
			{
				valido = true;
			}
			else
			{
				System.out.println("População A precisa ser maior que 0");
			}
		}while(!valido);
		valido = false;
		
		do
		{
			System.out.println("Entre com a população B: ");
			habitantesB = scan.nextDouble();
			if(habitantesB > 0)
			{
				valido = true;
			}
			else
			{
				System.out.println("População B precisa ser maior que 0");
			}
		}while(!valido);
		valido = false;
		
		do
		{
			System.out.println("Entre com a taxa da população A: ");
			taxaA = scan.nextDouble();
			if(taxaA > 0)
			{
				valido = true;
			}
			else
			{
				System.out.println("Taxa da população A precisa ser maior que 0");
			}
		}while(!valido);
		valido = false;
		
		do
		{
			System.out.println("Entre com a taxa da população B: ");
			taxaB = scan.nextDouble();
			if(taxaB > 0)
			{
				valido = true;
			}
			else
			{
				System.out.println("Taxa da população B precisa ser maior que 0");
			}
		}while(!valido);
		
		

		
		while(habitantesA < habitantesB)
		{
			habitantesA += habitantesA * taxaA;
			habitantesB += habitantesB * taxaB;
			anosParaUltrapassar++;
		}
		
		System.out.println("Populacao A: " + habitantesA);
		System.out.println("Populacao B: " + habitantesB);
		System.out.println("Anos para ultrapassar seriam: " + anosParaUltrapassar);
		
	}
	

}
