package com.exemplo.construargumentos;

public class Carro {
	//criar os atributos
	private String modelo;
	private int ano;
	
	//metodo construtor
	public Carro(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}
	//criar o metodo para exibir os valores
	public void mostrar() {
		System.out.println("O modelo do carro � " + modelo + "e o ano � " + ano + ".");
	}
}
