package com.loiane.cursojava.exercicios.aula52;

public class Contato {
	private String nome;
	private String telefone;
	private String email;
	private static int contador = 0;
	private int identificador;
	
	public Contato()
	{
		contador++;
		this.identificador = contador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdentificador() {
		return identificador;
	}

	@Override
	public String toString() {
		String s = "Contato\n";
		s += "Nome = " + nome + "\n";
		s += "Telefone = " + telefone + "\n";
		s += "Email = " + email + "\n";
		s += "Identificador = " + identificador + "\n";
		return s;
	}
	
	
	
}
