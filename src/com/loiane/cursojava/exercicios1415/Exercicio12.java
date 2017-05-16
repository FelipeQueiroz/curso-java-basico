package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira quanto ganha por hora:");
	double ganhoPorHora = scan.nextDouble();
	System.out.println("Quantas horas trabalha por mes?");
	int horasPorMes = scan.nextInt();
	
	double salarioBruto = ganhoPorHora * horasPorMes;
	System.out.println("Salário Bruto:" + salarioBruto);
	//desconto
	double inss = (salarioBruto / 100) * 10;

	//soma
	double fgts = (salarioBruto / 100) * 11;

	
	
	
	if (salarioBruto <= 900){
	double	salarioLiqui = salarioBruto - inss;
	double desconto = inss;
	System.out.println("(-) Imposto de Renda: Não é descontado" );
	System.out.println("(-) INSS: " + inss);
	System.out.println("Descontos: " + desconto);
	System.out.println("FGTS: " + fgts);
	System.out.println(" Salário Liqui: " + salarioLiqui);
		
	} else if (salarioBruto >= 901 && salarioBruto <= 1500){
		double impostoA = (salarioBruto / 100 ) * 5;
		double desconto = inss+ impostoA;
		double	salarioLiqui = salarioBruto - (desconto);
		System.out.println("(-) Imposto de Renda (5%): " + impostoA);
		System.out.println("(-) INSS: " + inss);
		System.out.println("Descontos: " + desconto);
		System.out.println("FGTS: " + fgts);
		System.out.println(" Salário Liqui: " + salarioLiqui);
			
	}else if (salarioBruto >= 1501 && salarioBruto <= 2500){
		double impostoB = (salarioBruto / 100 ) * 10;
		double desconto = inss + impostoB;
		double	salarioLiqui = salarioBruto - (desconto);
		System.out.println("(-) Imposto de Renda (10%): " + impostoB);
		System.out.println("(-) INSS: " + inss);
		System.out.println("Descontos: " + desconto);
		System.out.println("FGTS: " + fgts);
		System.out.println(" Salário Liqui: " + salarioLiqui);
		
	
	}else if (salarioBruto >= 1501){
		double impostoC = (salarioBruto / 100 ) * 20;
		double desconto = inss + impostoC;
		double	salarioLiqui = salarioBruto - desconto;
		System.out.println("(-) Imposto de Renda (20%): " + impostoC);
		System.out.println("(-) INSS: " + inss);
		System.out.println("Descontos: " + desconto);
		System.out.println(" FGTS: " + fgts);
		System.out.println(" Salário Liqui: " + salarioLiqui);
	}

	}

}
