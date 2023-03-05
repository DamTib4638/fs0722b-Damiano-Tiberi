package prenotazioni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionePrenotazioniApplication {

	public static void main(String[] args) {
		
		System.out.println("------------------------------");
		System.out.println("QUESTO MESSAGGIO VIENE VISUALIZZATO DUE VOLTE.");
		System.out.println("------------------------------");
		System.out.println(" ");
		System.out.println("INFORMAZIONI APPLICAZIONE. VERRANNO ESEGUITE, IN ORDINE, LE SEGUENTI SEZIONI: ");
		System.out.println("1 - SEZIONE UTENTE");
		System.out.println("2 - SEZIONE EDIFICIO");
		System.out.println("3 - SEZIONE POSTAZIONE");
		System.out.println("4 - SEZIONE PRENOTAZIONE");
		System.out.println(" ");
		System.err.println("******************************ATTENZIONE!!!***********************************");
		System.err.println("IL CODICE NEI VARI METODI RUN VIENE SVOLTO IN SEQUENZA.");
		System.err.println("PER ESEGUIRE SINGOLE OPERAZIONI, COMMENTARE I PEZZI DI CODICE CHE NON SI VOGLIONO ESEGUIRE.");
		System.out.println("HO AVUTO PROBLEMI CON IL SOLITO MENU A SCELTA PRESENTE NELLE PASSATE ESERCITAZIONI E L'USO DEI RELATIVI METODI, PER QUESTO HO ESEGUITO TUTTO IL CODICE DI OGNI RUNNER, NEL METODO RUN");
		System.out.println("------------------------------");

		SpringApplication.run(GestionePrenotazioniApplication.class, args);
		
	}
}
