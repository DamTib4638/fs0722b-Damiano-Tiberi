package esercizio_3;

import java.util.Scanner;

public class PrincipaleEs3 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		splittareStringa();
	}

	public static void splittareStringa() {
		System.out.println("Inserire una stringa non vuota. Se vuoi uscire, inserisci :q");
		String str = input.nextLine().trim();
		while (!str.equalsIgnoreCase(":q")) {
			System.out.println(String.join(",", str.split("")));
			System.out.println("Inserire una stringa non vuota. Se vuoi uscire, inserisci :q");
			str = input.nextLine().trim();
		}
		System.out.println("Hai inserito la stringa di uscita");
	}
}
