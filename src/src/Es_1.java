package src;
import java.util.Scanner;
import java.lang.Math;
public class es1 {
	/*
	 * 	Calcolare il risultato dell’equazione di secondo grado leggendo da tastiera i coefficienti
		dell’equazione e stampando il valore di x1 e x2
		Calcolare e valutare il delta
		● Se l'equazione di 2° ha due soluzioni distinte e  nell'insieme dei numeri reali.
		● Se l'equazione di 2° ha una sola soluzione  nell'insieme dei numeri reali o per meglio dire
		due soluzioni reali coincidenti .
		● Se l'equazione di 2° non ha soluzioni nell'insieme dei numeri reali. */
	public static void main(String[] args) {
		double a, b, c;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci il coefficiente a: ");
		do {
			a = scanner.nextDouble();
		}while(a == 0);
		
		System.out.println("Inserisci il coefficiente b: ");
		b = scanner.nextDouble();
		System.out.println("Inserisci il coefficiente c: ");
		c = scanner.nextDouble();
		
		double delta = (b*b)-4*(a*c);
	
		if (delta == 0) {
			System.out.printf("Il valore di x è %.2f",-b/2*a);
		}
		else if (delta > 0 ){
			System.out.printf("Il valore di x1 è %.2f\nIl valore di x2 è %.2f", (-b+Math.sqrt(delta))/2*a, (-b-Math.sqrt(delta))/2*a );
		}
		else {
			System.out.println("Il delta è negativo, l'equazione è impossibile");
		}
		scanner.close();
	}
}
