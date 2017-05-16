package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira o número:");
	int numero = scan.nextInt();
	
	
	if (numero % 2 == 0){
		System.out.println("par");
	} else {
		System.out.println("Impar");
	}

	}

}
