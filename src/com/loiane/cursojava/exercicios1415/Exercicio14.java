package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite sua primeira nota");
	double nota1 = scan.nextDouble();
	System.out.println("Digite sua segunda nota");
	double nota2 = scan.nextDouble();
	
	double media = (nota1 + nota2) / 2;
	System.out.println("Sua média foi de: " + media);
	
	if(media >=0 && media <= 3.9){
		System.out.println("Você tirou nota E");
		System.out.println("Você está reprovado!");
	}else if(media >=4 && media <= 5.9){
		System.out.println("Você tirou nota D");
		System.out.println("Você está reprovado!");
	}else if(media >=6 && media <= 7.4){
		System.out.println("Você tirou nota C");
		System.out.println("Você está aprovado!");
	}else if(media >=7.5 && media <= 8.9){
		System.out.println("Você tirou nota B");
		System.out.println("Você está aprovado!");
	}else if(media >=9 && media <= 10){
		System.out.println("Você tirou nota A");
		System.out.println("Você está aprovado!");
	}
	
	
	

	}

}
