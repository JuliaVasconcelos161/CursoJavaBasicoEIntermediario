package com.loiane.cursojava.exercicios.aula27;

public class Lampada {
	String cor;
	String modelo;
	String tensao;
	int potencia;
	int garantiaMeses;
	
	boolean ligada;
	
	void desligarLampada()
	{
		ligada = false;
	}
	
	void ligarLampada()
	{
		
		ligada = true;
	}
	
	void mostrarEstado()
	{
		if(ligada)
		{
			System.out.println("A lâmpada está ligada");
		}
		else
		{
			System.out.println("A lâmpada está desligada");
		}
	}
	
	void mudarEstado()
	{
		if(ligada)
		{
			desligarLampada();
		}
		else
		{
			ligarLampada();
		}
	}
}
