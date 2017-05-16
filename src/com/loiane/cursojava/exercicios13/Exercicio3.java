package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Fale 2 números para obter a soma:");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int resultado = numero1 + numero2;
		System.out.println("A soma é: " + resultado);

	}

}
