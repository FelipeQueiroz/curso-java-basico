package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Entre com um pre�o:");
	double prod1 = scan.nextDouble();
	System.out.println("Entre com um pre�o:");
	double prod2 = scan.nextDouble();
	System.out.println("Entre com um pre�o:");
	double prod3 = scan.nextDouble();
	
   if (prod1 <= prod2 && prod1 <= prod3){
		System.out.println("O primeiro pre�o � o menor, com o valor de: " + prod1  +  "Compre este!");
	} else if (prod2 <= prod1 && prod2 <= prod3){
		System.out.println("O segundo pre�o � o menor, com o valor de: " + prod2  +  "Compre este!");
	} else	if (prod3 <= prod2 && prod3 <= prod1){
		System.out.println("O terceiro n�mero � o menor, com o valor de: " + prod3 +  "Compre este!");
	} 
	

	}

}
