package com.loiane.cursojava.exercicios.aula74;

public class SimuladorSemaforo {
	public static void main(String[] args)
	{
		ThreadSemaforo semaforo = new ThreadSemaforo();
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(semaforo.getCor());
			semaforo.esperarCorMudar();
		}
		
		semaforo.desligarSemaforo();
	}
}
