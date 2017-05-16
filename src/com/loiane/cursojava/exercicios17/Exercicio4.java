package com.loiane.cursojava.exercicios17;

public class Exercicio4 {

	public static void main(String[] args) {
	double popA = 80000;
	double popB = 200000;
	int ano = 0;
	
	
	
	while (popA < popB){
		popA += (popA / 100) * 3;
		popB += (popB / 100) * 1.5;
		ano ++;
		
	}
	
	System.out.println("População A: " + popA);
	System.out.println("População B: " + popB);
	System.out.println("Quantidade de anos: " + ano);	
	

	}

}
