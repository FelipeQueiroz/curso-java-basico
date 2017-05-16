package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o número que deseja fatorar: ");
		int num = scan.nextInt();
		int total = 1;
		System.out.println("Fatorial de " + num + ":");
		System.out.print(num + "!" + " =");
		for(int i = num; i> 1;i--){
			total *= i;
			System.out.print(i + " . ");
		}
		
		System.out.print(1 + " = " + total);

	}

}
