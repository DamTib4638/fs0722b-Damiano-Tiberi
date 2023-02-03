package prog_sett;

import java.util.Scanner;

public class Principale {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		ElementoMultimediale listaElementi[] = new ElementoMultimediale[5];
		int insElemento = 0;
		System.out.println("Il lettore musicale è vuoto. Devi inserire 5 Elementi Multimediali.");
		for (int i=0; i<listaElementi.length; i++) {
			System.out.println("-------------------------------------------------------------------");
			System.out.println("LEGGENDA INSERIMENTO:");
			System.out.println("Premere 1 per inserire un Elemento Multimediale di tipo VIDEO");
			System.out.println("Premere 2 per inserire un Elemento Multimediale di tipo AUDIO");
			System.out.println("Premere 3 per inserire un Elemento Multimediale di tipo IMMAGINE");
			System.out.println("-------------------------------------------------------------------");
			insElemento = Integer.parseInt(input.nextLine().trim());
			if(insElemento == 1) {
				System.out.println("Hai scelto di inserire un VIDEO. Inserisci: ");
				System.out.println("TITOLO (in formato stringa)");
				String titolo = input.nextLine().trim();
				System.out.println("DURATA (valore intero positivo)");
				int durata = Integer.parseInt(input.nextLine().trim());
				System.out.println("VOLUME (valore intero positivo)");
				int volume = Integer.parseInt(input.nextLine().trim());
				System.out.println("LUMINOSITà (valore intero positivo)");
				int luminosita = Integer.parseInt(input.nextLine().trim());
				listaElementi[i] = new Video(titolo, durata, volume, luminosita);
			} else if (insElemento == 2) {
				System.out.println("Hai scelto di inserire un AUDIO. Inserisci: ");
				System.out.println("TITOLO (in formato stringa)");
				String titolo = input.nextLine().trim();
				System.out.println("DURATA (valore intero positivo)");
				int durata = Integer.parseInt(input.nextLine().trim());
				System.out.println("VOLUME (valore intero positivo)");
				int volume = Integer.parseInt(input.nextLine().trim());
				listaElementi[i] = new Audio(titolo, durata, volume);
			} else if (insElemento == 3) {
				System.out.println("Hai scelto di inserire una IMMAGINE. Inserisci: ");
				System.out.println("TITOLO (in formato stringa)");
				String titolo = input.nextLine().trim();
				System.out.println("LUMINOSITà (valore intero positivo)");
				int luminosita = Integer.parseInt(input.nextLine().trim());
				listaElementi[i] = new Immagine(titolo, luminosita);
			} else {
				System.out.println("Inserito valore non valido. Guarda la LEGGENDA in alto.");
				i--;
			}
		}
		System.out.println("Player Multimediale COMPLETATO. Ora puoi consultarlo, attraverso la seguente leggenda.");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("LEGGENDA CONSULTAZIONE");
		System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
		System.out.println("Premere 0 chiudere il Player Multimediale.");
		System.out.println("-------------------------------------------------------------------");
		int sceltaElemento = Integer.parseInt(input.nextLine().trim());
		while (!(sceltaElemento == 0)) {
			switch(sceltaElemento) {
				case 0: {
					break;
				}
				case 1: {
					String classe = listaElementi[--sceltaElemento].getClass().toString();
					if (classe.contains("Video")) {
						Video v = (Video) listaElementi[sceltaElemento];
						v.play();
						System.out.println("-------------------------------------------------------------------");
						System.out.println("LEGGENDA CONSULTAZIONE");
						System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
						System.out.println("Premere 0 chiudere il Player Multimediale.");
						System.out.println("-------------------------------------------------------------------");
						sceltaElemento = Integer.parseInt(input.nextLine().trim());
					}
					if (classe.contains("Audio")) {
						Audio a = (Audio) listaElementi[sceltaElemento];
						a.play();
						System.out.println("-------------------------------------------------------------------");
						System.out.println("LEGGENDA CONSULTAZIONE");
						System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
						System.out.println("Premere 0 chiudere il Player Multimediale.");
						System.out.println("-------------------------------------------------------------------");
						sceltaElemento = Integer.parseInt(input.nextLine().trim());
					}
					if (classe.contains("Immagine")) {
						Immagine i = (Immagine) listaElementi[sceltaElemento];
						i.show();
						System.out.println("-------------------------------------------------------------------");
						System.out.println("LEGGENDA CONSULTAZIONE");
						System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
						System.out.println("Premere 0 chiudere il Player Multimediale.");
						System.out.println("-------------------------------------------------------------------");
						sceltaElemento = Integer.parseInt(input.nextLine().trim());
					}
					break;
				}
				case 2: {
					String classe = listaElementi[--sceltaElemento].getClass().toString();
					if (classe.contains("Video")) {
						Video v = (Video) listaElementi[sceltaElemento];
						v.play();
						System.out.println("-------------------------------------------------------------------");
						System.out.println("LEGGENDA CONSULTAZIONE");
						System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
						System.out.println("Premere 0 chiudere il Player Multimediale.");
						System.out.println("-------------------------------------------------------------------");
						sceltaElemento = Integer.parseInt(input.nextLine().trim());
					}
					if (classe.contains("Audio")) {
						Audio a = (Audio) listaElementi[sceltaElemento];
						a.play();
						System.out.println("-------------------------------------------------------------------");
						System.out.println("LEGGENDA CONSULTAZIONE");
						System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
						System.out.println("Premere 0 chiudere il Player Multimediale.");
						System.out.println("-------------------------------------------------------------------");
						sceltaElemento = Integer.parseInt(input.nextLine().trim());
					}
					if (classe.contains("Immagine")) {
						Immagine i = (Immagine) listaElementi[sceltaElemento];
						i.show();
						System.out.println("-------------------------------------------------------------------");
						System.out.println("LEGGENDA CONSULTAZIONE");
						System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
						System.out.println("Premere 0 chiudere il Player Multimediale.");
						System.out.println("-------------------------------------------------------------------");
						sceltaElemento = Integer.parseInt(input.nextLine().trim());
					}
					break;
				}
				case 3: {
					String classe = listaElementi[--sceltaElemento].getClass().toString();
					if (classe.contains("Video")) {
						Video v = (Video) listaElementi[sceltaElemento];
						v.play();
						System.out.println("-------------------------------------------------------------------");
						System.out.println("LEGGENDA CONSULTAZIONE");
						System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
						System.out.println("Premere 0 chiudere il Player Multimediale.");
						System.out.println("-------------------------------------------------------------------");
						sceltaElemento = Integer.parseInt(input.nextLine().trim());
					}
					if (classe.contains("Audio")) {
						Audio a = (Audio) listaElementi[sceltaElemento];
						a.play();
						System.out.println("-------------------------------------------------------------------");
						System.out.println("LEGGENDA CONSULTAZIONE");
						System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
						System.out.println("Premere 0 chiudere il Player Multimediale.");
						System.out.println("-------------------------------------------------------------------");
						sceltaElemento = Integer.parseInt(input.nextLine().trim());
					}
					if (classe.contains("Immagine")) {
						Immagine i = (Immagine) listaElementi[sceltaElemento];
						i.show();
						System.out.println("-------------------------------------------------------------------");
						System.out.println("LEGGENDA CONSULTAZIONE");
						System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
						System.out.println("Premere 0 chiudere il Player Multimediale.");
						System.out.println("-------------------------------------------------------------------");
						sceltaElemento = Integer.parseInt(input.nextLine().trim());
					}
					break;
				}
				case 4: {
					String classe = listaElementi[--sceltaElemento].getClass().toString();
					if (classe.contains("Video")) {
						Video v = (Video) listaElementi[sceltaElemento];
						v.play();
						System.out.println("-------------------------------------------------------------------");
						System.out.println("LEGGENDA CONSULTAZIONE");
						System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
						System.out.println("Premere 0 chiudere il Player Multimediale.");
						System.out.println("-------------------------------------------------------------------");
						sceltaElemento = Integer.parseInt(input.nextLine().trim());
					}
					if (classe.contains("Audio")) {
						Audio a = (Audio) listaElementi[sceltaElemento];
						a.play();
						System.out.println("-------------------------------------------------------------------");
						System.out.println("LEGGENDA CONSULTAZIONE");
						System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
						System.out.println("Premere 0 chiudere il Player Multimediale.");
						System.out.println("-------------------------------------------------------------------");
						sceltaElemento = Integer.parseInt(input.nextLine().trim());
					}
					if (classe.contains("Immagine")) {
						Immagine i = (Immagine) listaElementi[sceltaElemento];
						i.show();
						System.out.println("-------------------------------------------------------------------");
						System.out.println("LEGGENDA CONSULTAZIONE");
						System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
						System.out.println("Premere 0 chiudere il Player Multimediale.");
						System.out.println("-------------------------------------------------------------------");
						sceltaElemento = Integer.parseInt(input.nextLine().trim());
					}
					break;
				}
				case 5: {
					String classe = listaElementi[--sceltaElemento].getClass().toString();
					if (classe.contains("Video")) {
						Video v = (Video) listaElementi[sceltaElemento];
						v.play();
						System.out.println("-------------------------------------------------------------------");
						System.out.println("LEGGENDA CONSULTAZIONE");
						System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
						System.out.println("Premere 0 chiudere il Player Multimediale.");
						System.out.println("-------------------------------------------------------------------");
						sceltaElemento = Integer.parseInt(input.nextLine().trim());
					}
					if (classe.contains("Audio")) {
						Audio a = (Audio) listaElementi[sceltaElemento];
						a.play();
						System.out.println("-------------------------------------------------------------------");
						System.out.println("LEGGENDA CONSULTAZIONE");
						System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
						System.out.println("Premere 0 chiudere il Player Multimediale.");
						System.out.println("-------------------------------------------------------------------");
						sceltaElemento = Integer.parseInt(input.nextLine().trim());
					}
					if (classe.contains("Immagine")) {
						Immagine i = (Immagine) listaElementi[sceltaElemento];
						i.show();
						System.out.println("-------------------------------------------------------------------");
						System.out.println("LEGGENDA CONSULTAZIONE");
						System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
						System.out.println("Premere 0 chiudere il Player Multimediale.");
						System.out.println("-------------------------------------------------------------------");
						sceltaElemento = Integer.parseInt(input.nextLine().trim());
					}
					break;
				}
				default: {
					System.out.println("Errore!");
					System.out.println("-------------------------------------------------------------------");
					System.out.println("LEGGENDA CONSULTAZIONE");
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");
					System.out.println("-------------------------------------------------------------------");
					sceltaElemento = Integer.parseInt(input.nextLine().trim());
				}
			}
		}
		System.out.println("Sei uscito dal Player Multimediale. Ciao!");
	}

}
