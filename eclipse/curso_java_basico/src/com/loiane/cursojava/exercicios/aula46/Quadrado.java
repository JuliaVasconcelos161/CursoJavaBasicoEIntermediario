package com.loiane.cursojava.exercicios.aula46;

public class Quadrado extends Figura2D{
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		double area = Math.pow(lado, 2);
		return area;
	}
}
