package com.loiane.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		aluno.setNome("Maria");
		System.out.println(aluno.getNome());
		
		//Nesse caso so terei acesso a atributos em comum
		Pessoa aluno1 = new Aluno();
		aluno1.setNome("Joao");

	}

}
