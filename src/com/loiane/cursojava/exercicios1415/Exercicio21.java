package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira o número de litros:");
	double litro  = scan.nextDouble();
	System.out.println("Insira o tipo de combustivel:");
	String tipo = scan.next();
	
	double precoA = 1.90 * litro;
	double precoG = 2.50 * litro;
	
	if (tipo.equalsIgnoreCase("a")){

		if(litro <= 20){
		double desconto = (precoA / 100) * 3;
		double precoT = precoA - desconto;
		System.out.println("O preço da alcool será de: " + precoT);
		} else {
			double desconto = (precoA / 100) * 5;
			double precoT = precoA - desconto;
			System.out.println("O preço da alcool será de: " + precoT);
		}
	
	if (tipo.equalsIgnoreCase("g")){
		if(litro <= 20){
			double descontoG = (precoG / 100) * 4;
			double precoT = precoG - descontoG;
			System.out.println("O preço da gasolina será de: " + precoT);
			
		} else {
			double descontoG = (precoG / 100)* 6;
			double precoT = precoG - descontoG;
			System.out.println("O preço da gasolina será de: " + precoT);
			
		}
		
		
	}
		
		
	}

	}

}
