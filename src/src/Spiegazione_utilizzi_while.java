package src;

import java.util.Scanner;

public class Spiegazione_utilizzi_while {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// controllo valori errati
		int voto;
		do {
			System.out.println("Inserisci voto");
			voto = in.nextInt();
			if(voto < 1 || voto > 10) {
				System.out.println("Input errato");
			}
		} while(voto < 1 || voto > 10);
		
		// ripetizione menu
		int scelta, a=4, b=3;
		
		do {
		System.out.println("1_ fai la somma");
		System.out.println("2_ fai la sottrazione");
		System.out.println("0_ ESCI");
		scelta = in.nextInt();
		
		switch(scelta) {
		case 1: System.out.println(a+b);
		break;
		case 2: 
			System.out.println(a-b);
			break;
		}
		}while(scelta != 0);
		
	}

}
