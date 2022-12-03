package com.loiane.cursojava.aula85_100;

import java.util.Date;

public class ClasseDate {

	public static void main(String[] args) {
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		System.out.println("Milissegundos desde 1 Jan 1970" + hoje.getTime());
		
		System.out.println(hoje.getDate());
	}

}
