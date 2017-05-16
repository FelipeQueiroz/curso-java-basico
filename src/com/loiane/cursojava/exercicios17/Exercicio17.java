package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira o número fatorial:");
	int num = scan.nextInt();
	
	int fatorial = 1;
	
	for(int i=num;i>0;i--){
		fatorial *= i;
		System.out.println(i);
		
	}
	System.out.println("Resultado: " + fatorial);

	}

}
