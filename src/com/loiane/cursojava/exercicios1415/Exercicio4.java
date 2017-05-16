package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira uma letra e verifique se é vogal ou consoante");
	String letra = scan.next();
	
	if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
		System.out.println("Isso é uma vogal");
	} else {
		System.out.println("Isso é uma consoante");
	}
		
	}

}
