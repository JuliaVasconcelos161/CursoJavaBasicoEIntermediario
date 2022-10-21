package com.loiane.cursojava.exercicios.aula24;

public class LivroLivrariaTeste {

	public static void main(String[] args) {
		LivroLivraria livroLivraria = new LivroLivraria();
		livroLivraria.titulo = "Amor sob encomenda";
		livroLivraria.autor = "Carina Rissi";
		livroLivraria.genero = "Romance";
		livroLivraria.numPag = 546;
		livroLivraria.preco = 28.32;

		System.out.println("O nome do livro é " + livroLivraria.titulo);
	}

}
