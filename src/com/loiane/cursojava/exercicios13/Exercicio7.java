package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Qual é a medida do lado do quadrado?");
	int lado = scan.nextInt();
	int areaq = lado * lado;
	int dobroa = areaq * 2;
	System.out.println("A área do quadrado é de: " + areaq);
	System.out.println("O dobro da área é de: " + dobroa);

	}

}
