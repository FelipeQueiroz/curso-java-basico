package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Qual � sua primeira nota?");
	double nota1 = scan.nextDouble();
	System.out.println("Qual � sua segunda nota?");
	double nota2 = scan.nextDouble();
	double media = (nota1 + nota2) / 2;
	
	System.out.println("Sua m�dia �: " + media);
	
	if (media == 10){
		System.out.println("Aprovado com distin��o");
	} else if (media >= 7){
		System.out.println("Aprovado");
	} else{
		System.out.println("Reprovado!");
	}
	
	}

}
