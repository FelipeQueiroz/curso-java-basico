package com.loiane.cursojava.exercicios17;

import java.awt.Toolkit;
import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean sair = false;
		String continuarCompra;
		int qntdProdutos;
		double preco;
		double total;
		String output;
		
		//System.out.println("Lojas Tabajara");
		do{
			System.out.println("Deseja continuar a compra? S/N");
			continuarCompra = scan.next();
			
			if(continuarCompra.equalsIgnoreCase("s")){
				output = "Lojas Tabajara\n";
				System.out.println("Qual a quantidade de produtos?");
				qntdProdutos = scan.nextInt();
				total = 0;
				
				
				for(int i = 1; i<=qntdProdutos;i++){
					System.out.println("Insira o preço do produto (" + i + "): ");
					preco = scan.nextDouble();
					total += preco;
					output += ("Produto " + i + ": R$" + preco + "\n");	
				}
				output += ("Total: R$" + total + "\n");
				System.out.println("Entre com o valor pago:");
				double pago = scan.nextDouble();
				output += ("Dinheiro: R$" + pago + "\n");
				double troco = pago - total;
				output += ("Troco: R$" + troco + "\n");
				System.out.println(output);
			}else{
				sair = true;
			}
			
		}while(!sair);
		
		
	}

}
