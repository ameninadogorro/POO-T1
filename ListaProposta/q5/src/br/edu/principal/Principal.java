package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float p_produto, desconto;
		int np_produto;
		System.out.println("Digite o Preço do Produto: ");
		p_produto = sc.nextFloat();
		desconto = (p_produto * 10)/100;
		np_produto = (int) (p_produto - desconto);
		System.out.println("-----------------------------");
		System.out.println("-Preço Original: \n R$" + p_produto + "\n-Com o desconto de 10%: \n R$" + np_produto);
	}

}
