package com.loiane.cursojava.exercicios.aula33;

public class Lampada {
	private String cor;
	private String modelo;
	private String tensao;
	private int potencia;
	private int garantiaMeses;
	
	private boolean ligada;
	
	public Lampada()
	{
		
	}
	public Lampada(String cor, String modelo, String tensao, int potencia, int garantiaMeses)
	{
		this.cor = cor;
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.garantiaMeses = garantiaMeses;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}


	
	public void desligarLampada()
	{
		setLigada(false);
	}
	
	public void ligarLampada()
	{
		
		setLigada(true);
	}
	
	public void mostrarEstado()
	{
		if(isLigada())
		{
			System.out.println("A lâmpada está ligada");
		}
		else
		{
			System.out.println("A lâmpada está desligada");
		}
	}
	
	public void mudarEstado()
	{
		if(isLigada())
		{
			desligarLampada();
		}
		else
		{
			ligarLampada();
		}
	}
}
