package com.loiane.cursojava.aula41;

public class Teste {

	public static void main(String[] args) {
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		aluno.setEndereco("Rua 4, num 6");
		professor.setEndereco("Rua 8, num 60");
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();

	}

}
