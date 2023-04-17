package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n1 = sc.nextInt();
		System.out.println("Digite outro numero: ");
		int n2 = sc.nextInt();
		System.out.println("Digite um ultimo numero: ");
		int n3 = sc.nextInt();
		int mult = n1 * n2 * n3;
		System.out.println("Essa é a multiplicação desses 3 números: " + mult);
	}
}
