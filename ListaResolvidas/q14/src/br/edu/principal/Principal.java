package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner nasc = new Scanner(System.in);
		System.out.println("Digite seu ano de nascimento: ");
		int datenasc = nasc.nextInt();
		Scanner anoatual = new Scanner(System.in);
		System.out.println("Digite o ano atual: ");
		int atual = anoatual.nextInt();
		int idade = atual - datenasc;
		int ano05 = 2005 - datenasc;
		System.out.println("Sua idade é " + idade + "\n" + "Sua idade em 2005 é " + ano05  );

	}

}
