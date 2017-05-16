package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Entre com o n-énesimo termo de fibonacci:");
	int n = scan.nextInt();
	
	int primeiro = 1;
	int segundo = 1;
	int proximo;
	
	
	for(int i=3;i<=n;i++){
		proximo = primeiro + segundo;
		primeiro = segundo;
		segundo = proximo;
		
		System.out.println(proximo);
		
		
	}
	
	

	}

}
