package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Qual o tamanho do arquivo?");
	double tamanho = scan.nextFloat();
	System.out.println("Qual a velocidade do link de Internet?");
	double velocidadeSeg = scan.nextFloat();
	
	double tempoSeg = tamanho / velocidadeSeg;

	System.out.println("Tempo estimado: " + tempoSeg);
	System.out.printf( "%.2f", tempoSeg );


	}

}
