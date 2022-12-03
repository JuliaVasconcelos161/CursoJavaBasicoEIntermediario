package com.loiane.cursojava.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class UsandoResourceBundle {

	public static void main(String[] args) {
	
		Locale.setDefault(new Locale("en", "us"));
		System.out.println("Locale atual " + Locale.getDefault());
		
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
		
		System.out.println("Olá: " + rb.getString("hello"));
		
		System.out.println("Mundo: " + rb.getString("world"));
		
		
		Locale.setDefault(new Locale("pt", "br"));
		System.out.println("Locale atual " + Locale.getDefault());
		rb = ResourceBundle.getBundle("meu-texto");
		System.out.println("Olá: " + rb.getString("hello"));
		
		System.out.println("Mundo: " + rb.getString("world"));

	}

}
