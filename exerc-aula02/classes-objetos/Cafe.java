//package org.basic.java;

public class Cafe {
	String nome;
	float acidez;
	float amargor;
	int torra;
	
	public static void main(String[] args) {
		Cafe cafeConilon = new Cafe();
		cafeConilon = new Cafe();
		System.out.println(cafeConilon.nome);

		Cafe cafeArabica = new Cafe();
		cafeArabica.nome = "arabica";
		System.out.println(cafeArabica.nome);
	}
}