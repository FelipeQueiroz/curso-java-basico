package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Qual a temperatura em Celsius?");
	float celsius = scan.nextFloat();
	float tempFaren = (celsius * 1.8F) + 32;
	System.out.println("A temperatura em Farenheit é: " + tempFaren );

	}

}
