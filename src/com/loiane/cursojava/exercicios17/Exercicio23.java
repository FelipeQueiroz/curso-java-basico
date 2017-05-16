package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	boolean invalido = false;
	int cont = 1;
	System.out.println("Loja Quase Dois - Tabela de preços");
	for( cont = 1; cont<= 50; cont++){
		
			System.out.println(cont + "-> R$" + (cont * 1.99)  );
		
	}
	
	
	}

}
