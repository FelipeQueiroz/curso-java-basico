package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Qual é sua altura?");
	float altura = scan.nextFloat();
	float pesoIdeal = (72.7F * altura) - 58;
	System.out.println("Seu peso ideal é:" + pesoIdeal);
	

	}

}
