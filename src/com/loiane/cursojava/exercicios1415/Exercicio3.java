package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira seu sexo com a letra inicial");
	String input = scan.next();
	
	if (input.equalsIgnoreCase("f")){
		System.out.println("O sexo é feminino");
	} else if (input.equalsIgnoreCase("m")){
		System.out.println("O sexo é masculino");
	} else {
		System.out.println("Sexo inválido");
	}

	}

}
