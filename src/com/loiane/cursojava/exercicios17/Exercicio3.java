package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	



	
	
	boolean nomeValido = false;
	String nome;
	
	do {
		
		
		System.out.println("Digite o nome:");
		
		nome = scan.next();
		if (nome.length() >= 3){
			nomeValido = true;
			
		} else {
			System.out.println("O nome precisa de no min�mo 3 caracterias");
		}
		
	}while(!nomeValido);

	
	
	
	int idade;
	boolean idadeValida = false;
	
	do {
	System.out.println("Digite a idade:");
	idade = scan.nextInt();
		if (idade >= 0 && idade <= 150){
		idadeValida = true;
			
		} else {
			System.out.println("O idade precisa estar entre 0 e 150");
		}
		
	}while(!idadeValida);
	
	
	
	double salario;
	boolean salarioValido = false;
	
	do {
		System.out.println("Digite seu sal�rio:");
		salario = scan.nextDouble();;
		if (salario > 0){
		salarioValido = true;
			
		} else {
			System.out.println("O sal�rio precisa ser postivo");
		}
		
	}while(!salarioValido);
	
	String sexo;
	boolean sexoValido = false;
	
	do {
		System.out.println("Digite seu sexo:");
		sexo = scan.next();
		if (sexo.equalsIgnoreCase("f") ||
				sexo.equalsIgnoreCase("m")){
			
		salarioValido = true;
			
		} else {
			System.out.println("Sexo inv�lido, f = feminino / m = masculino");
		}
		
	}while(!salarioValido);
	
	
	String	 estado;
	boolean estadoValido = false;
	
	do {
		System.out.println("Digite seu estado civil: (s / c / v / d)");
		estado = scan.next();
		if (estado.equalsIgnoreCase("s") ||
				estado.equalsIgnoreCase("c") ||
				estado.equalsIgnoreCase("v") ||
				estado.equalsIgnoreCase("d")){
			
		estadoValido = true;
			
		} else {
			System.out.println("Estado civil n�o existente ");
		}
		
	}while(!estadoValido);
	
	
	
	System.out.println("Nome: " + nome);
	System.out.println("Idade: " + idade);
	System.out.println("Sexo: " + sexo);
	System.out.println("Salario: " + salario);
	System.out.println("Estado civil: " + estado);
	
	
	
	
	}

}
