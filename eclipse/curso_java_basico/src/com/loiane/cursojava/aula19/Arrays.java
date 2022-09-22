package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33;
		double tempDia004 = 34;
		double tempDia005 = 31.3;
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33;
		temperaturas[3] = 34;
		temperaturas[4] = 31.3;
		
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
		
		System.out.println("O tamanho do array é " + temperaturas.length);
		
//		Endereço de memória
		System.out.println("Valores do array " + temperaturas);
		
		for(int i = 0; i < temperaturas.length; i++)
		{
			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
		}
		
		for(double temp : temperaturas) 
		{
			System.out.println(temp);
		}
		
	}

}
