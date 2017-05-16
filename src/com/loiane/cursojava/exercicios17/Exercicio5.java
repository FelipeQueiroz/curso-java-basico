package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	double popA;
	double popB;
	double crescimentoA;
	double crescimentoB;
	
	boolean infoValida = false;
	
	do {
	System.out.println("Insira a população da cidade A:");
	popA = scan.nextDouble();
		if(popA > 0){
			infoValida = true;
		} else {
			System.out.println("A população tem que ser maior que 0");
		}
	
	
	}while(!infoValida);
	
	
	do{
	System.out.println("Insira a população da cidade B:");
	popB = scan.nextDouble();
	if(popB > 0){
		infoValida = true;
	} else {
		System.out.println("A população tem que ser maior que 0");
	}


	}while(!infoValida);
	
	
	do {
	System.out.println("Insira a taxa de crescimento da cidade A:");
	crescimentoA = scan.nextDouble();
	if(crescimentoA > 0){
		infoValida = true;
	} else {
		System.out.println("O crescimento da população tem que ser maior que 0");
	}


	}while(!infoValida);
	
	
	do {
	System.out.println("Insira a taxa de crescimento da cidade B:");
	crescimentoB = scan.nextDouble();
	
	if(crescimentoB > 0){
	infoValida = true;
	} else {
		System.out.println("O crescimento da população tem que ser maior que 0");
	}


}while(!infoValida);
	
	
	int ano = 0;
	
	while (popA < popB){
		popA += (popA / 100) * crescimentoA;
		popB += (popB / 100) * crescimentoB;
		ano ++;
		
	}
	
	System.out.println("População A: " + popA);
	System.out.println("População B: " + popB);
	System.out.println("Quantidade de anos: " + ano);
	
	
	
	
	

	}

}
