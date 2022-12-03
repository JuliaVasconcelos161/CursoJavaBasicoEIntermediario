package com.loiane.cursojava.aula56;

public class TesteDocumento {

	public static void main(String[] args) {
//		for(TipoDocumento doc: TipoDocumento.values())
//		{
//			System.out.println(doc + " - " + doc.geraNumero());
//		}
		
		Pessoa pessoaF = new Pessoa();
		pessoaF.setTipoDoc(Enum.valueOf(TipoDocumento.class, "CPF"));
		pessoaF.setNumeroDocumento(pessoaF.getTipoDoc().geraNumero());
		System.out.println(pessoaF);
		
		Pessoa pessoaJ = new Pessoa();
		pessoaJ.setTipoDoc(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pessoaJ.setNumeroDocumento(pessoaJ.getTipoDoc().geraNumero());
		System.out.println(pessoaJ);
	}

}
