package esercizio_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principale {
	
	static Scanner input = new Scanner(System.in);
	static int numeroScelto = 0;
	static boolean controlloNumero = true;
	static Set<String> setStringhe = new HashSet<String>();
	static Set<String> setStringheRipetute = new HashSet<String>();

	public static void main(String[] args) {
		while (controlloNumero) {
			scegliNumero();
		}
	}
	
	public static void scegliNumero() {
		try {
			System.out.println("Inserisci un numero intero positivo");
			numeroScelto = Integer.parseInt(input.nextLine().trim());
			if (numeroScelto > 0) {
				controlloNumero = false;
				generaListe();
			} else {
				controlloNumero = false;
				System.out.println("Dovevi inserire un numero intero positivo. MI HAI DELUSO MOLTO! ADDIO!");
			}
		} catch (NumberFormatException e) {
			System.out.println("ERRORE INCREDIBILE! .:. Non hai inserito un numero.");
		}
//		while (!(numeroScelto > 0)) {
//			System.out.println("Inserisci un numero intero positivo");
//			numeroScelto = Integer.parseInt(input.nextLine().trim());
//			if (numeroScelto > 0) {
//				generaListe();
//			} else {
//				System.out.println("Dovevi inserire un numero intero positivo. MI HAI DELUSO MOLTO! ADDIO!");
//			}
//		}
	}
	
	public static void generaListe() {
		for (int i=1; i<=numeroScelto; i++) {
			System.out.println("Inserisci la " + i + "° parola delle " + numeroScelto + " parole da inserire");
			String parola = input.nextLine().trim();
			if (setStringhe.contains(parola)) {
				setStringheRipetute.add(parola);
			} else {
				setStringhe.add(parola);
			}
		}
		System.out.println("L' elenco delle parole distinte è composto da " + setStringhe.size() + " parole. Esse sono:");
		System.out.println(setStringhe);
		System.out.println("L' elenco delle parole ripetute è composto da " + setStringheRipetute.size() + " parole. Esse sono:");
		System.out.println(setStringheRipetute);
	}

}
