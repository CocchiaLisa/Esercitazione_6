package src;
import java.util.Scanner;
public class Es_2 {
	/*Scrivere un un programma che permetta di chiedere all’utente 
	 * due numeri fino a quando la loro somma non supera 50.
	 */
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		// dichiaro le variabili
		int a, b, somma = 0;
		
		while(somma < 50) {
			System.out.println("Inserisci il primo numero: ");
			a = in.nextInt();
			
			System.out.println("Inserisci il secondo numero: ");
			b = in.nextInt();
			
			somma = a + b;
			System.out.println("La soma è: " + somma);
		}
		
		
		in.close();
	}
}
