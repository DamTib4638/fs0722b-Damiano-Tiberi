package esercizio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Principale {
	
	static Scanner input = new Scanner(System.in);
	static int numeroScelto = 0;

	public static void main(String[] args) {
		
		scegliNumero();
		List<Integer> listaParte1 = generaLista(numeroScelto);
		System.out.println(listaParte1);
		List<Integer> listaParteDoppia = manipolaLista(listaParte1);
		System.out.println(listaParteDoppia);
		stampaListaPariDispari(listaParteDoppia, false);

	}
	
	public static void scegliNumero() {
		try {
			System.out.println("Inserisci un numero intero positivo");
			numeroScelto = Integer.parseInt(input.nextLine().trim());
//			if (numeroScelto > 0) {
//				generaLista(numeroScelto);
//			} else {
//				System.out.println("Dovevi inserire un numero intero positivo. MI HAI DELUSO MOLTO! ADDIO!");
//			}
		} catch (NumberFormatException e) {
			System.out.println("ERRORE INCREDIBILE! .:. Non hai inserito un numero. Numero impostato a 5.");
			numeroScelto = 5;
		}
	}
	
	public static List<Integer> generaLista(int n) {
		List<Integer> listaInteri = new ArrayList<Integer>();
		Random rand = new Random();
		for (int i=0; i<n; i++) {
			listaInteri.add(rand.nextInt(101));
		}
		return listaInteri;
	}
	
	public static List<Integer> manipolaLista(List<Integer> lista) {
		List<Integer> listaDoppia = new ArrayList<Integer>();
		for (int i=0; i<lista.size(); i++) {
			listaDoppia.add(lista.get(i));
		}
		for (int i=lista.size()-1; i>=0; i--) {
			listaDoppia.add(lista.get(i));
		}
		return listaDoppia;
	}
	
	public static void stampaListaPariDispari(List<Integer> lista, boolean bool) {
		List<Integer> listaFiltrata = new ArrayList<Integer>();
		if (bool) {
			for (int i=0; i<lista.size(); i++) {
				if (i%2==0) {
					listaFiltrata.add(lista.get(i));
				}
			}
		} else {
			for (int i=0; i<lista.size(); i++) {
				if (i%2==1) {
					listaFiltrata.add(lista.get(i));
				}
			}
		}
		System.out.println(listaFiltrata);
	}

}
