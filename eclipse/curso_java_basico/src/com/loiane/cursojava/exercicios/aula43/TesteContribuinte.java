package com.loiane.cursojava.exercicios.aula43;

public class TesteContribuinte {

	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setNome("Juliana");
		pf1.setCpf("45678765676");
		pf1.setRendaBruta(1200);
		pf1.calcularImposto();

		
		PessoaFisica pf2 = new PessoaFisica();
		pf2.setNome("Jordana");
		pf2.setCpf("87465783909");
		pf2.setRendaBruta(2800);
		pf2.calcularImposto();

		
		PessoaFisica pf3 = new PessoaFisica();
		pf3.setNome("Jorge");
		pf3.setCpf("85236547854");
		pf3.setRendaBruta(2100);
		pf3.calcularImposto();

		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setNome("Fernando");
		pj1.setCnpj("7354676356756");
		pj1.setRendaBruta(2000);
		pj1.calcularImposto();

		
		PessoaJuridica pj2 = new PessoaJuridica();
		pj2.setNome("Reinaldo");
		pj2.setCnpj("1233456476756");
		pj2.setRendaBruta(10000);
		pj2.calcularImposto();

		
		PessoaJuridica pj3 = new PessoaJuridica();
		pj3.setNome("Giovana");
		pj3.setCnpj("34567536756756");
		pj3.setRendaBruta(500);
		pj3.calcularImposto();

		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = pf1;
		contribuintes[1] = pf2;
		contribuintes[2] = pf3;
		contribuintes[3] = pj1;
		contribuintes[4] = pj2;
		contribuintes[5] = pj3;
		
		for(Contribuinte c : contribuintes)
		{
			System.out.println(c.toString());
		}
		
		

	}

}
