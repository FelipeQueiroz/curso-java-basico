package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Quanto voc� ganha por hora?");
	float ganhoPorHora = scan.nextFloat();
	System.out.println("Quantas horas trabalha por m�s?");
	int horasPorMes = scan.nextInt();
	float salarioBruto = (ganhoPorHora * horasPorMes);
	float impostoR = (salarioBruto / 100) * 11;
	float inss = (salarioBruto / 100) * 8;
	float sindicato = (salarioBruto / 100) * 5;
	float desconto = impostoR + inss + sindicato;
	
	
	float salarioLiqui = salarioBruto - desconto ;
	System.out.println("Sal�rio bruto: " + salarioBruto);
	System.out.println("INSS: " + inss);
	System.out.println("SINDICATO: " + sindicato);
	System.out.println("Sal�rio L�quido: " + salarioLiqui);
	System.out.println("Descontos: " + desconto);
	
	
	

	}

}
