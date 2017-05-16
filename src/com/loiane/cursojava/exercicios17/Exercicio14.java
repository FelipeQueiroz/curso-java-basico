package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int num; 
	int par = 0;
	int impar = 0;
	
	for(int i=0;i<10;i++){
		System.out.println("Entre com um número");
		num = scan.nextInt();
		
		if(num % 2 == 0){
			par++;
			
		} else {
			impar++;
		}
		
		
	}
	
	System.out.println("Pares: " + par);
	System.out.println("Impares: " + impar);
	

	}

}
