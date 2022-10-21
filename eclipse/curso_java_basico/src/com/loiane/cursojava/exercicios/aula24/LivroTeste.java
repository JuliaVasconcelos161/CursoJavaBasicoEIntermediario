package com.loiane.cursojava.exercicios.aula24;

public class LivroTeste {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.titulo = "Amor sob encomenda";
		livro.autor = "Carina Rissi";
		livro.genero = "Romance";
		livro.numPag = 546;

		System.out.println("O nome do livro é " + livro.titulo);
	}

}
