package com.loiane.cursojava.aula36;

public class TesteContato {

	public static void main(String[] args) {
		Contato contato = new Contato();
		
		contato.setNome("Tairone");
//		contato.setEndereco("Rua Palmerone");
//		contato.setTelefone("32999456789");
		
//		relacionamento tem-um endereco
		Endereco end = new Endereco();
		end.setNomeRua("Fernandes");
		end.setCidade("BH");
		end.setComplemento("101");
		end.setNumero("111");
		end.setEstado("Minas Gerais");
		end.setCep("123345345");
		
		contato.setEndereco(end);
		
//		relacionamento tem-um telefone
		Telefone telefone = new Telefone();
		telefone.setDdd("32");
		telefone.setNum("999456789");
		telefone.setTipo("Residencial");
		
		Telefone telefone2 = new Telefone();
		telefone2.setDdd("32");
		telefone2.setNum("999789789");
		telefone2.setTipo("Celular");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;

		contato.setTelefones(telefones);
		System.out.println(contato.getNome());
		
		if(contato != null && contato.getEndereco() != null)
		{
			System.out.println(contato.getEndereco().getCidade());
		}
		
//		if(contato != null && contato.getTelefone() != null)
//		{
//			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNum() + " " + contato.getTelefone().getTipo());
//		}
		if(contato != null && contato.getTelefones() != null)
		{
			for(Telefone t : contato.getTelefones())
			{
				System.out.println(t.getDdd() + " " + t.getNum() + " " + t.getTipo());
			}
		}

	}

}
