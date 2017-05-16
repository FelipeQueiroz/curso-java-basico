	package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira um número");
	double numero1 = scan.nextDouble();
	System.out.println("Insira mais um número");
	double numero2 = scan.nextDouble();
	
	if (numero1 > numero2){
		System.out.println("O número maior é o primeiro, ou seja, " + numero1);
	} else {
		System.out.println("O numero maior é o segundo, ou seja, " + numero2);
	}
	
	
	

	}

}
