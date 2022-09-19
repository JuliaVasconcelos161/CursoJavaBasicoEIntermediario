package com.loiane.cursojava.exercicios.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioEAumento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("###,###.##");
		double salario = 1000;
		double percentual = 1.5;
		salario += salario * (percentual/100);
		
		for(int i = 1997; i <= 2015; i++)
		{
			percentual *= 2;
			salario += salario * (percentual/100);
			
			System.out.println(i + " - " + format.format(salario) + " - " + percentual + "%");
		}
	}

}
