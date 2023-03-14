package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o custo do espetáculo:");
		float custo = sc.nextFloat();
		System.out.println("Digite o preço do convite:");
		float convite = sc.nextFloat();
		float quantidade = custo/ convite;
		System.out.println("O quantidade de convites que devem ser vendidos para cobrir o custo será " + quantidade);

	}

}
