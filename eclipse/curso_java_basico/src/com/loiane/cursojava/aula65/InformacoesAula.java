package com.loiane.cursojava.aula65;

@interface InformacoesAula {
	String autor();
	
	int aulaNumero();
	
	String blog() default "http://loiane.com";
	
	String site()default "http://loiane.training";
}
