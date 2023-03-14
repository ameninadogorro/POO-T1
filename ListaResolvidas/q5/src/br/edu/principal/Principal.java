package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu salário: ");
		float salario = sc.nextFloat();
		System.out.println("Digite o percentual do aumento: ");
		int percentual = sc.nextInt();
		float aumento = salario * percentual/100;
		float novoSal = salario + aumento;
		System.out.println("O aumento foi de " + aumento + "\nO seu novo salário é " + novoSal);

	}

}
