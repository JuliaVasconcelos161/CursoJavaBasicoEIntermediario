package com.loiane.cursojava.exercicios.aula43;

public class Peixe extends Animal{
	
	private String caracteristicas;
	
	public Peixe()
	{
		this.setNumPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinza");
		this.caracteristicas = "Barbatanas e caudas";
	}
	
	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "Tipo: Peixe \n";
		s += "caracteristicas = " + caracteristicas;
		
		return s;
	}
}
