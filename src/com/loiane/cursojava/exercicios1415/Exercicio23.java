package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira a quantidade de carne que deseja comprar:");
	double kilo = scan.nextDouble();
	System.out.println("Insirao tipo de carne: (File duplo / Alcatra / Picanha)");
	String tipo = scan.next();
	System.out.println("Você vai usar o cartão Tabajara?");
	String cartao = scan.next();
	
	double file = 0;
	double alcatra = 0;
	double picanha = 0;

	
	if (kilo <= 5){
	file = 4.90;
	alcatra = 5.90;
	picanha = 6.90;
	
	} else {
	file = 5.80;
	alcatra = 6.80;
	picanha = 7.80;	
	}
	double precoP = 0;
	if (tipo.equalsIgnoreCase("file duplo")){
	precoP = kilo * file;
	System.out.println("Carne: File Duplo");
	}
	if (tipo.equalsIgnoreCase("alcatra")){
	precoP = kilo * alcatra;
	System.out.println("Carne: Alcatra");
	}
	if (tipo.equalsIgnoreCase("picanha")){
	precoP = kilo * picanha;
	System.out.println("Carne: Picanha");
	}
	
	if (cartao.equalsIgnoreCase("sim")){
	double descontoCartao = (precoP / 100) * 5;
	double precoT = precoP - descontoCartao;
	System.out.println("Desconto: " + descontoCartao);
	System.out.println("Preço total: " + precoT);
	System.out.println("Você ganho 5% de desconto!");
	} else {
	double precoT = precoP;
	System.out.println("O total foi de: " + precoT);
	System.out.println("Cliente não utilizou o cartao do supermercado.");
	}

	
	
	
	
	
	
	
	

	}

}
