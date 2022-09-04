package com.loiane.cursojava.exercicios.aula13;
import java.util.Scanner;
import java.lang.Math;

public class CalculaTempoDeDownloads {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		double tamanhoDoArquivo;
		double velocidadeDeDownload;
		double tempoGastoEmMinutos;
		
		System.out.println("Digite o tamanho do arquivo em mb e a velocidade de um link de internet em mbps");
		tamanhoDoArquivo = scan.nextDouble();
		velocidadeDeDownload = scan.nextDouble();
		tempoGastoEmMinutos = tamanhoDoArquivo/velocidadeDeDownload;
		System.out.println("O tempo gasto sera aproximadamente: "+ Math.round(tempoGastoEmMinutos) +" minutos");

	}

}
