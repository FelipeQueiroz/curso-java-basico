package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Quantidade de metros?");
	float metros = scan.nextFloat();
	float centimetros = 100 * metros;
	System.out.println("Quantidade em centimetros:" + centimetros);
	

	}

}
