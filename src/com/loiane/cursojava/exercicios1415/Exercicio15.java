package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Fala um lado do triangulo:");
	int lado1 = scan.nextInt();
	System.out.println("Fala outro lado do triangulo:");
	int lado2 = scan.nextInt();
	System.out.println("Fala outro lado do triangulo:");
	int lado3 = scan.nextInt();

	if ((lado1 + lado2 > lado3) &&
			(lado1 + lado3 > lado2) &&
				(lado3 + lado2 > lado1)) {
		System.out.println("É um triangulo");
		if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
			System.out.println("Isso é um triangulho equilátero");
		} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
			System.out.println("Triangulo escaleno");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
			System.out.println("Triangulo Isosceles");
		}
		

	} else {
		System.out.println("Essa combinação não forma um triangulo");
		
	}
	

	}

}
