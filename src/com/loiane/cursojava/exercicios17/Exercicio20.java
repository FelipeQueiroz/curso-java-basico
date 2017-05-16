package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Entre com a quantidade de pessoas");
	int numPessoas = scan.nextInt();
	
	int soma = 0;
	double media;
	int idade;
	
	for(int i=0;i<numPessoas;i++){
		System.out.println("Entre com a idade da pessoas " + (i+1));
		idade = scan.nextInt();
		
		soma += idade;
		
	}
	
	media = soma / numPessoas;
	System.out.println("Media: " + media);
	if(media > 0 && media <= 25){
		System.out.println("Turma Jovem");
	} if (media >= 26 && media <= 60){
		System.out.println("Turma Adulta");
	} else if(media > 60){
		System.out.println("Turma idosa");
	}
	
	

	}

}
