	package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	boolean diferenca = false;
	
	do {
	System.out.println("Insira o nome de usuário:");
	String nome = scan.next();
	System.out.println("Insira a senha:");
	String senha = scan.next();
	if (nome == senha){
		diferenca = true;
	} else {
		diferenca = false;
		System.out.println("Nome igual a senha!");
	}
	} while(diferenca == false);
		
	

	}

}
