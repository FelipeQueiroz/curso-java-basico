package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um n�mero");
		double numero1 = scan.nextDouble();
		System.out.println("Insira um n�mero");
		double numero2 = scan.nextDouble();
		System.out.println("Insira um n�mero");
		double numero3 = scan.nextDouble();
		//maior
		if (numero1 >= numero2 && numero1 >= numero3){
			System.out.println("O primeiro n�mero � o maior, ou seja: " + numero1);
		} else if (numero2 >= numero1 && numero2 >= numero3){
			System.out.println("O segundo n�mero � o maior, ou seja: " + numero2);
		} else	if (numero3 >= numero2 && numero3 >= numero1){
			System.out.println("O terceiro n�mero � o maior, ou seja: " + numero3);
		} 
		//menor
		if (numero1 <= numero2 && numero1 <= numero3){
			System.out.println("O primeiro n�mero � o menor, ou seja: " + numero1);
		} else if (numero2 <= numero1 && numero2 <= numero3){
			System.out.println("O segundo n�mero � o menor, ou seja: " + numero2);
		} else if (numero3 <= numero2 && numero3 <= numero1){
			System.out.println("O terceiro n�mero � o menor, ou seja: " + numero3);
		}


	}

}
