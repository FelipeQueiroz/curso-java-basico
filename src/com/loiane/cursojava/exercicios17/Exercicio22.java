package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Insira a quantidade de CD's:");
	int qntdCD = scan.nextInt();
	
	double precoCD = 0;
	double precoTotal = 0;
	boolean invalido = false;
	for(int i = 1; i<= qntdCD; i++){
		System.out.println("Insira o preço do CD (" + i + "):");
		precoCD = scan.nextInt();
		
		precoTotal += precoCD;
		
		
	}
System.out.println("O valor total investido nos CD's é de: R$" + precoTotal);
double media = precoTotal / qntdCD;
System.out.println("A média do preço de cada CD é de: R$" + media);
	
	}

}
