package com.loiane.cursojava.exercicios.aula34;

public class ConversaoUnidadesDeTempo {
	
	static int converterMinutosEmSegundos(int minutos)
	{
		int segundos = minutos *60;
		return segundos;
	}
	
	static int converterHorasEmMinutos(int horas)
	{
		int minutos = horas*60;
		return minutos;
	}
	
	static int converterDiasEmHoras(int dias)
	{
		int horas = dias*24;
		return horas;
	}
	
	static int converterSemanasEmDias(int semanas)
	{
		int dias = semanas*7;
		return dias;
	}
	
	static int converterMesesEmDias(int meses)
	{
		int dias = meses*30;
		return dias;
	}
	
	static int converterAnosEmMeses(int anos)
	{
		int meses = anos*12;
		return meses;
	}
}
