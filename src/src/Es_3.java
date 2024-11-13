package src;

import java.util.Scanner;

public class Es_3 {
	/* Scrivere un programma che permetta di calcolare il valore 
	 * massimo e la somma di 5 numeri positivi chiesti all’utente */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero, somma = 0, max = 0;

		for(int i = 0; i < 5; i++) {
			do { // controllo che il numero inserito sia positivo
				System.out.println("inserisci numero");
				numero = in.nextInt();
			}while(numero <= 0);

			somma += numero;

			if(i == 0 || numero > max) {
				max = numero;
			}

		}
		System.out.println("la somma dei numeri è:" + somma);
		System.out.println("il massimo dei numeri è:" + max);

		in.close();
	}
}
