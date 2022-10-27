package com.loiane.cursojava.exercicios.aula36;

public class Curso {
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	public Curso(String nome, String horario, Professor professor, Aluno[] alunos)
	{
		this.nome = nome; 
		this.horario = horario;
		this.professor = professor;
		this.alunos = alunos;
	}
	
	public Curso() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public String obterInfo()
	{
		String info = "Nome do curso = " + nome + "\n";
		
				
		if(professor != null)
		{
			info += professor.obterInformacao();
		}
		
		if(alunos != null)
		{
			info += "\nAlunos:\n";
			for(Aluno aluno : alunos)
			{
				if(aluno != null)
				{
					info += aluno.obterInfo();
					info += "\n";
				}
			}
			
		}
		
		info += "Media da turma " + obterMediaTurma();
		return info;
	}
	
	public double obterMediaTurma()
	{
		double soma = 0;
		for(Aluno aluno: alunos)
		{
			if(aluno != null)
			{
				soma+= aluno.obterMedia();
			}

		}
		
		double media = soma / alunos.length;
		return media;
	}
	
	
	
}
