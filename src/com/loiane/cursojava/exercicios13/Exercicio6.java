package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	System.out.println("Qual � o raio do c�rculo? ");
	int raio = scan.nextInt();
	float areac = (raio * raio) * 3.14F;
	System.out.println("A �rea do circulo � aproximadente: " + areac);
	
	

	}

}
