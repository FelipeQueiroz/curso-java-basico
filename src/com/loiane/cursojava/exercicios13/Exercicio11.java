package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		int numero1 = scan.nextInt();
		System.out.println("Digite um número inteiro");
		int numero2 = scan.nextInt();
		System.out.println("Digite um número real");
		float numero3 = scan.nextFloat();
		
		float resultadoA = (numero1 * 2) * (numero2 / numero2);
		float resultadoB = (numero1 * 3) + numero3;
		double resultadoC = Math.pow(numero3 , 3);
		System.out.println("O primeiro resultado é: " + resultadoA);
		System.out.println("O segundo resultado é: " + resultadoB);
		System.out.println("O terceiro resultado é: " + resultadoC);
		

	}

}
