package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	

	
	boolean notaValida = false;
	
	do {
		System.out.println("Insira uma nota");
		double nota = scan.nextDouble();
		
		if (nota >=0 && nota <= 10){
			notaValida = true;
			System.out.println("Voc� digitou: " + nota);
			
		} else {
			
			System.out.println("Voc� digitou uma nota inv�lida");
		
			
		}
	} while (!notaValida);
	
	
	
	
	
	

	}

}
