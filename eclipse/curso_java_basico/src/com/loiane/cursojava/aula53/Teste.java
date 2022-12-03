package com.loiane.cursojava.aula53;

public class Teste {

	public static void main(String[] args) {
		usarConstantes();
		usarEnum();
	}
	private static void usarConstantes()
	{
		int domingo = DiasDaSemana.DOMINGO;
		int segunda = DiasDaSemana.SEGUNDA_FEIRA;
		int terca = DiasDaSemana.TERCA_FEIRA;
		int quarta = DiasDaSemana.QUARTA_FEIRA;
		int quinta = DiasDaSemana.QUINTA_FEIRA;
		int sexta = DiasDaSemana.SEXTA_FEIRA;
		int sabado = DiasDaSemana.SABADO;
		
		System.out.println("Usando constantes: \n");
		imprimirDiasDaSemana(domingo);
		imprimirDiasDaSemana(segunda);
		imprimirDiasDaSemana(terca);
		imprimirDiasDaSemana(quarta);
		imprimirDiasDaSemana(quinta);
		imprimirDiasDaSemana(sexta);
		imprimirDiasDaSemana(sabado);
		
		
	}
	
	private static void imprimirDiasDaSemana(int dia)
	{
		switch(dia)
		{
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
		}
	}
	
	private static void imprimirDiasDaSemana(DiaDaSemana dia)
	{
		switch(dia)
		{
			case DOMINGO:
				System.out.println("Domingo");
				break;
			case SEGUNDA:
				System.out.println("Segunda-feira");
				break;
			case TERCA:
				System.out.println("Terça-feira");
				break;
			case QUARTA:
				System.out.println("Quarta-feira");
				break;
			case QUINTA:
				System.out.println("Quinta-feira");
				break;
			case SEXTA:
				System.out.println("Sexta-feira");
				break;
			case SABADO:
				System.out.println("Sábado");
				break;
		}
	}
	
	private static void usarEnum()
	{
		DiaDaSemana domingo = DiaDaSemana.DOMINGO;
		DiaDaSemana segunda = DiaDaSemana.SEGUNDA;
		DiaDaSemana terca = DiaDaSemana.TERCA;
		DiaDaSemana quarta = DiaDaSemana.QUARTA;
		DiaDaSemana quinta = DiaDaSemana.QUINTA;
		DiaDaSemana sexta = DiaDaSemana.SEXTA;
		DiaDaSemana sabado = DiaDaSemana.SABADO;
		
		System.out.println("\nUsando enum: \n");
		imprimirDiasDaSemana(domingo);
		imprimirDiasDaSemana(segunda);
		imprimirDiasDaSemana(terca);
		imprimirDiasDaSemana(quarta);
		imprimirDiasDaSemana(quinta);
		imprimirDiasDaSemana(sexta);
		imprimirDiasDaSemana(sabado);
		
	}

}
