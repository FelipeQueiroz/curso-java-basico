package com.loiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		//Convenção Java
		int idade = 20;
		String nome = "Felipe";
		String nomeDoMeuCachorro = "Rex";
		String ano2014 = "2014";
		
		//aceito,mais não é utilizado
		int _idade;
		int $idade;
		
		//Não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		//má prática
		int a = 10;
		String b = "Loiane";

	}

}
