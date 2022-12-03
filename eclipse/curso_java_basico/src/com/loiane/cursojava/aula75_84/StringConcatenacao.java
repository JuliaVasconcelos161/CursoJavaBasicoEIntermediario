package com.loiane.cursojava.aula75_84;

public class StringConcatenacao {

	public static void main(String[] args) {
		String curso = "Curso ";
		String java = "Java";
		
		String cursoJava = curso + java;
		System.out.println(cursoJava);
		
		String resultado2Com2 = "Resultado de 2+2 = " + (2+2);
		System.out.println(resultado2Com2);
		
		String resultado2Com2_ = "Resultado de 2+2 = " + 2 + 2;
		System.out.println(resultado2Com2_);
		
		String um = String.valueOf(1);
		System.out.println(um);
		
		String concatenacao = "Lorem Ipsum é simplesmente um texto fictício da indústria tipográfica e de impressão."
				+ " Lorem Ipsum tem sido o texto fictício padrão da indústria desde os anos 1500, quando um impressor "
				+ "desconhecido pegou uma cozinha de tipos e embaralhou-a para fazer um livro de espécimes de tipos. Ele sobreviveu não apenas cinco séculos, "
				+ "mas também o salto para a composição eletrônica, permanecendo essencialmente inalterado. Foi popularizado na década de 1960 com o lançamento "
				+ "de folhas Letraset contendo passagens de Lorem Ipsum e, mais recentemente, com software de editoração eletrônica como Aldus PageMaker,"
				+ "incluindo versões de Lorem Ipsum.";
		System.out.println(concatenacao);
		
		String concatenacao2 = "Lorem Ipsum é simplesmente um texto fictício da indústria tipográfica e de impressão.";
		concatenacao2 += " Lorem Ipsum tem sido o texto fictício padrão da indústria desde os anos 1500, quando um impressor ";
		concatenacao2 += "desconhecido pegou uma cozinha de tipos e embaralhou-a para fazer um livro de espécimes de tipos. Ele sobreviveu não apenas cinco séculos, ";
		concatenacao2 += "mas também o salto para a composição eletrônica, permanecendo essencialmente inalterado. Foi popularizado na década de 1960 com o lançamento ";
		concatenacao2 += "de folhas Letraset contendo passagens de Lorem Ipsum e, mais recentemente, com software de editoração eletrônica como Aldus PageMaker,";
		concatenacao2 += "incluindo versões de Lorem Ipsum.";
		System.out.println(concatenacao2);
		

	}

}
