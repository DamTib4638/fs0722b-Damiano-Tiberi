package view;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dao.ElementoDAO;
import dao.PrestitoDAO;
import dao.UtenteDAO;
import model.ElementoDaLeggere;
import model.Libro;
import model.Prestito;
import model.Rivista;
import model.Utente;
import utils.Periodicita;

public class ArchivioCatalogoBibliografico {
	static Logger log = LoggerFactory.getLogger(ArchivioCatalogoBibliografico.class);
	static Scanner input = new Scanner(System.in);
	static int sceltaOperazione = -1;
	static int sceltaInserimento = 0;
//	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("progettoSettW3M1-tiberi-damiano");
	
	public static void main(String[] args) {
		try {
			while(!(sceltaOperazione==0)) {
				scegliOperazione();
			}
		} catch (Exception e) {
			log.error("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
	}
	
	private static void scegliOperazione() throws IOException, ParseException {
		log.info("------------------------------------");
		log.info("Scegli l'operazione che vuoi eseguire nel catalogo bibliotecario.");
		log.info("1 - INSERISCI UN NUOVO ELEMENTO DA LEGGERE");
		log.info("2 - RIMUOVI ELEMENTO PER ISBN");
		log.info("3 - CERCA ELEMENTO PER ISBN");
		log.info("4 - CERCA ELEMENTO PER ANNO PUBBLICAZIONE");
		log.info("5 - CERCA ELEMENTO PER AUTORE");
		log.info("6 - CERCA ELEMENTO PER TITOLO O PARTE DI ESSO");
		log.info("7 - CERCA ELEMENTI IN PRESTITO PER NUMERO TESSERA UTENTE");
		log.info("8 - CERCA ELEMENTI CON PRESTITO SCADUTO MA NON ANCORA RESTITUITI");
		log.info("9 - INSERISCI UN NUOVO UTENTE");
		log.info("10 - REGISTRA UN PRESTITO");
		log.info("11 - REGISTRA UNA RESTITUZIONE EFFETTIVA DI UN PRESTITO");
		log.info("12 - VISUALIZZA LA LISTA TOTALE DEGLI ELEMENTI");
		log.info("13 - VISUALIZZA LA LISTA TOTALE DEGLI UTENTI");
		log.info("14 - VISUALIZZA LA LISTA TOTALE DEI PRESTITI");
		log.info("0 - USCIRE DAL CATALOGO BIBLIOTECARIO");
		log.info("------------------------------------");
		sceltaOperazione = Integer.parseInt(input.nextLine().trim());
		switch (sceltaOperazione) {
		case 0: {
			log.info("------------------------------------");
			log.info("Sei uscito dal cataglogo bibliotecario");
			log.info("------------------------------------");
			break;
		}
		case 1: {
			inserisciElemento();
			break;
		}
		case 2: {
			log.info("------------------------------------");
			log.info("Inserisci la stringa ISBN dell'elemento da leggere che vuoi rimuovere.");
			log.info("------------------------------------");
			String isbn = input.nextLine().trim();
			rimuoviElementoPerISBN(isbn);
			break;
		}
		case 3: {
			log.info("------------------------------------");
			log.info("Inserisci la stringa ISBN dell'elemento da leggere che vuoi cercare.");
			log.info("------------------------------------");
			String isbn = input.nextLine().trim();
			trovaElementoPerISBN(isbn);
			break;
		}
		case 4: {
			log.info("------------------------------------");
			log.info("Inserisci l'anno in formato YYYY di pubblicazione dell'elemento che stai cercando.");
			log.info("------------------------------------");
			Integer anno = Integer.parseInt(input.nextLine().trim());
			trovaListaElementiPerAnno(anno);
			break;
		}
		case 5: {
			log.info("------------------------------------");
			log.info("Inserisci l'autore del libro che stai cercando.");
			log.info("------------------------------------");
			String autore = input.nextLine().trim();
			trovaListaLibriPerAutore(autore);
			break;
		}
		case 6: {
			log.info("------------------------------------");
			log.info("Inserisci il titolo del libro che stai cercando.");
			log.info("------------------------------------");
			String titolo = input.nextLine().trim();
			trovaListaLibriPerTitolo(titolo);
			break;
		}
		case 7: {
			log.info("------------------------------------");
			log.info("Inserisci il numero tessera dell'utente.");
			log.info("------------------------------------");
			Integer numero = Integer.parseInt(input.nextLine().trim());
			ricercaPrestitiUtente(numero);
			break;
		}
		case 8: {
			ricercaScaduti();
			break;
		}
		case 9: {
			inserisciUtente();
			break;
		}
		case 10: {
			inserisciPrestito();
			break;
		}
		case 11: {
			registraRestituzione();
			break;
		}
		case 12: {
			listaTotaleElementi();
			break;
		}
		case 13: {
			listaTotaleUtenti();
			break;
		}
		case 14: {
			listaTotalePrestiti();
			break;
		}
		default:
			log.info("------------------------------------");
			log.error("Elemento inserito non valido.");
			log.info("------------------------------------");
		}
	}
	
	private static void inserisciElemento() {
		String domanda = "s";
		while (domanda.equalsIgnoreCase("s") || domanda.equalsIgnoreCase("si")) {
			log.info("------------------------------------");
			log.info("Scegli la tipologia dell'elemento da leggere che vuoi inserire.");
			log.info("1 - LIBRO");
			log.info("2 - RIVISTA");
			log.info("------------------------------------");
			sceltaInserimento = Integer.parseInt(input.nextLine().trim());
			switch (sceltaInserimento) {
			case 1: {
				Libro libro = new Libro();
				log.info("Inserisci la stringa ISBN del LIBRO che stai inserendo.");
				libro.setCodiceISBN(input.nextLine().trim());
				
				log.info("Inserisci il titolo del LIBRO che stai inserendo.");
				libro.setTitolo(input.nextLine().trim());
				
				log.info("Inserisci l'anno (YYYY) di pubblicazione del LIBRO che stai inserendo.");
				libro.setAnnoPubblicazione(Integer.parseInt(input.nextLine().trim()));
				
				log.info("Inserisci il numero delle pagine del LIBRO che stai inserendo.");
				libro.setNumeroPagine(Integer.parseInt(input.nextLine().trim()));
				
				log.info("Inserisci l'autore del LIBRO che stai inserendo.");
				libro.setAutore(input.nextLine().trim());
				
				log.info("Inserisci il genere del LIBRO che stai inserendo.");
				libro.setGenere(input.nextLine().trim());
				
				ElementoDAO elementoDao = new ElementoDAO();
				elementoDao.insert(libro);
				
				log.info("------------------------------------");
				log.info("Vuoi inserire un nuovo Elemento da leggere? Rispondi: S/N");
				log.info("------------------------------------");
				domanda = input.nextLine().trim();
				break;
			}
			case 2: {
				Rivista rivista = new Rivista();
				log.info("Inserisci la stringa ISBN della RIVISTA che stai inserendo.");
				rivista.setCodiceISBN(input.nextLine().trim());
				
				log.info("Inserisci il titolo della RIVISTA che stai inserendo.");
				rivista.setTitolo(input.nextLine().trim());
				
				log.info("Inserisci l'anno (YYYY) di pubblicazione della RIVISTA che stai inserendo.");
				rivista.setAnnoPubblicazione(Integer.parseInt(input.nextLine().trim()));
				
				log.info("Inserisci il numero delle pagine della RIVISTA che stai inserendo.");
				rivista.setNumeroPagine(Integer.parseInt(input.nextLine().trim()));
				
				log.info("Inserisci la periodicità della RIVISTA che stai inserendo.");
				String periodicita = input.nextLine().trim();

				if (periodicita.equalsIgnoreCase("SETTIMANALE")) {
					rivista.setPeriodicita(Periodicita.SETTIMANALE);
					ElementoDAO elementoDao = new ElementoDAO();
					elementoDao.insert(rivista);
				}
				else if (periodicita.equalsIgnoreCase("MENSILE")) {
					rivista.setPeriodicita(Periodicita.MENSILE);
					ElementoDAO elementoDao = new ElementoDAO();
					elementoDao.insert(rivista);
				}
				else if (periodicita.equalsIgnoreCase("SEMESTRALE")) {
					rivista.setPeriodicita(Periodicita.SEMESTRALE);
					ElementoDAO elementoDao = new ElementoDAO();
					elementoDao.insert(rivista);
				} else {
					log.info("------------------------------------");
					log.info("Periodicità inserita non valida. Elemento da leggere NON INSERITO nel catalogo.");
					log.info("------------------------------------");
				}
				log.info("------------------------------------");
				log.info("Vuoi inserire un nuovo Elemento da leggere? Rispondi: S/N");
				log.info("------------------------------------");
				domanda = input.nextLine().trim();
				break;
			}
			default:
				log.info("------------------------------------");
				log.error("Elemento inserito non valido.");
				log.info("Vuoi inserire un nuovo Elemento da leggere? Rispondi: S/N");
				log.info("------------------------------------");
				domanda = input.nextLine().trim();
			}
		}
	}
	
	private static void rimuoviElementoPerISBN(String codice) {
		
		ElementoDAO elementoDao = new ElementoDAO();
		ElementoDaLeggere elem = elementoDao.getByISBN(codice);
		if (!elem.equals(null)) {
			elementoDao.delete(elem);
		} else {
			log.info("------------------------------------");
			log.info("Elemento non rimosso dal DB, perchè già assente.");
			log.info("------------------------------------");
		}
	}
	
	private static void trovaElementoPerISBN(String codice) {
		ElementoDAO elementoDao = new ElementoDAO();
		ElementoDaLeggere elem = elementoDao.getByISBN(codice);
		if (!elem.equals(null)) {
			log.info("------------------------------------");
			log.info("Elemento: " + elem);
			log.info("------------------------------------");
		} else {
			log.info("------------------------------------");
			log.info("Elemento non rimosso dal DB, perchè già assente.");
			log.info("------------------------------------");
		}
	}
	
	private static void trovaListaElementiPerAnno(Integer anno) {
		ElementoDAO elementoDao = new ElementoDAO();
		List<ElementoDaLeggere> listaElemPerAnno = elementoDao.getByAnno(anno);
		log.info("------------------------------------");
		for (ElementoDaLeggere el : listaElemPerAnno) {
			log.info("Elemento: " + el);
		}
		log.info("------------------------------------");
	}
	
	private static void trovaListaLibriPerAutore(String autore) {
		ElementoDAO elementoDao = new ElementoDAO();
		List<ElementoDaLeggere> listaElemPerAnno = elementoDao.getByAutore(autore);
		log.info("------------------------------------");
		for (ElementoDaLeggere el : listaElemPerAnno) {
			log.info("Elemento: " + el);
		}
		log.info("------------------------------------");
	}
	
	private static void trovaListaLibriPerTitolo(String titolo) {
		ElementoDAO elementoDao = new ElementoDAO();
		List<ElementoDaLeggere> listaElemPerAnno = elementoDao.getByTitolo(titolo);
		log.info("------------------------------------");
		for (ElementoDaLeggere el : listaElemPerAnno) {
			log.info("Elemento: " + el);
		}
		log.info("------------------------------------");
	}
	
	private static void ricercaPrestitiUtente(Integer num) {
		ElementoDAO elementoDao = new ElementoDAO();
		List<ElementoDaLeggere> listaPrestitiUtente = elementoDao.getListaElementiInPrestitoUtente(num);
		log.info("------------------------------------");
		for (ElementoDaLeggere el : listaPrestitiUtente) {
			log.info("Elemento in prestito: " + el);
		}
		log.info("------------------------------------");
	}
	
	private static void ricercaScaduti() {
		PrestitoDAO prestitoDao = new PrestitoDAO();
		List<Prestito> listaPrestitiScaduti = prestitoDao.getListaPrestitiScaduti();
		log.info("------------------------------------");
		for (Prestito pr : listaPrestitiScaduti) {
			log.info("Prestito scaduto: " + pr);
		}
		log.info("------------------------------------");
	}
	
	private static void inserisciUtente() throws ParseException {
		String domanda = "s";
		while (domanda.equalsIgnoreCase("s") || domanda.equalsIgnoreCase("si")) {
			Utente utente = new Utente();
			log.info("------------------------------------");
			log.info("Inserisci il COGNOME dell'utente");
			log.info("------------------------------------");
			utente.setCognome(input.nextLine().trim());
			
			log.info("------------------------------------");
			log.info("Inserisci il NOME dell'utente");
			log.info("------------------------------------");
			utente.setNome(input.nextLine().trim());
			
			log.info("------------------------------------");
			log.info("Inserisci la DATA DI NASCITA dell'utente nel seguente formato: DD/MM/YYYY");
			log.info("------------------------------------");
			String dataNascitaInput = input.nextLine().trim();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dataNascita = sdf.parse(dataNascitaInput);
			utente.setDataNascita(dataNascita);
			
			log.info("------------------------------------");
			log.info("Inserisci il NUMERO TESSERA dell'utente");
			log.info("------------------------------------");
			utente.setNumeroTessera(Integer.parseInt(input.nextLine().trim()));
			
			UtenteDAO utenteDao = new UtenteDAO();
			utenteDao.insert(utente);
			
			log.info("------------------------------------");
			log.info("Vuoi inserire un nuovo Utente? Rispondi: S/N");
			log.info("------------------------------------");
			domanda = input.nextLine().trim();
		}
	}
	
	private static void inserisciPrestito() throws ParseException {
		String domanda = "s";
		while (domanda.equalsIgnoreCase("s") || domanda.equalsIgnoreCase("si")) {
			Prestito prestito = new Prestito();
			
			log.info("------------------------------------");
			log.info("Inserisci l' ID dell'elemento da prestare");
			log.info("------------------------------------");
			Integer idElem = Integer.parseInt(input.nextLine().trim());
			ElementoDAO elemDao = new ElementoDAO();
			ElementoDaLeggere elemDaPrestare = elemDao.getById(idElem);
			
			log.info("------------------------------------");
			log.info("Inserisci l' ID dell'utente a cui prestare l'elemento");
			log.info("------------------------------------");
			Integer idUt = Integer.parseInt(input.nextLine().trim());
			UtenteDAO utDao = new UtenteDAO();
			Utente ut = utDao.getById(idUt);
			
			if (!elemDaPrestare.equals(null) && !ut.equals(null)) {
				prestito.setElementoLetturaPrestato(elemDaPrestare);
				prestito.setUtente(ut);
				log.info("Inserisci la DATA DI INIZIO PRESTITO dell'elemento nel seguente formato: DD/MM/YYYY");
				String dataInizioPrestitoInput = input.nextLine().trim();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date dataInizioPrestito = sdf.parse(dataInizioPrestitoInput);
				prestito.setDataInizioPrestito(dataInizioPrestito);
				PrestitoDAO prestitoDao = new PrestitoDAO();
				prestitoDao.insert(prestito);
			} else {
				log.info("------------------------------------");
				log.error("Elemento o Utente non trovati nel DB!");
				log.info("------------------------------------");
			}
			
			log.info("------------------------------------");
			log.info("Vuoi inserire un nuovo Prestito? Rispondi: S/N");
			log.info("------------------------------------");
			domanda = input.nextLine().trim();
		}
	}
	
	private static void registraRestituzione() throws ParseException {
		String domanda = "s";
		while (domanda.equalsIgnoreCase("s") || domanda.equalsIgnoreCase("si")) {
			
			log.info("------------------------------------");
			log.info("Inserisci l' ID del prestito da restituire");
			log.info("------------------------------------");
			Integer idPres = Integer.parseInt(input.nextLine().trim());
			PrestitoDAO prestitoDao = new PrestitoDAO();
			Prestito prest = prestitoDao.getById(idPres);
			
			if(!(prest == null) && prest.getDataRestituzioneEffettiva() == null) {
				log.info("------------------------------------");
				log.info("Inserisci la DATA DI RESTITUZIONE EFFETTIVA dell'elemento, nel seguente formato: DD/MM/YYYY");
				log.info("------------------------------------");
				String dataRestPrestitoInput = input.nextLine().trim();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date dataRestituzioneEffettiva = sdf.parse(dataRestPrestitoInput);
				prest.setDataRestituzioneEffettiva(dataRestituzioneEffettiva);
				prestitoDao.update(prest);
			} else if (!(prest.getDataRestituzioneEffettiva() == null)) {
				log.info("------------------------------------");
				log.error("Restituzione già avvenuta per questo prestito!");
				log.info("------------------------------------");
			} else {
				log.info("------------------------------------");
				log.error("Prestito non trovato nel DB!");
				log.info("------------------------------------");
			}
			
			log.info("------------------------------------");
			log.info("Vuoi registrare un nuovo Prestito? Rispondi: S/N");
			log.info("------------------------------------");
			domanda = input.nextLine().trim();
		}
	}
	
	private static void listaTotaleElementi() {
		ElementoDAO elementoDao = new ElementoDAO();
		List<ElementoDaLeggere> listaElementi = elementoDao.getAll();
		log.info("------------------------------------");
		for (ElementoDaLeggere el : listaElementi) {
			log.info("Elemento: " + el);
		}
		log.info("------------------------------------");
	}
	
	private static void listaTotaleUtenti() {
		UtenteDAO utenteDao = new UtenteDAO();
		List<Utente> listaUtenti = utenteDao.getAll();
		log.info("------------------------------------");
		for(Utente ut : listaUtenti) {
			log.info("Utente: " + ut);
		}
		log.info("------------------------------------");
	}
	
	private static void listaTotalePrestiti() {
		PrestitoDAO prestitoDao = new PrestitoDAO();
		List<Prestito> listaPrestiti = prestitoDao.getAll();
		log.info("------------------------------------");
		for (Prestito pr : listaPrestiti) {
			log.info("Prestito: " + pr);
		}
		log.info("------------------------------------");
	}
	
}
