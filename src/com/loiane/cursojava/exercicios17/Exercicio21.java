package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira a quantidade de turmas: ");
	int qntTurmas = scan.nextInt();
	int qntAlunos = 0;
	int total = 0;
	boolean verificar = false;
	for(int i = 1; i <= qntTurmas; i++){
	
	do {
		System.out.println("Insira a quantidade de alunos na turma "+ "'" + i + "'" + " :" );
		qntAlunos = scan.nextInt();
			
			
			verificar = false;
			if (qntAlunos < 40){
				verificar = true;
				
			
			} else{
				System.out.println("O máximo são 40 alunos. Digite novamente.");
				
			}
		
	}while(!verificar);
	
	
	total+= qntAlunos;
	
	}
	
	double media = total / qntTurmas;
	System.out.println("A média é de " + media + " por turma.");
	
	
	}

}
