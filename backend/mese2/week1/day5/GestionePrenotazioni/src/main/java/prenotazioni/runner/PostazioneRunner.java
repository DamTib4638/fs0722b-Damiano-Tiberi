package prenotazioni.runner;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import prenotazioni.model.Edificio;
import prenotazioni.model.Postazione;
import prenotazioni.service.EdificioService;
import prenotazioni.service.PostazioneService;
import prenotazioni.util.TipoPostazione;

@Component
@Order(3)
public class PostazioneRunner implements ApplicationRunner {
	
	@Autowired
	PostazioneService postServ;
	
	@Autowired
	EdificioService edServ;

	Scanner input = new Scanner(System.in);

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("------------------------------");
		System.out.println("SEZIONE POSTAZIONE RUNNER");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI INSERIMENTO POSTAZIONE NEL DB");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID dell'edificio che possiede la postazione che stai inserendo.");
		System.out.println("------------------------------");
		Integer idEdificio = Integer.parseInt(input.nextLine().trim());
		Postazione postIns = new Postazione();
		Edificio ed = edServ.getEdificioById(idEdificio);
		if (ed != null) {
			postIns.setEdificio(ed);
			System.out.println("------------------------------");
			System.out.println("Inserisci la DESCRIZIONE della postazione.");
			System.out.println("------------------------------");
			postIns.setDescrizione(input.nextLine().trim());
			System.out.println("------------------------------");
			System.out.println("Inserisci il NUMERO MASSIMO OCCUPANTI della postazione.");
			System.out.println("------------------------------");
			Integer numMaxPost = Integer.parseInt(input.nextLine().trim());
			if(numMaxPost>0)
				postIns.setNumMax(numMaxPost);
			else
				postIns.setNumMax(4);
			System.out.println("------------------------------");
			System.out.println("Inserisci il TIPO POSTAZIONE. --> [SALA_RIUNIONI, PRIVATO, OPENSPACE]");
			System.out.println("------------------------------");
			String tipoPost = input.nextLine().trim();
			if (tipoPost.equalsIgnoreCase("SALA_RIUNIONI") || tipoPost.equalsIgnoreCase("SALA RIUNIONI") || tipoPost.equalsIgnoreCase("SALA-RIUNIONI")) {
				postIns.setTipoPostazione(TipoPostazione.SALA_RIUNIONI);
				postServ.insertPostazione(postIns);
			} else if (tipoPost.equalsIgnoreCase("PRIVATO")) {
				postIns.setTipoPostazione(TipoPostazione.PRIVATO);
				postServ.insertPostazione(postIns);
			} else if (tipoPost.equalsIgnoreCase("OPENSPACE")) {
				postIns.setTipoPostazione(TipoPostazione.OPENSPACE);
				postServ.insertPostazione(postIns);
			} else {
				System.out.println("------------------------------");
				System.err.println("Tipo Postazione inserito non valido. Postazione non inserita nel DB!");
				System.out.println("------------------------------");
			}
		} else {
			System.err.println("Edificio non trovato nel DB. Postazione non aggiunta al DB. Ripetere operazione.");
		}
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI INSERIMENTO POSTAZIONE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI RICERCA POSTAZIONE NEL DB");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID della postazione da ricercare.");
		System.out.println("------------------------------");
		Integer idPostazione = Integer.parseInt(input.nextLine().trim());
		Postazione postSel = postServ.getPostazioneById(idPostazione);
		System.out.println(postSel);
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI RICERCA POSTAZIONE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI VISUALIZZAZIONE COMPLETA POSTAZIONI NEL DB");
		System.out.println("------------------------------");
		List<Postazione> listaPostazioni = postServ.getAllPostazione();
		System.out.println("******************************");
		listaPostazioni.forEach(post -> System.out.println(post));
		System.out.println("******************************");
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI VISUALIZZAZIONE COMPLETA POSTAZIONI");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI MODIFICA POSTAZIONE NEL DB");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID della postazione da modificare.");
		System.out.println("------------------------------");
		Integer idPost = Integer.parseInt(input.nextLine().trim());
		Postazione postSelMod = postServ.getPostazioneById(idPost);
		if (postSelMod != null) {
			System.out.println("------------------------------");
			System.out.println("SE vuoi modificare il TIPO POSTAZIONE, inserisci qui sotto. --> [SALA_RIUNIONI, PRIVATO, OPENSPACE]");
			System.out.println("Altrimenti premi INVIO per modificare il prossimo campo");
			System.out.println("------------------------------");
			String tipoPost = input.nextLine().trim();
			if (!tipoPost.equals("") && tipoPost != null) {
				if (tipoPost.equalsIgnoreCase("SALA_RIUNIONI") || tipoPost.equalsIgnoreCase("SALA RIUNIONI") || tipoPost.equalsIgnoreCase("SALA-RIUNIONI")) {
					postSelMod.setTipoPostazione(TipoPostazione.SALA_RIUNIONI);
				} else if (tipoPost.equalsIgnoreCase("PRIVATO")) {
					postSelMod.setTipoPostazione(TipoPostazione.PRIVATO);
				} else if (tipoPost.equalsIgnoreCase("OPENSPACE")) {
					postSelMod.setTipoPostazione(TipoPostazione.OPENSPACE);
				} else {
					System.out.println("------------------------------");
					System.err.println("Tipo Postazione inserito non valido. Postazione non aggiornata nel DB!");
					System.out.println("------------------------------");
				}
			}
			System.out.println("------------------------------");
			System.out.println("SE vuoi modificare la DESCRIZIONE della postazione, inserisci qui sotto");
			System.out.println("Altrimenti premi INVIO per modificare il prossimo campo");
			System.out.println("------------------------------");
			String descrizione = input.nextLine().trim();
			if (!descrizione.equals("") && descrizione != null) {
				postSelMod.setDescrizione(descrizione);
			}
			System.out.println("------------------------------");
			System.out.println("SE vuoi modificare il NUMERO MAX OCCUPANTI della postazione, inserisci qui sotto.");
			System.out.println("Altrimenti premi INVIO per continuare");
			System.out.println("------------------------------");
			Integer numMaxPost = Integer.parseInt(input.nextLine().trim());
			if (numMaxPost > 0) {
				postSelMod.setNumMax(numMaxPost);
			}
			postServ.updatePostazione(postSelMod);
		} else 
			System.out.println("Postazione non presente nel DB. Inserire nuovo idPostazione da ricercare per modifica.");
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI MODIFICA POSTAZIONE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI RIMOZIONE POSTAZIONE NEL DB");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID della postazione da rimuovere.");
		System.out.println("------------------------------");
		Integer idPostazioneDel = Integer.parseInt(input.nextLine().trim());
		Postazione postDel = postServ.getPostazioneById(idPostazioneDel);
		if (postDel != null)
			postServ.removePostazione(postDel);
		else
			System.out.println("Postazione non presente nel DB. Inserire nuovo idPostazione da ricercare per eliminazione.");
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI RIMOZIONE POSTAZIONE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI RICERCA POSTAZIONE TRAMITE CITTà E TIPO POSTAZIONE");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci la CITTà dell'edificio.");
		System.out.println("------------------------------");
		String citta = input.nextLine().trim();
		System.out.println("------------------------------");
		System.out.println("Inserisci il TIPO POSTAZIONE che desideri cercare. --> [SALA_RIUNIONI, PRIVATO, OPENSPACE]");
		System.out.println("------------------------------");
		String tipoPost = input.nextLine().trim();
		if (citta != null && !citta.trim().equals("")) {
			if (tipoPost.equalsIgnoreCase("SALA_RIUNIONI") || tipoPost.equalsIgnoreCase("SALA RIUNIONI") || tipoPost.equalsIgnoreCase("SALA-RIUNIONI")) {
				List<Postazione> listaPostazioniPerCittaTipoPost = postServ.findPostazioniByTipoPostazioneAndCitta(TipoPostazione.SALA_RIUNIONI, citta);
				System.out.println("******************************");
				if (listaPostazioniPerCittaTipoPost != null) {
					listaPostazioniPerCittaTipoPost.forEach(post -> System.out.println(post));
				}
				System.out.println("******************************");
			} else if (tipoPost.equalsIgnoreCase("PRIVATO")) {
				List<Postazione> listaPostazioniPerCittaTipoPost = postServ.findPostazioniByTipoPostazioneAndCitta(TipoPostazione.PRIVATO, citta);
				System.out.println("******************************");
				if (listaPostazioniPerCittaTipoPost != null) {
					listaPostazioniPerCittaTipoPost.forEach(post -> System.out.println(post));
				}
				System.out.println("******************************");
			} else if (tipoPost.equalsIgnoreCase("OPENSPACE")) {
				List<Postazione> listaPostazioniPerCittaTipoPost = postServ.findPostazioniByTipoPostazioneAndCitta(TipoPostazione.OPENSPACE, citta);
				System.out.println("******************************");
				if (listaPostazioniPerCittaTipoPost != null) {
					listaPostazioniPerCittaTipoPost.forEach(post -> System.out.println(post));
				}
				System.out.println("******************************");
			} else {
				System.out.println("------------------------------");
				System.err.println("Tipo Postazione inserito non valido per la ricerca. Ripetere operazione");
				System.out.println("------------------------------");
			}
		}
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI RICERCA POSTAZIONE TRAMITE CITTà E TIPO POSTAZIONE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI RICERCA POSTAZIONE TRAMITE CITTà");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci la CITTà dell'edificio.");
		System.out.println("------------------------------");
		String citta2 = input.nextLine().trim();
		if (citta2 != null && !citta2.trim().equals("")) {
			List<Postazione> listaPostazioniPerCitta = postServ.findPostazioneByCitta(citta2);
			System.out.println("******************************");
			if (listaPostazioniPerCitta != null) {
				listaPostazioniPerCitta.forEach(post -> System.out.println(post));
			}
			System.out.println("******************************");
		}
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI RICERCA POSTAZIONE TRAMITE CITTà");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI RICERCA POSTAZIONE TRAMITE TIPO POSTAZIONE");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci il TIPO POSTAZIONE che desideri cercare. --> [SALA_RIUNIONI, PRIVATO, OPENSPACE]");
		System.out.println("------------------------------");
		String tipoPostazione = input.nextLine().trim();
		if (tipoPostazione.equalsIgnoreCase("SALA_RIUNIONI") || tipoPostazione.equalsIgnoreCase("SALA RIUNIONI") || tipoPostazione.equalsIgnoreCase("SALA-RIUNIONI")) {
			List<Postazione> listaPostazioniPerTipoPost = postServ.findPostazioneByTipo(TipoPostazione.SALA_RIUNIONI);
			System.out.println("******************************");
			if (listaPostazioniPerTipoPost != null) {
				listaPostazioniPerTipoPost.forEach(post -> System.out.println(post));
			}
			System.out.println("******************************");
		} else if (tipoPostazione.equalsIgnoreCase("PRIVATO")) {
			List<Postazione> listaPostazioniPerTipoPost = postServ.findPostazioneByTipo(TipoPostazione.PRIVATO);
			System.out.println("******************************");
			if (listaPostazioniPerTipoPost != null) {
				listaPostazioniPerTipoPost.forEach(post -> System.out.println(post));
			}
			System.out.println("******************************");
		} else if (tipoPostazione.equalsIgnoreCase("OPENSPACE")) {
			List<Postazione> listaPostazioniPerTipoPost = postServ.findPostazioneByTipo(TipoPostazione.OPENSPACE);
			System.out.println("******************************");
			if (listaPostazioniPerTipoPost != null) {
				listaPostazioniPerTipoPost.forEach(post -> System.out.println(post));
			}
			System.out.println("******************************");
		} else {
			System.out.println("------------------------------");
			System.err.println("Tipo Postazione inserito non valido per la ricerca. Ripetere operazione");
			System.out.println("------------------------------");
		}
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI RICERCA POSTAZIONE TRAMITE TIPO POSTAZIONE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("FINE SEZIONE POSTAZIONE RUNNER");
		System.out.println("------------------------------");
	}
}
