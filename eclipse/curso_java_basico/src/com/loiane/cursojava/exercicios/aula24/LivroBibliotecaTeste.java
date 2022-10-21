package com.loiane.cursojava.exercicios.aula24;

import java.util.Date;

public class LivroBibliotecaTeste {

	public static void main(String[] args) {
		LivroBiblioteca livroBiblioteca = new LivroBiblioteca();
		livroBiblioteca.titulo = "Amor sob encomenda";
		livroBiblioteca.autor = "Carina Rissi";
		livroBiblioteca.genero = "Romance";
		livroBiblioteca.numPag = 546;

		livroBiblioteca.emprestado = true;
		livroBiblioteca.dataEntrega = new Date();
		livroBiblioteca.pessoaPegouEmprestado = "Julia";
		System.out.println("O nome do livro é " + livroBiblioteca.titulo);

	}

}
