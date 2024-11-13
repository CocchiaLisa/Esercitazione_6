package src;

import java.util.Scanner;

public class Es_5 {
	/*Inserire un certo numero di voti in ingresso, stampare il 
	 * minore dei voti inseriti e la loro media.
	 * Il programma termina se viene inserito un voto pari a zero.
	*/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double voto, media, somma = 0, min = 0, conta = 0;
		
		do {
			do {
				System.out.println("Inserisci voto: ");
				voto = in.nextDouble();
			}while(voto < 0 || voto > 10);
			
			if(voto != 0) {
				conta++;
				somma += voto;
				
				if(conta == 1 || voto < min) {
					min = voto;
					System.out.println(min);
				}
			}
			
		}while(voto != 0);
		
		media = somma / conta;
		
		System.out.printf("La media dei voti è: %.2f \n", media);
		System.out.printf("Il voto minimo è: %.2f", min);
		
		in.close();
	}

}
