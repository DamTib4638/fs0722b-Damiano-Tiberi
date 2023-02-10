package progetto_settimanale;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArchivioCatalogoBibliotecario {
	
	static Logger log = LoggerFactory.getLogger(ArchivioCatalogoBibliotecario.class);
	static File file = new File("archivio/registroBiblioteca.txt");
	static Scanner input = new Scanner(System.in);
	static int sceltaOperazione = -1;
	static int sceltaInserimento = 0;
	static List<ElementoDaLeggere> listaElementiDaLeggere = new ArrayList<ElementoDaLeggere>();
	static List<ElementoDaLeggere> listaElementiDaFile = new ArrayList<ElementoDaLeggere>();

	public static void main(String[] args) {
		try {
			while(!(sceltaOperazione==0)) {
				scegliOperazione();
			}
		} catch (IOException e) {
			log.error("Errore in Lettura/Scrittura File!");
		} catch (NumberFormatException e) {
			log.error("Errore! Non è stato inserito correttamente un numero!");
		} catch (IndexOutOfBoundsException e) {
			log.error("Errore! Problema con qualche range di Lista!");
		} catch (IllegalArgumentException e) {
			log.error(e.getMessage());
		} catch (Exception e) {
			log.error("Altro tipo di Errore. Leggi di seguito." + e.getMessage());
		}

	}
	
	public static void scegliOperazione() throws IOException {
		log.info("Scegli l'operazione che vuoi eseguire nel catalogo bibliotecario.");
		log.info("1 - INSERISCI UN NUOVO ELEMENTO DA LEGGERE");
		log.info("2 - RIMUOVI ELEMENTO PER ISBN");
		log.info("3 - CERCA ELEMENTO PER ISBN");
		log.info("4 - CERCA ELEMENTO PER ANNO PUBBLICAZIONE");
		log.info("5 - CERCA ELEMENTO PER AUTORE");
		log.info("6 - SALVA ELEMENTI DA LEGGERE NEL FILE");
		log.info("7 - RECUPERA ELEMENTI DA LEGGERE SALVATI SU FILE");
		log.info("0 - USCIRE DAL CATALOGO BIBLIOTECARIO");
		sceltaOperazione = Integer.parseInt(input.nextLine().trim());
		switch (sceltaOperazione) {
		case 0: {
			log.info("Sei uscito dal cataglogo bibliotecario");
			break;
		}
		case 1: {
			inserisci();
			break;
		}
		case 2: {
			log.info("Inserisci la stringa ISBN dell'elemento da leggere che vuoi rimuovere.");
			String isbn = input.nextLine().trim();
			rimuoviElementoDaLeggere(isbn);
			break;
		}
		case 3: {
			log.info("Inserisci la stringa ISBN dell'elemento da leggere che vuoi cercare.");
			String isbn = input.nextLine().trim();
			trovaElementoPerISBN(isbn);
			break;
		}
		case 4: {
			log.info("Inserisci l'anno (YYYY) di pubblicazione dell'elemento che stai cercando.");
			Integer anno = Integer.parseInt(input.nextLine().trim());
			trovaListaElementiPerAnno(anno);
			break;
		}
		case 5: {
			log.info("Inserisci l'autore del libro che stai cercando.");
			String autore = input.nextLine().trim();
			trovaListaLibriPerAutore(autore);
			break;
		}
		case 6: {
			salvaSuFile();
			break;
		}
		case 7: {
			leggiDaFile();
			break;
		}
		default:
			log.error("Elemento inserito non valido.");
		}
	}
	
	public static void inserisci() {
		String domanda = "s";
		while (domanda.equalsIgnoreCase("s")) {
			log.info("Scegli la tipologia dell'elemento da leggere che vuoi inserire.");
			log.info("1 - LIBRO");
			log.info("2 - RIVISTA");
			sceltaInserimento = Integer.parseInt(input.nextLine().trim());
			switch (sceltaInserimento) {
			case 1: {
				log.info("Inserisci la stringa ISBN dell'elemento da leggere che stai inserendo.");
				String isbn = input.nextLine().trim();
				log.info("Inserisci il titolo dell'elemento da leggere che stai inserendo.");
				String titolo = input.nextLine().trim();
				log.info("Inserisci l'anno (YYYY) di pubblicazione dell'elemento che stai inserendo.");
				Integer anno = Integer.parseInt(input.nextLine().trim());
				log.info("Inserisci il numero delle pagine dell'elemento che stai inserendo.");
				Integer nPagine = Integer.parseInt(input.nextLine().trim());
				log.info("Inserisci l'autore del libro che stai inserendo.");
				String autore = input.nextLine().trim();
				log.info("Inserisci il genere del libro che stai inserendo.");
				String genere = input.nextLine().trim();
				ElementoDaLeggere libro = new Libro(isbn, titolo, anno, nPagine, autore, genere);
				listaElementiDaLeggere.add(libro);
				log.info("Vuoi inserire un nuovo Elemento da leggere? Rispondi: S/N");
				domanda = input.nextLine().trim();
				break;
			}
			case 2: {
				log.info("Inserisci la stringa ISBN dell'elemento da leggere che stai inserendo.");
				String isbn = input.nextLine().trim();
				log.info("Inserisci il titolo dell'elemento da leggere che stai inserendo.");
				String titolo = input.nextLine().trim();
				log.info("Inserisci l'anno (YYYY) di pubblicazione dell'elemento che stai inserendo.");
				Integer anno = Integer.parseInt(input.nextLine().trim());
				log.info("Inserisci il numero delle pagine dell'elemento che stai inserendo.");
				Integer nPagine = Integer.parseInt(input.nextLine().trim());
				log.info("Inserisci la periodicità della rivista che stai inserendo.");
				String periodicita = input.nextLine().trim();
				ElementoDaLeggere rivista;
				if (periodicita.equalsIgnoreCase("SETTIMANALE")) {
					rivista = new Rivista(isbn, titolo, anno, nPagine, Periodicita.SETTIMANALE);
					listaElementiDaLeggere.add(rivista);
				}
				else if (periodicita.equalsIgnoreCase("MENSILE")) {
					rivista = new Rivista(isbn, titolo, anno, nPagine, Periodicita.MENSILE);
					listaElementiDaLeggere.add(rivista);
				}
				else if (periodicita.equalsIgnoreCase("SEMESTRALE")) {
					rivista = new Rivista(isbn, titolo, anno, nPagine, Periodicita.SEMESTRALE);
					listaElementiDaLeggere.add(rivista);
				}
				else
					log.info("Periodicità inserita non valida. Elemento da leggere NON INSERITO nel catalogo.");
				log.info("Vuoi inserire un nuovo Elemento da leggere? Rispondi: S/N");
				domanda = input.nextLine().trim();
				break;
			}
			default:
				log.error("Elemento inserito non valido.");
				log.info("Vuoi inserire un nuovo Elemento da leggere? Rispondi: S/N");
				domanda = input.nextLine().trim();
			}
		}
		
	}
	
	public static void rimuoviElementoDaLeggere(String codice) {
		List<ElementoDaLeggere> elementiFiltrati = listaElementiDaLeggere
				.stream()
				.filter(el -> !el.getCodiceISBN().equalsIgnoreCase(codice))
				.collect(Collectors.toList());
		listaElementiDaLeggere.clear();
		listaElementiDaLeggere.addAll(elementiFiltrati);
		log.info("Elemento con codice ISBN " + codice + " rimosso correttamente.");
		log.info("---");
		listaElementiDaLeggere.forEach(elem -> log.info(elem.getTitolo()));
	}
	
	public static void trovaElementoPerISBN(String codice) {
		List<ElementoDaLeggere> elementoPerISBN = listaElementiDaLeggere
				.stream()
				.filter(el -> el.getCodiceISBN().equalsIgnoreCase(codice))
				.limit(1)
				.collect(Collectors.toList());
		elementoPerISBN.forEach(el -> log.info(el.toString().toString()));
	}
	
	public static void trovaListaElementiPerAnno(Integer anno) {
		List<ElementoDaLeggere> elementiPerAnnoPubblicazione = listaElementiDaLeggere
				.stream()
				.filter(el -> el.getAnnoPubblicazione().equals(anno))
				.collect(Collectors.toList());
		elementiPerAnnoPubblicazione.forEach(el -> log.info(el.toString().toString()));
	}
	
	public static void trovaListaLibriPerAutore(String autore) {
		listaElementiDaLeggere
				.stream()
				.filter(el -> el.getClass().toString().contains("Libro"))
				.collect(Collectors.toList())
				.forEach(lib -> {
					if (lib instanceof Libro) {
						if(((Libro) lib).getAutore().contains(autore)) {
							log.info(lib.getTitolo());
						}
					}
				});
	}
	
	public static void salvaSuFile() throws IOException {
		String testo = "";
		for (ElementoDaLeggere ele : listaElementiDaLeggere) {
			if (ele instanceof Libro) {
				testo += ((Libro)ele).toString() + ", ";
			}
			if (ele instanceof Rivista) {
				testo += ((Rivista)ele).toString() + ", ";
			}
		}
		FileUtils.writeStringToFile(file, testo, "UTF-8");
		log.info("Scrittura su File eseguita correttamente!");
	}
	
	public static void leggiDaFile() throws IOException {
		String txtFile = FileUtils.readFileToString(file, "UTF-8");
		txtFile = txtFile.replaceAll("=", ",");
		String[] arrayStringhe = txtFile.split(",");
		int valore = 0;
		for (int i=0; i<arrayStringhe.length; i = valore) {
			if (i<=(arrayStringhe.length-5)) {
				if (arrayStringhe[i].contains("LIBRO")) {
					valore+=12;
					String isbn = arrayStringhe[i+1];
					String titolo = arrayStringhe[i+3];
					Integer anno = Integer.parseInt(arrayStringhe[i+5]);
					Integer nPagine = Integer.parseInt(arrayStringhe[i+7]);
					String autore = arrayStringhe[i+9];
					String genere = arrayStringhe[i+11];
					ElementoDaLeggere libro = new Libro(isbn, titolo, anno, nPagine, autore, genere);
					listaElementiDaFile.add(libro);
				} else {
					valore+=10;
					String isbn = arrayStringhe[i+1];
					String titolo = arrayStringhe[i+3];
					Integer anno = Integer.parseInt(arrayStringhe[i+5]);
					Integer nPagine = Integer.parseInt(arrayStringhe[i+7]);
					String periodicita = arrayStringhe[i+9];
					ElementoDaLeggere rivista;
					if (periodicita.equalsIgnoreCase("SETTIMANALE")) {
						rivista = new Rivista(isbn, titolo, anno, nPagine, Periodicita.SETTIMANALE);
						listaElementiDaFile.add(rivista);
					} else if (periodicita.equalsIgnoreCase("MENSILE")) {
						rivista = new Rivista(isbn, titolo, anno, nPagine, Periodicita.MENSILE);
						listaElementiDaFile.add(rivista);
					} else if (periodicita.equalsIgnoreCase("SEMESTRALE")) {
						rivista = new Rivista(isbn, titolo, anno, nPagine, Periodicita.SEMESTRALE);
						listaElementiDaFile.add(rivista);
					}
				}
			} else {
				break;
			}
		}
		listaElementiDaFile.forEach(elem -> log.info(elem.toString()));
		log.info("----------");
		listaElementiDaLeggere = new ArrayList<ElementoDaLeggere>(listaElementiDaFile);
//		log.info(listaElementiDaFile.toString());
	}

}
