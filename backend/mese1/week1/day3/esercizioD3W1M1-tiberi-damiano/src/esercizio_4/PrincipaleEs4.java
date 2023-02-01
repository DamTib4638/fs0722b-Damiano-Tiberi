package esercizio_4;

import java.util.Scanner;

public class PrincipaleEs4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire un numero intero positivo");
		contoAllaRovescia(Integer.parseInt(input.nextLine()));
	}
	public static void contoAllaRovescia(int valore) {
		if (valore > 0) {
			System.out.println("ATTENZIONE!!!");
			for (int i = valore; i>=0; i--) {
				try {
					Thread.sleep(1000);
					System.out.println("Mancano " + i + " secondi alla fine del processo");
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			System.out.println("SEI COLPEVOLE!!!");
		} else
			System.out.println("Numero inserito non valido. Devi inserire un numero intero positivo per far partire il conto alla rovescia");
	}
}
