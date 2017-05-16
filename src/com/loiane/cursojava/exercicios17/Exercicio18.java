package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira um número:");
	int num = scan.nextInt();
	
	boolean primo = true;
	for(int i=2;i<num;i++){
		if(num % i == 0){
			System.out.println("Numero não é primo");
			primo = false;
		}
	}
	
	if(primo){
		System.out.println("Numéro primo!");
	}
	
	
	

	}

}
