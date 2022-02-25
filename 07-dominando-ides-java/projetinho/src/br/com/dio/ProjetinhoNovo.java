package br.com.dio;

import br.com.dio.model.Gato;

public class ProjetinhoNovo {

	public static void main(String[] args) {

		Gato gato = new Gato("oi", "ola", 5);
		Livros livros = new Livros();
		String oi = "olá";
		
		System.out.println(gato);
		System.out.println(livros);
//		int a = 2;
//		int b = 3;
//		System.out.println("Hello World " + (a+b));

	}

}

class Livros {
	private String nome = "Call me by your name";
	private String npag = "eita";
}

