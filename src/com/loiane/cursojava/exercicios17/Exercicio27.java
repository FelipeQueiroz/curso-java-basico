package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de temperaturas:");
		int qntTemp = scan.nextInt();
		
		double temp;
		double soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		for(int i = 1; i<=qntTemp; i++){
			System.out.println("Entre com a temperatura (" + i + ")");
			temp = scan.nextDouble();
			soma += temp;
			
			if(temp > maior){
				maior = temp;
			} if(temp < menor) {
				menor = temp;
			}
		}
		
		System.out.println("M�dia: " + (soma/qntTemp));
		System.out.println("Menor temperatura: " + menor);
		System.out.println("Maior temperatura: " + maior);
		

	}

}
