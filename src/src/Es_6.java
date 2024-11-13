package src;

import java.util.Scanner;

public class Es_6 {
	/*
	 * Scrivere un programma che permetta di calcolare la potenza dopo aver chiesto 
	 * all’utente la base e l’esponente.
	[Utilizzando il ciclo while]*/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int base, esponente, risultato = 1, i = 0 ;

		do{
			System.out.print("Inserisci la base: ");
			base = in.nextInt();
		}while(base < 0);

		do {
			System.out.print("Inserisci l'esponente: ");
			esponente = in.nextInt();
		}while(esponente < 0);
		
		// Calcolo della potenza usando il ciclo while
		// 3^4 = 3 * 3 * 3 * 3   -> moltiplico la base tante volte quanto l'esponente
		while (i < esponente) {
			risultato *= base;
			i++;
		}

		System.out.println("Il risultato di " + base + " elevato alla " + esponente + " è: " + risultato);

		in.close();
	}

}
