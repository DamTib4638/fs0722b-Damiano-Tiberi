package prenotazioni.runner;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import prenotazioni.model.Utente;
import prenotazioni.service.UtenteService;

@Component
@Order(1)
public class UtenteRunner implements ApplicationRunner {
	
	@Autowired
	UtenteService utServ;
	
	Scanner input = new Scanner(System.in);

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("------------------------------");
		System.out.println("SEZIONE UTENTE RUNNER");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI INSERIMENTO UTENTE NEL DB");
		System.out.println("------------------------------");
		Utente utIns = new Utente();
		System.out.println("------------------------------");
		System.out.println("Inserisci il NOMINATIVO (NOME e COGNOME) dell'utente.");
		System.out.println("------------------------------");
		utIns.setNominativo(input.nextLine().trim());
		System.out.println("------------------------------");
		System.out.println("Inserisci lo USERNAME dell'utente.");
		System.out.println("------------------------------");
		utIns.setUsername(input.nextLine().trim());
		System.out.println("------------------------------");
		System.out.println("Inserisci l' EMAIL dell'utente.");
		System.out.println("------------------------------");
		utIns.setEmail(input.nextLine().trim());
		utServ.insertUtente(utIns);
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI INSERIMENTO UTENTE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI RICERCA UTENTE NEL DB");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID dell'utente da ricercare.");
		System.out.println("------------------------------");
		Integer idUtenteRic = Integer.parseInt(input.nextLine().trim());
		Utente utSelRic = utServ.getUtenteById(idUtenteRic);
		System.out.println("******************************");
		System.out.println(utSelRic);
		System.out.println("******************************");
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI RICERCA UTENTE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI VISUALIZZAZIONE COMPLETA UTENTI NEL DB");
		System.out.println("------------------------------");
		List<Utente> listaUtenti = utServ.getAllUtente();
		System.out.println("******************************");
		listaUtenti.forEach(ut -> System.out.println(ut));
		System.out.println("******************************");
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI VISUALIZZAZIONE COMPLETA UTENTI");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI MODIFICA UTENTE NEL DB");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID dell'utente da modificare.");
		System.out.println("------------------------------");
		Integer idUtente = Integer.parseInt(input.nextLine().trim());
		Utente utSel = utServ.getUtenteById(idUtente);
		if (utSel != null) {
			System.out.println("------------------------------");
			System.out.println("SE vuoi modificare il NOMINATIVO (NOME e COGNOME) dell'utente, inserisci qui sotto");
			System.out.println("Altrimenti premi INVIO per modificare il prossimo campo");
			System.out.println("------------------------------");
			String nominativo = input.nextLine().trim();
			if (!nominativo.equals("") && nominativo != null) {
				utSel.setNominativo(nominativo);
			}
			System.out.println("------------------------------");
			System.out.println("SE vuoi modificare l' USERNAME dell'utente, inserisci qui sotto");
			System.out.println("Altrimenti premi INVIO per modificare il prossimo campo");
			System.out.println("------------------------------");
			String user = input.nextLine().trim();
			if (!user.equals("") && user != null) {
				utSel.setUsername(user);
			}
			System.out.println("------------------------------");
			System.out.println("SE vuoi modificare l' EMAIL dell'utente, inserisci qui sotto");
			System.out.println("Altrimenti premi INVIO per continuare");
			System.out.println("------------------------------");
			String email = input.nextLine().trim();
			if (!email.equals("") && email != null) {
				utSel.setEmail(email);
			}
			utServ.updateUtente(utSel);
		} else 
			System.out.println("Utente non presente nel DB. Inserire nuovo idUtente da ricercare per modifica.");
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI MODIFICA UTENTE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI RIMOZIONE UTENTE NEL DB");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID dell'utente da rimuovere.");
		System.out.println("------------------------------");
		Integer idUt = Integer.parseInt(input.nextLine().trim());
		Utente utDel = utServ.getUtenteById(idUt);
		if (utDel != null)
			utServ.removeUtente(utDel);
		else
			System.out.println("Utente non presente nel DB. Inserire nuovo idUtente da ricercare per eliminazione.");
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI RIMOZIONE UTENTE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("FINE SEZIONE UTENTE RUNNER");
		System.out.println("------------------------------");
	}
}
