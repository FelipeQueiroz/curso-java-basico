package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira um n�mero");
	long numero = scan.nextLong();
	if (numero > 0){
		System.out.println("O n�mero � positivo");
	} else if (numero < 0){
		System.out.println("O n�mero � negativo");
	}
	

	}

}
