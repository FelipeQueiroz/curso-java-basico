package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira um numero");
	int num1 = scan.nextInt();
	System.out.println("Insira outro numero");
	int num2 = scan.nextInt();
	System.out.println("Qual operação deseja fazer? ( + - / * )");
	String operacao = scan.next();
	
	double resultado = 0;
	boolean valida = true;
	
	switch(operacao){
	case "+": resultado = num1 + num2; break;
	case "-": resultado = num1 - num2; break;
	case "/": resultado = num1 / num2; break;
	case "*": resultado = num1 * num2; break;
	default: 
		System.out.println("Operação inválida");
		valida = false;
	
	}
	if(valida){
		if(resultado >= 0){
			System.out.println("Resultado positivo");
		} else {
			System.out.println("Resultado negativo");
		}
	}
	
	if (resultado % 2 == 0){
		System.out.println("resultado par");
	} else{
		System.out.println("resultado impar");
	}
	
	System.out.println("Resultado: " + resultado);
	
	
	}

}
