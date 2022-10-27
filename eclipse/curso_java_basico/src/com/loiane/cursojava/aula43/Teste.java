package com.loiane.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Matematica");
		
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "sadfxdgf";
		String s2 = "sadfxdgf";
		
		System.out.println(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Matematica");
		
		double[] notas2 = {10, 8, 8, 7};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno2);

		System.out.println(aluno.equals(aluno2));
	}

}
