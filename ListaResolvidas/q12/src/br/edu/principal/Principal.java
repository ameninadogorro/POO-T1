package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1,num2,r1,r2;
		int x = 0;
		while(x == 0) {
			System.out.print("Digite um número positivo: ");
			num1 = sc.nextDouble();
			System.out.print("Digite outro número positivo: ");
			num2 = sc.nextDouble();
			if(num1 > 0 && num2 > 0) {
				r1 = Math.pow(num1, num2);
				r2 = Math.pow(num2, num1);
				System.out.format("\nO número %.0f elevado a %.0f é: %.0f.", num1, num2, r1);
				System.out.format("\nO número %.0f  elevado a  %.0f  é: %.0f. ", num2, num1, r2);
				System.out.print("\n-------------------------------------------------------------------------------------------------------");
				x=1;
			}
			else if(num1 < 0) {
				System.out.println("Erro, troque o primeiro número, ele tem que ser positivo.");
				System.out.println("-----------------------------------------------------------------------------------");
				
			}
			else {
				System.out.println("Erro, troque o segundo número, ele tem que ser positivo");
				System.out.println("--------------------------------------------------------------");
			}
			
		}
	}

}
