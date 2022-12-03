package com.loiane.cursojava.aula64;

public class Anonima {
	
	public void imprimeTexto()
	{
		System.out.println("qualquer texto");
	}

	public static void main(String[] args) {
		Anonima anonima = new Anonima() {
			public void imprimeTexto()
			{
				System.out.println("Qualquer texto sobrescrito");
			}
		};
		
		anonima.imprimeTexto();
		
		//usando interface
		//instanciando como classe anonima
		Texto texto = new Texto() {
			@Override
			public void imprimeTexto()
			{
				System.out.println("qualquer texto - interface");
			}
		};
		
		texto.imprimeTexto();
	}
	
}
