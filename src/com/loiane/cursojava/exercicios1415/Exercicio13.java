package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite um dia da semana (1 a 7)");
	int diaSemana = scan.nextInt();
	
	switch (diaSemana){
	case 1: System.out.println("Domingo"); break;
	case 2: System.out.println("Segunda"); break;
	case 3: System.out.println("Ter�a"); break;
	case 4: System.out.println("Quarta"); break;
	case 5: System.out.println("Quinta"); break;
	case 6: System.out.println("Sexta"); break;
	case 7: System.out.println("Sab�do"); break;
	default: System.out.println("Esse n�o � um dia da semana");
	
	}
	}

}
