package src;

import java.util.Scanner;

public class Es_4 {
	/*Ho a disposizione 100 euro e voglio fare la spesa.
	Nel carrello, inserisco un prodotto con prezzo e quantità e stampo quanto ho speso per tale prodotto.
	Voglio inserire prodotti nel carrello finché l'utente non inserisce 0 come prezzo. 
	Devo controllare di non superare i 100€.
	Al termine del programma mostro il totale della spesa e il resto.
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double disponibilita = 100, prezzo, tot_prodotto, tot_spesa = 0, resto = 0;
		int quantita;

		System.out.println("La tua disponibilità è di: " + disponibilita + "\n");

		do {
			do {
				System.out.println("Inserire il prezzo del prodotto: \nInserire 0 per terminare.");
				prezzo = in.nextInt();
			}while(prezzo < 0);
			if(prezzo != 0) {
				do {
					System.out.println("Inserire la quantità del prodotto: ");
					quantita = in.nextInt();
				}while(quantita < 0);
	
				tot_prodotto = prezzo * quantita;
	
				if (tot_prodotto <= disponibilita) {
					tot_spesa += tot_prodotto;
				} else {
					System.out.println("Il prezzo totale supera il conto, non puoi acquistarlo.");
				}
			}

		} while (prezzo != 0);

		System.out.println("La spesa totale da pagare è di: " + tot_spesa + " €");
		resto = disponibilita - tot_spesa;
		System.out.println("Il resto è: " + resto + " €");

		in.close();
	}
}
