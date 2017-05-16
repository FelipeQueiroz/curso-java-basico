package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Quais são suas 4 notas bimestrais?");
	float nota1 = scan.nextFloat();
	float nota2 = scan.nextFloat();
	float nota3 = scan.nextFloat();
	float nota4 = scan.nextFloat();
	float media = (nota1 + nota2 + nota3 + nota4) / 4;
	System.out.println("Sua média é: " + media);
	

	}

}
