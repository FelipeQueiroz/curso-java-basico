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
	System.out.println("Sua m�dia foi de: " + media);
	
	if(media >=0 && media <= 3.9){
		System.out.println("Voc� tirou nota E");
		System.out.println("Voc� est� reprovado!");
	}else if(media >=4 && media <= 5.9){
		System.out.println("Voc� tirou nota D");
		System.out.println("Voc� est� reprovado!");
	}else if(media >=6 && media <= 7.4){
		System.out.println("Voc� tirou nota C");
		System.out.println("Voc� est� aprovado!");
	}else if(media >=7.5 && media <= 8.9){
		System.out.println("Voc� tirou nota B");
		System.out.println("Voc� est� aprovado!");
	}else if(media >=9 && media <= 10){
		System.out.println("Voc� tirou nota A");
		System.out.println("Voc� est� aprovado!");
	}
	
	
	

	}

}
