package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("Digite um número");
	double num1 = scan.nextDouble();
	
	System.out.println("Digite um número");
	double num2 = scan.nextDouble();
	
	System.out.println("Digite um número");
	double num3 = scan.nextDouble();
	
	if (num1 >= num2 && num1 >= num3 && num2 >= num3){
		System.out.println("A ordem descrescente é " + num1  + "-" + num2  + "-" + num3  );
	} else if (num1 >= num2 && num1 >= num3 && num3 >= num2){
		System.out.println("A ordem descrescente é " + num1  + "-" + num3  + "-" + num2  );
	} else if (num2 >= num1 && num2 >= num3 && num1 >= num3){
		System.out.println("A ordem descrescente é " + num2  + "-" + num1  + "-" + num3  );
	} else if (num2 >= num1 && num2 >= num3 && num3 >= num1){
		System.out.println("A ordem descrescente é " + num2  + "-" + num3  + "-" + num1  );
	} else if (num3 >= num2 && num3 >= num1 && num2 >= num1){
		System.out.println("A ordem descrescente é " + num3  + "-" + num2  + "-" + num1  );
	} else if (num3 >= num2 && num3 >= num1 && num1 >= num2){
		System.out.println("A ordem descrescente é " + num3  + "-" + num1  + "-" + num2  );
	}
	
	}

}
