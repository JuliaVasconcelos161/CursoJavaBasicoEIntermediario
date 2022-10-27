package com.loiane.cursojava.exercicios.aula46;

public class Esfera extends Figura3D{
	
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularVolume() {
		double volume = (4* Math.PI* Math.pow(raio, 3))/3;
		return volume;
	}

	@Override
	public double calcularArea() {
		double area = 4* Math.PI * Math.pow(raio,2);
		return area;
	}

}
