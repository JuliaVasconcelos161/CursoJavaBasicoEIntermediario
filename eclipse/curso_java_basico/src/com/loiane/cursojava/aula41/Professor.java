package com.loiane.cursojava.aula41;

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
	
	public double calcularSalarioLiquido()
	{
		return 0;
	}
	
	public String obterEtiquetaEndereco()
	{
		String s = "Endereço do professor: ";
		s += this.getEndereco();
		return s;
	}
	
	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endereco professor ");
		System.out.println(this.obterEtiquetaEndereco());
		
	}
	
}
