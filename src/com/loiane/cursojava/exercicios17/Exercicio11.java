package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio11 {


		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Insira um n�mero");
			int num1 = scan.nextInt();
			System.out.println("Insira um n�mero");
			int num2 = scan.nextInt();
			
			int soma = 0;
			
			for (int i=num1; i<=num2 ; i++){
				soma += i;
				
			}
			System.out.println(soma);
			

	}

}
