package com.loiane.cursojava.exercicios.aula46;

public class Teste {

	public static void main(String[] args) {
		Quadrado f1 = new Quadrado();
		f1.setNome("Quadrado");
		f1.setLado(6);
		f1.setCor("Azul");
		
		Triangulo f2 = new Triangulo();
		f2.setNome("Triangulo");
		f2.setBase(4);
		f2.setAltura(2);
		f2.setCor("Laranja");
		
		Circulo f3 = new Circulo();
		f3.setNome("Circulo");
		f3.setRaio(2);
		f3.setCor("Amarelo");
		
		Cubo f4 = new Cubo();
		f4.setNome("Cubo");
		f4.setLado(3);
		f4.setCor("Vermelho");
		
		Esfera f5 = new Esfera();
		f5.setNome("Esfera");
		f5.setRaio(4);
		f5.setCor("Rosa");
		
		Cilindro f6 = new Cilindro();
		f6.setNome("Cilindro");
		f6.setAltura(4);
		f6.setRaio(2);
		f6.setCor("Roxo");
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		
		figuras[0] = f1;
		figuras[1] = f2;
		figuras[2] = f3;
		figuras[3] = f4;
		figuras[4] = f5;
		figuras[5] = f6;
		
		for(FiguraGeometrica f: figuras)
		{
			System.out.println("Figura Geometrica\n" + f.getNome() + "\n");
			
			if(f instanceof Figura2D)
			{
				Figura2D fd2 = (Figura2D) f;
				System.out.println("Area " + fd2.calcularArea() + "\n");
				
			}
			
			if(f instanceof Figura3D)
			{
				Figura3D fd3 = (Figura3D) f;
				System.out.println("Area " + fd3.calcularArea() + "\n");
				System.out.println("Volume " + fd3.calcularVolume() + "\n");
				
			}
			
		}

	}

}
