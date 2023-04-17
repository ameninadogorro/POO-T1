package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float pes, polegadas, jardas, milhas;
		System.out.println("Digite seu número em pés: ");
		pes = sc.nextFloat();
		polegadas = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1760;
		System.out.println("a)Em Polegadas:\n" + polegadas + "\nb)Em Jardas:\n" + jardas + "\nc)Em milhas:\n" + milhas);
				
	}

}
