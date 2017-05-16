package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira o numero para a letra a:");
	int a = scan.nextInt();
	if (a == 0){
		System.out.println("A equa��o n�o � de segundo grau");
	}
	System.out.println("Insira o numero para a letra b:");
	int b = scan.nextInt();
	System.out.println("Insira o numero para a letra c:");
	int c = scan.nextInt();
	
	int delta = (b * b) - 4 * a * c;
	System.out.println("O delta �: " + delta);
	if (delta < 0){
		System.out.println("A equa��o n�o possui ra�zes reais");
	} else if (delta > 0){
	double calculo = Math.sqrt(delta);
	double x1 = (- b + calculo) / 2 * a;
	double x2 = (- b - calculo) / 2 * a;
	System.out.println("O valor de x linha �:" + x1);
	System.out.println("O valor de x duas linhas �:" + x2);
	
	}else if (delta == 0){
	double x = (- b) / 2 * a;
	System.out.println("O valor de x �: " + x);
	}

	}
}
