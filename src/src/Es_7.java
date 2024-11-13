package src;

import java.util.Scanner;

public class Es_7 {

	final static int POSTI_MAX = 120;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int posti_liberi = POSTI_MAX, scelta, numposti;
		do {
			System.out.println("1 per visualizzare i posti liberi");
			System.out.println("2 per prenotare i biglietti");
			System.out.println("3 per annullare i posti scelti");
			System.out.println("0 esci");
			scelta = in.nextInt();

			switch(scelta) {
			case 1:
				System.out.println("I posti liberi sono: " + posti_liberi);
				break;
			case 2:
				System.out.println("Inserisci quanti posti vuoi prenotare: ");
				numposti = in.nextInt();
				
				if(numposti <= posti_liberi) {
					posti_liberi = posti_liberi - numposti;
				}
				else {
					System.out.println("Posti non disponibili");
				}
				break;
			case 3:
				System.out.println("Inserisci quanti posti vuoi annullare: ");
				numposti = in.nextInt();
				
				if((posti_liberi + numposti) <= POSTI_MAX) {
					posti_liberi += numposti;
				}
				else {
					System.out.println("I posti superano il limite");
				}
				break;
			case 0:
				System.out.println("Uscita...");
				break;
			default:
				System.out.println("Scelta errata");
				break;

			}

		}while(scelta != 0);

		in.close();
	}
}
