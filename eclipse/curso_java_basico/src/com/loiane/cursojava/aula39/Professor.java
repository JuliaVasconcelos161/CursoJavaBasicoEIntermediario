package com.loiane.cursojava.aula39;

public class Professor extends Pessoa{
	
	public Professor() {
		super();
	}

	private double salario;
	private String curso;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void verificarAcesso()
	{
		this.nomeVerificado = "ahsdkfj";
		super.nomeVerificado = "Jasjdkj";
		
		this.setNomeVerificado("lsdkfgkjsd");
	}
	
	public double calcularSalarioLiquido()
	{
		return 0;
	}
	
	
}
