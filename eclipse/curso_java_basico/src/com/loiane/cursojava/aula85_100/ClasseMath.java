package com.loiane.cursojava.aula85_100;

public class ClasseMath {

	public static void main(String[] args) {
		System.out.println(Math.pow(2,3));
		
		System.out.println(Math.round(4.7));		
		System.out.println(Math.round(4.4));
		
		//Arredonda pra cima
		System.out.println(Math.ceil(4.7));
		System.out.println(Math.ceil(4.4));
		
		//Arredonda pra baixo
		System.out.println(Math.floor(4.7));
		System.out.println(Math.floor(4.4));
		
		System.out.println(Math.round(Math.random() * 10));
		
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.cos(Math.toRadians(1)));
		System.out.println(Math.tan(Math.toRadians(45)));

	}

}
