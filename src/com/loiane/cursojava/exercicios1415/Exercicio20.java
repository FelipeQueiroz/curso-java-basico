package com.loiane.cursojava.exercicios1415;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Telefonou para a vit�ma?");
	String resp1 = scan.next();
	System.out.println("Esteve no local do crime?");
	String resp2 = scan.next();
	System.out.println("Mora perto da v�tima?");
	String resp3 = scan.next();
	System.out.println("Devia para a v�tima?");
	String resp4 = scan.next();
	System.out.println("J� trabalhou com a vit�ma?");
	String resp5 = scan.next();
	
	int cont = 0;
	
	if(resp1.equalsIgnoreCase("Sim")){
		cont++;
	} 
	if(resp2.equalsIgnoreCase("Sim")){
		cont++;
	} 
	if(resp3.equalsIgnoreCase("Sim")){
		cont++;
	} 
	if(resp4.equalsIgnoreCase("Sim")){
		cont++;
	}
	if(resp5.equalsIgnoreCase("Sim")){
		cont++;
	} 
	
	if (cont == 2){
		System.out.println("Suspeita");
	} else if(cont >= 3 && cont <= 4){
		System.out.println("Cumpl�ce");
	} else if (cont == 5){
		System.out.println("Assasino");
	} else{
		System.out.println("Inocente");
	}
	

	}

}
