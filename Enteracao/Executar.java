package Enteracao;

import java.util.Locale;
import java.util.Scanner;

import Calc.Benk;

public class Executar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Benk[] vect = new Benk[10];
		System.out.println("digite quantos quartos serão alugados:");
		int quarto = sc.nextInt();

		for (int i = 1; i <= quarto; i++) {
			sc.nextLine();
			System.out.printf("%s° alugel\n", i + ":");
			System.out.println("digite o nome:");
			String nome = sc.nextLine();
			System.out.println("digite o E-MAIL:");
			String email = sc.nextLine();
			System.out.println("digite o numero do quarto");
			int numerodoquarto = sc.nextInt();

			vect[numerodoquarto] = new Benk(nome, email);
		}
		System.out.println("");
		System.out.println("chequim");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + "; " + vect[i]);
			}

		}
		sc.close();

	}

}
