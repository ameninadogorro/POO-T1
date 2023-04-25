package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float sal_fixo, vendas, comissao;
		int sal_final;
		System.out.println("Digite seu Salário Fixo: ");
		sal_fixo = sc.nextFloat();
		System.out.println("Digite o Valor das Vendas: ");
		vendas = sc.nextFloat();
		comissao = (vendas * 4) / 100;
		sal_final = (int) (comissao + sal_fixo);
		System.out.println("----------------------------------");
		System.out.println("Comissão dada: R$" + comissao + "\nSalário Final com a Comissão: R$" + sal_final);
	}
}
