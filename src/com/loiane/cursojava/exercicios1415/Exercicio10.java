package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Em qual período você estuda? (M = Matutino / V = Vespertino / N = Noturno)");
	String letra = scan.next();
	
	if (letra.equalsIgnoreCase("M")){
		System.out.println("Bom dia !");
	} else if (letra.equalsIgnoreCase("V")){
		System.out.println("Boa Tarde !");
	} else if (letra.equalsIgnoreCase("N")){
		System.out.println("Boa noite !");
	} else {
		System.out.println("Valor inválido");
	}
	
	
	
	
	}

}
