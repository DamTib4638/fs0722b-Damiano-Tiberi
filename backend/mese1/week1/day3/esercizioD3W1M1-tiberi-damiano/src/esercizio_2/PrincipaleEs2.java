package esercizio_2;

import java.util.Scanner;

public class PrincipaleEs2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire un numero intero, possibilmente compreso tra 0 e 3");
		stampaInLettere(Integer.parseInt(input.nextLine()));
	}
	public static void stampaInLettere(int ingresso) {
		switch (ingresso) {
		case 0: {
			System.out.println("Il numero " + ingresso + " in tedesco si dice NULL");
			break;
		}
		case 1: {
			System.out.println("Il numero " + ingresso + " in tedesco si dice EINS");
			break;
		}
		case 2: {
			System.out.println("Il numero " + ingresso + " in tedesco si dice ZWEI");
			break;
		}
		case 3: {
			System.out.println("Il numero " + ingresso + " in tedesco si dice DREI");
			break;
		}
		default:
//			throw new IllegalArgumentException("Unexpected value: " + ingresso);
			System.out.println("Errore: il numero " + ingresso + " non è compreso tra 0 e 3!!!");
		}
	}
}
