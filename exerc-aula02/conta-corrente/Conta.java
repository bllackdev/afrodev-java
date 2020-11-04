//package org.basic.java;

public class Conta {
	public String nome;
	private float saldo;
	protected int conta;
	int agencia;
	private String senha;
	
	public static void main(String[] args) {
		Conta conta01 = new Conta ();
		conta01.nome = "Raphael";
		conta01.senha = "123456";
		System.out.println(conta01.nome);
		System.out.println(conta01.senha);
	}
}