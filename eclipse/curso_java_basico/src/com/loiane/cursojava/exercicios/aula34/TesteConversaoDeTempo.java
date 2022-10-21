package com.loiane.cursojava.exercicios.aula34;

public class TesteConversaoDeTempo {

	static void imprimir(int num)
	{
		System.out.println(num);
	}
	public static void main(String[] args) {
		imprimir(ConversaoUnidadesDeTempo.converterAnosEmMeses(10));
		
		imprimir(ConversaoUnidadesDeTempo.converterDiasEmHoras(20));
		
		imprimir(ConversaoUnidadesDeTempo.converterHorasEmMinutos(2));
		
		imprimir(ConversaoUnidadesDeTempo.converterMesesEmDias(10));
		
		imprimir(ConversaoUnidadesDeTempo.converterSemanasEmDias(3));
		
		imprimir(ConversaoUnidadesDeTempo.converterMinutosEmSegundos(2));

	}

}
