package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
			System.out.println("Digite o peso do saco: ");
			double peso_saco = sc.nextDouble();
			System.out.println("Digite quantas gramas o gato 1 come: ");
			double racao_gato1 = sc.nextDouble();
			System.out.println("Digite quantas gramas o gato 2 come: ");
			double racao_gato2 = sc.nextDouble();
			double div1 = racao_gato1 / 1000;
			double div2 = racao_gato2 / 1000;
			double total_final = peso_saco - 5 * (racao_gato1 + racao_gato2);
			System.out.println("Isso foi o que restou: " + total_final);
		
	}
}
