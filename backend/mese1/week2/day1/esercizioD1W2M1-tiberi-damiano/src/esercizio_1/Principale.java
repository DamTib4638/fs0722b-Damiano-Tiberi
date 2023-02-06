package esercizio_1;

import java.util.Arrays;
import java.util.Scanner;

public class Principale {

	static Scanner input = new Scanner(System.in);
	static int valore = -1;
	static int posizione = -1;
	
	public static void main(String[] args) {
		
		int array[] = new int[5];
		array[0] = (int) ((Math.random() * 10) + 1);
		array[1] = (int) ((Math.random() * 10) + 1);
		array[2] = (int) ((Math.random() * 10) + 1);
		array[3] = (int) ((Math.random() * 10) + 1);
		array[4] = (int) ((Math.random() * 10) + 1);
		
		System.out.println("L'array di 5 elementi con valori casuali tra 1 e 10 è il seguente:");
		System.out.println(Arrays.toString(array));
		
		while (!(valore==0)) {
			try {
//				routineInserimento();
				System.out.println("Scegli la POSIZIONE dell'array per il quale vuoi, poi, cambiare il VALORE al suo interno");
				posizione = Integer.parseInt(input.nextLine().trim());
				System.out.println("Hai scelto di modificare il valore in posizione " + posizione + ".");
				System.out.println("Il valore che vuoi modificare è: " + array[--posizione] + ".");
				System.out.println("Quale valore vuoi inserire in questa posizione?");
				valore = Integer.parseInt(input.nextLine().trim());
				if(valore != 0) {
					array[posizione] = valore;
					System.out.println("Il nuovo array è così composto: " + Arrays.toString(array));
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Hai inserito una posizione dell'array che non esiste.");
				System.out.println("L'array ha 5 elementi, in posizioni da 1 a 5, estremi compresi");
//				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("Hai inserito un input che non è un numero o non può essere trasformato in un numero.");
//				e.printStackTrace();
			} 
		}
		System.out.println("Hai inserito il valore 0, che è il valore di uscita dal programma. Ciao!");
		System.out.println("L'array finale è così composto: " + Arrays.toString(array));
	}
	
	public static void routineInserimento() {
		
		System.out.println("Scegli la POSIZIONE dell'array per il quale vuoi, poi, cambiare il VALORE al suo interno");
		posizione = Integer.parseInt(input.nextLine().trim());
		System.out.println("Hai scelto di modificare il valore in posizione " + posizione + " dell'array.");
		System.out.println("Quale valore vuoi inserire in questa posizione?");
		valore = Integer.parseInt(input.nextLine().trim());
		
	}

}
