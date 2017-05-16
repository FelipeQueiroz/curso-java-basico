package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Qual é seu sálario atual?");
	double salario = scan.nextDouble();
 
	if(salario <= 280){
	double aumentoA = ( salario / 100 ) * 20;
	double salarioA = salario + aumentoA;
	System.out.println("Salário antes do reajuste: " + salario);
	System.out.println("O aumento foi de: " + aumentoA);
	System.out.println("Seu salário aumento em 20%, que agora é: " + salarioA);
		
	} else if(salario > 280 && salario <= 700){
		double aumentoB = ( salario / 100 ) * 15;
		double salarioB = salario + aumentoB;
		System.out.println("Salário antes do reajuste: " + salario);
		System.out.println("O aumento foi de: " + aumentoB);
		System.out.println("Seu salário aumento em 15%, que agora é: " + salarioB);
			
	} else if(salario >= 701 && salario <= 1500){
			double aumentoC = ( salario / 100 ) * 10;
			double salarioC = salario + aumentoC;
			System.out.println("Salário antes do reajuste: " + salario);
			System.out.println("O aumento foi de: " + aumentoC);
			System.out.println("Seu salário aumento em 10%, que agora é: " + salarioC);
				
	} else {
		double aumentoD = ( salario / 100 ) * 5;
		double salarioD = salario + aumentoD;
		System.out.println("Salário antes do reajuste: " + salario);
		System.out.println("O aumento foi de: " + aumentoD);
		System.out.println("Seu salário aumento em 5%, que agora é: " + salarioD);
			
		}

	}

}
