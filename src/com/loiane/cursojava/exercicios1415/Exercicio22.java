package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira a quantidade de kg de morango:");
	double kiloMo = scan.nextDouble();
	System.out.println("Insira a quantidade de kg de maçã:");
	double kiloMa = scan.nextDouble();
	
	double precoKgMorango = 0;
	if(kiloMo <= 5){
	precoKgMorango = 2.5;
		
	} else {
	precoKgMorango = 2.20;
	}
	
	double precoKgMaca = 0;
	
	if (kiloMa >= 6){
	precoKgMaca = 1.80;
		
	} else {
	precoKgMaca = 1.50;
	}
	double precoTMorango = precoKgMorango * kiloMo;
	double precoTMaca = precoKgMaca * kiloMa;
	double kiloT = kiloMa + kiloMo;
	double precoP = precoTMorango + precoTMaca;
	double desconto = (precoP / 100) * 10;
	
	if(kiloT >= 8 || precoP >= 25){
	double precoT = precoP - desconto;
		System.out.println("Você ganhou desconto de 10%");
		System.out.println("Valor total: " + precoT);
	} else {
		
		System.out.println("Valor total: " + precoP);
	}
	
	
	
	
	
	
	
	
	
	

	}

}
