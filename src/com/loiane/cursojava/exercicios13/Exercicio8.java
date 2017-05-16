package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Quanto você ganha por hora?");
	float ganhoPorHora = scan.nextFloat();
	System.out.println(" Quantas horas trabalha por mês?");
	int horasPorMes = scan.nextInt();
	float salario = (ganhoPorHora * horasPorMes);
	System.out.println("Você ganha por mês:" + salario);
	

	}

}
