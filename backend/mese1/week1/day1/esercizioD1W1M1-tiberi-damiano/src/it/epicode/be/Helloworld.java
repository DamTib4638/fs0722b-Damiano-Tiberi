package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;

public class Helloworld {

	public static void main (String[] args) {
	
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		Helloworld esercizio2 = new Helloworld();
		int risultato2A = esercizio2.moltiplica(3, 4);
		System.out.println("ESERCIZIO 2 A:");
		System.out.println("Il risultato della moltiplicazione del secondo esercizio è: " + risultato2A);
		String risultato2B = esercizio2.concatena("Questo è l'esercizio ", 2);
		System.out.println("ESERCIZIO 2 B:");
		System.out.println("Risultato esercizio 2 B: " + risultato2B);
		String array[] = {"Ciao", "mi", "Damiano", "Come", "stai?"};
		String completaArray = "chiamo ";
		array = esercizio2.aggiungiInArray(array, completaArray);
		System.out.println("Esercizio 2 C:");
		System.out.print("Risultato esercizio 2 C: ");
		System.out.println(Arrays.toString(array));
		
		System.out.println("ESERCIZIO 3. INSERIRE 3 STRINGHE.");
		Helloworld esercizio3 = new Helloworld();
		Scanner input = new Scanner(System.in);
		System.out.print("Stringa 1: ");
		String stringaUno = input.nextLine();
		System.out.print("Stringa 2: ");
		String stringaDue = input.nextLine();
		System.out.print("Stringa 3: ");
		String stringaTre = input.nextLine();
		String fraseInOrdine = esercizio3.concatenaTre(stringaUno, stringaDue, stringaTre);
		String fraseInversa = esercizio3.concatenaTreInverso(stringaUno, stringaDue, stringaTre);
		System.out.println("In ordine: " + fraseInOrdine);
		System.out.println("Ordine inverso: " + fraseInversa);
		
		System.out.println("ESERCIZIO 4. INSERIRE BASE E ALTEZZA RETTANGOLO.");
		Helloworld esercizio4 = new Helloworld();
		System.out.print("Base Rettangolo: ");
		float lato1 = input.nextFloat();
		System.out.print("Altezza Rettangolo: ");
		float lato2 = input.nextFloat();
		float perimetro = esercizio4.calcolaPerimetroRettangolo(lato1, lato2);
		System.out.println("Il perimetro del rettangolo è: " + perimetro);
		System.out.println("ESERCIZIO 4. INSERIRE NUMERO INTERO.");
		System.out.print("Numero: ");
		int numero = (int) input.nextInt();
		int pari = esercizio4.verificaPari(numero);
		if (pari == 0) {
			System.out.println("Il numero inserito è pari");
		} else {
			System.out.println("Il numero inserito è dispari");
		}
		System.out.println("ESERCIZIO 4. INSERIRE 3 LATI DEL TRIANGOLO.");
		System.out.print("Lato1: ");
		lato1 = input.nextFloat();
		System.out.print("Lato2: ");
		lato2 = input.nextFloat();
		System.out.print("Lato3: ");
		float lato3 = input.nextFloat();
		double area = esercizio4.calcolaAreaTriangolo(lato1, lato2, lato3);
		System.out.println("L'area del triangolo è: " + area);
	}
	
	public int moltiplica(int p, int q) {
		return p*q;
	}
	
	public String concatena(String frase, int numero) {
//		String numeroStringato = String.valueOf(numero);
//		return frase.concat(numeroStringato);
		return frase + numero;
	}
	
	public String[] aggiungiInArray(String[] array, String parola) {
		String arrayCompleto[] = new String[6];
		for (int i=0; i<6; i++) {
			if (i<2) {
				arrayCompleto[i] = array[i];
			} else if (i==2) {
				arrayCompleto[i] = parola;
			} else {
				arrayCompleto[i] = array[i-1];
			}
		}
		return arrayCompleto;
	}
	
	public String concatenaTre(String uno, String due, String tre) {
		return uno + " " + due + " " + tre;
	}
	
	public String concatenaTreInverso(String uno, String due, String tre) {
		return tre + " " + due + " " + uno;
	}
	
	public float calcolaPerimetroRettangolo(float base, float altezza) {
		return base*2 + altezza*2;
	}
	
	public int verificaPari(int n) {
		if (n%2 == 0) {
			return 0;
		}
		return 1;
	}
	
	public double calcolaAreaTriangolo(float lato1, float lato2, float lato3) {
		float semiPerimetro = (lato1+lato2+lato3)/2;
		float areaQuadra = semiPerimetro * (semiPerimetro-lato1) * (semiPerimetro-lato2) * (semiPerimetro-lato3);
		double area = Math.sqrt(areaQuadra);
		return area;
	}

}
