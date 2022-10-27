package com.loiane.cursojava.exercicios.aula52;

public class Agenda {
	Contato[] contatos;
	
	public Agenda()
	{
		this.contatos = new Contato[5];
	}
	
	public void adicionarContato(Contato c) throws AgendaCheiaException 
	{
		boolean cheia = true;
		for(int i = 0; i < contatos.length; i++)
		{
			if(contatos[i] == null)
			{
				contatos[i] = c; 
				cheia = false;
				break;
			}
		}
		
		if(cheia)
		{
			//lançar exception aqui
			throw new AgendaCheiaException();
		}
	}

	public int consultarContatoPorNome(String nome) throws ContatoNaoExisteException
	{
		for(int i = 0; i < contatos.length; i++)
		{
			if(contatos[i] != null)
			{
				if(contatos[i].getNome().equalsIgnoreCase(nome))
				{
					return i;
				}
			}
		}
		//lancar a exception contato n existe
		throw new ContatoNaoExisteException(nome);
	}
	@Override
	public String toString() {
		String s = "";
		for(Contato c: contatos)
		{
			if(c != null)
			{
				System.out.println(c.toString()+ "\n");
			}		
		}
		return s;
	}
	
	
}

