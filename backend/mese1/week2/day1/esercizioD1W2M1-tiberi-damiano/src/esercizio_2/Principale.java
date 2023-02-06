package esercizio_2;

import java.util.Scanner;

public class Principale {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int km = 0;
		int litri = 0;
		double consumoMedio = 0;
		
		System.out.println("Inserisci quanti KM hai percorso: ");
		km = Integer.parseInt(input.nextLine().trim());
		System.out.println("Inserisci quanti LITRI hai consumato: ");
		litri = Integer.parseInt(input.nextLine().trim());
		try {
			consumoMedio = km/litri;
			System.out.println("La tua auto percorre: " + consumoMedio + " KM per LITRO di carburante consumato.");
		} catch (ArithmeticException e) {
			System.out.println("Hai provato a dividere per 0! OPERAZIONE IMPOSSIBILE!!!");
//			e.printStackTrace();
		}
		
	}

}
