package com.loiane.cursojava.exercicios.aula36;

public class Professor{
	private String nome;
	private String departamento;
	private String email;
	
	public Professor(String nome, String departamento, String email)
	{
		this.nome = nome;
		this.departamento = departamento;
		this.email = email;
	}
	public Professor(){ }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String obterInformacao()
	{
		return "Professor = " + nome + "\n" +
				"Departamento do professor = " + departamento + "\n" +
				"Email do professor = " + email + "\n";
	}
}
