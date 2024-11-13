package src;

import java.util.Scanner;

public class Esercizio_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int posti=120, scelta, numposti;
		do {
			System.out.println("1 per visualizzare i posti liberi");
			System.out.println("2 per prenotare i biglietti");
			System.out.println("3 per annullare i posti scelti");
			System.out.println("0 esci");
			scelta = in.nextInt();
			switch(scelta) {
			case 1:
				System.out.println("i posti liberi sono: " + posti);
				break;
			case 2:
				System.out.println("inserisci quanti posti vuoi prenotare");
				numposti = in.nextInt();
				if(numposti <= posti);
				posti = posti - numposti;
				
			}
			
			
			
		}while(scelta != 0);
		

	}

}
