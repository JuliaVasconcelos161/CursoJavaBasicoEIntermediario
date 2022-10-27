package com.loiane.cursojava.exercicios.aula43;

public class TesteAnimal {

	public static void main(String[] args) {
		System.out.println("----- Zoo -----\n");
		
		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setNumPatas(4);
		camelo.setCor("Amarelo");
		camelo.setVelocidade(2);
		camelo.setAmbiente("Terra");
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		
		Mamifero ursoDoCanada = new Mamifero();
		ursoDoCanada.setNome("Urso-do-Canadá");
		ursoDoCanada.setComprimento(180);
		ursoDoCanada.setCor("Vermelho");
		ursoDoCanada.setVelocidade(0.5);
		ursoDoCanada.setAlimento("Mel");
		
		Animal[] animais = new Animal[3];
		
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = ursoDoCanada;
		
		for(Animal animal: animais)
		{
			System.out.println(animal.toString());
		}

	}

}
