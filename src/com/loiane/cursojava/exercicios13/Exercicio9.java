package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Qual a temperatura em Farenheit?");
	float tempFaren = scan.nextFloat();
	float celsius = 5 *(tempFaren - 32) / 9;
	System.out.println("Temperatura em Celsius: " + celsius);
	

	}

}
