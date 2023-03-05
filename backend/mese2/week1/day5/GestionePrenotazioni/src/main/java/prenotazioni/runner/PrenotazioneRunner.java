package prenotazioni.runner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import prenotazioni.model.Postazione;
import prenotazioni.model.Prenotazione;
import prenotazioni.model.PrenotazionePK;
import prenotazioni.model.Utente;
import prenotazioni.service.PostazioneService;
import prenotazioni.service.PrenotazioneService;
import prenotazioni.service.UtenteService;

@Component
@Order(4)
public class PrenotazioneRunner implements ApplicationRunner {
	
	@Autowired
	PrenotazioneService prenServ;
	
	@Autowired
	PostazioneService postServ;
	
	@Autowired
	UtenteService utServ;

	Scanner input = new Scanner(System.in);

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("------------------------------");
		System.out.println("SEZIONE PRENOTAZIONE RUNNER");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI INSERIMENTO PRENOTAZIONE NEL DB");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID della postazione da prenotare.");
		System.out.println("------------------------------");
		Integer idPostazioneIns = Integer.parseInt(input.nextLine().trim());
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID dell'utente che effettua la prenotazione.");
		System.out.println("------------------------------");
		Integer idUtenteIns = Integer.parseInt(input.nextLine().trim());
		System.out.println("------------------------------");
		System.out.println("Inserisci la DATA PRENOTAZIONE della postazione, nel seguente formato: DD/MM/YYYY");
		System.out.println("------------------------------");
		String dataPrenotazioneInputIns = input.nextLine().trim();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataPrenotazioneIns = null;
		try {
			dataPrenotazioneIns = sdf.parse(dataPrenotazioneInputIns);
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		boolean inserimentoPossibile = true;
		if (dataPrenotazioneIns != null && idPostazioneIns>0 && idUtenteIns>0) {
			Utente ut = utServ.getUtenteById(idUtenteIns);
			Postazione post = postServ.getPostazioneById(idPostazioneIns);
			if (ut != null && post != null) {
				List<Prenotazione> listaPrenotazioniTot = prenServ.getAllPrenotazione();
				for (Prenotazione pren : listaPrenotazioniTot) {
					if (pren.getId().getDataPrenotazione().equals(dataPrenotazioneIns) && pren.getId().getIdPostazione().equals(idPostazioneIns)) {
						inserimentoPossibile = false;
						System.out.println("Prenotazione fallita perchè la postazione è già prenotata per questa data");
						break;
					} else if (pren.getId().getDataPrenotazione().equals(dataPrenotazioneIns) && pren.getUtente().getIdUtente().equals(idUtenteIns)) {
						inserimentoPossibile = false;
						System.out.println("Prenotazione fallita perchè l'utente ha già una prenotazione per questa data");
						break;
					}
				}
				if (inserimentoPossibile) {
					Prenotazione prenotazione = new Prenotazione();
					PrenotazionePK prenIdPk = new PrenotazionePK();
					prenIdPk.setIdPostazione(idPostazioneIns);
					prenIdPk.setDataPrenotazione(dataPrenotazioneIns);
					prenotazione.setId(prenIdPk);
					prenotazione.setUtente(ut);
					prenServ.insertPrenotazione(prenotazione);
				}
			} else {
				System.out.println("Non è possibile eseguire la prenotazione perchè l'utente O la postazione non sono registrati nel DB. Ripetere operazione.");
			}
		} else {
			System.out.println("Almeno uno dei dati inseriti non è corretto. Inserimento prenotazione fallito. Ripetere operazione.");
		}
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI INSERIMENTO PRENOTAZIONE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI RICERCA PRENOTAZIONI NEL DB DATA UNA POSTAZIONE");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID della postazione per cui si vogliono visualizzare le prenotazioni.");
		System.out.println("------------------------------");
		Integer idPos = Integer.parseInt(input.nextLine().trim());
		if (idPos>0) {
			List<Prenotazione> listaPrenotazioniPerIdPost = prenServ.getPrenotazioniByIdPost(idPos);
			if (listaPrenotazioniPerIdPost != null)
				listaPrenotazioniPerIdPost.forEach(pren -> System.out.println(pren));
			else
				System.out.println("Non ci sono prenotazioni per la postazione inserita");
		}
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI RICERCA PRENOTAZIONE TRAMITE POSTAZIONE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI RICERCA PRENOTAZIONI NEL DB DATO UN UTENTE");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID dell'utente per cui si vogliono visualizzare le prenotazioni effettuate.");
		System.out.println("------------------------------");
		Integer idUt = Integer.parseInt(input.nextLine().trim());
		if (idUt>0) {
			Utente u = utServ.getUtenteById(idUt);
			if (u != null) {
				List<Prenotazione> listaPrenotazioniPerIdUtente = prenServ.getPrenotazioniByUtente(u);
				if (listaPrenotazioniPerIdUtente != null)
					listaPrenotazioniPerIdUtente.forEach(pren -> System.out.println(pren));
				else
					System.out.println("Non ci sono prenotazioni per l'utente inserito");
			} else
				System.out.println("Utente non presente nel DB. Prenotazioni inesistenti. Ripetere operazione");
		}
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI RICERCA PRENOTAZIONE TRAMITE UTENTE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI RICERCA PRENOTAZIONI NEL DB TRAMITE UNA DATA PRENOTAZIONE");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci la DATA PRENOTAZIONE della postazione per cui si vogliono visualizzare le prenotazioni.");
		System.out.println("------------------------------");
		String dataPrenotazioneIn = input.nextLine().trim();
		SimpleDateFormat sdfIn = new SimpleDateFormat("dd/MM/yyyy");
		Date dataPrenot = null;
		try {
			dataPrenot = sdfIn.parse(dataPrenotazioneIn);
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		if (dataPrenot!=null) {
			List<Prenotazione> listaPrenotazioniPerDataPren = prenServ.getPrenotazioniByDataPren(dataPrenot);
			if (listaPrenotazioniPerDataPren != null)
				listaPrenotazioniPerDataPren.forEach(pren -> System.out.println(pren));
			else
				System.out.println("Non ci sono prenotazioni per l'utente inserito");
		}
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI RICERCA PRENOTAZIONE TRAMITE DATA PRENOTAZIONE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI RICERCA PRENOTAZIONE NEL DB");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID della postazione da ricercare.");
		System.out.println("------------------------------");
		Integer idPostazioneRic = Integer.parseInt(input.nextLine().trim());
		System.out.println("------------------------------");
		System.out.println("Inserisci la DATA PRENOTAZIONE della postazione da ricercare, nel seguente formato: DD/MM/YYYY");
		System.out.println("------------------------------");
		String dataPrenotazioneInputRic = input.nextLine().trim();
		SimpleDateFormat sdfRic = new SimpleDateFormat("dd/MM/yyyy");
		Date dataPrenotazioneRic = null;
		try {
			dataPrenotazioneRic = sdfRic.parse(dataPrenotazioneInputRic);
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		if (dataPrenotazioneRic != null && idPostazioneRic>0) {
			PrenotazionePK prenIdPk = new PrenotazionePK();
			prenIdPk.setIdPostazione(idPostazioneRic);
			prenIdPk.setDataPrenotazione(dataPrenotazioneRic);
			Prenotazione prenotazione = prenServ.getPrenotazioneByIdPk(prenIdPk);
			if (prenotazione != null) {
				System.out.println(prenotazione);
			} else {
				System.err.println("Prenotazione non presente nel DB.");
			}
		} else {
			System.err.println("Almeno uno dei dati inseriti non è valido. Ripetere operazione.");
		}
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI RICERCA PRENOTAZIONE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI VISUALIZZAZIONE COMPLETA PRENOTAZIONI NEL DB");
		System.out.println("------------------------------");
		List<Prenotazione> listaPrenotazioniTotali = prenServ.getAllPrenotazione();
		System.out.println("******************************");
		listaPrenotazioniTotali.forEach(pren -> System.out.println(pren));
		System.out.println("******************************");
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI VISUALIZZAZIONE COMPLETA PRENOTAZIONI");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI MODIFICA PRENOTAZIONE NEL DB");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID della postazione da modificare.");
		System.out.println("------------------------------");
		Integer idPost = Integer.parseInt(input.nextLine().trim());
		System.out.println("------------------------------");
		System.out.println("Inserisci la DATA PRENOTAZIONE della postazione da modificare, nel seguente formato: DD/MM/YYYY");
		System.out.println("------------------------------");
		String dataPrenInput = input.nextLine().trim();
		SimpleDateFormat sdfm = new SimpleDateFormat("dd/MM/yyyy");
		Date dataPren = null;
		try {
			dataPren = sdfm.parse(dataPrenInput);
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		if (dataPren != null && idPost>0) {
			PrenotazionePK prenIdPk = new PrenotazionePK();
			prenIdPk.setIdPostazione(idPost);
			prenIdPk.setDataPrenotazione(dataPren);
			Prenotazione prenotazione = prenServ.getPrenotazioneByIdPk(prenIdPk);
			if (prenotazione != null) {
				System.out.println("------------------------------");
				System.out.println("SE vuoi modificare l'ID POSTAZIONE della prenotazione, inserisci qui sotto");
				System.out.println("Altrimenti inserisci il valore che aveva");
				System.out.println("------------------------------");
				Integer idPostazione = Integer.parseInt(input.nextLine().trim());
				System.out.println("------------------------------");
				System.out.println("SE vuoi modificare l'ID UTENTE della prenotazione, inserisci qui sotto");
				System.out.println("Altrimenti inserisci il valore che aveva");
				System.out.println("------------------------------");
				Integer idUtente = Integer.parseInt(input.nextLine().trim());
				System.out.println("------------------------------");
				System.out.println("SE vuoi modificare la DATA PRENOTAZIONE della postazione, inserisci qui sotto, nel seguente formato: DD/MM/YYYY");
				System.out.println("Altrimenti inserisci il valore che aveva");
				System.out.println("------------------------------");
				String dataPrenotazioneInput = input.nextLine().trim();
				SimpleDateFormat sdfMod = new SimpleDateFormat("dd/MM/yyyy");
				Date dataPrenotazione = null;
				try {
					dataPrenotazione = sdfMod.parse(dataPrenotazioneInput);
				} catch (Exception e) {
					System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
				}
				boolean modificaPossibile = true;
				if (dataPrenotazione != null && idPostazione>0 && idUtente>0) {
					Utente ut = utServ.getUtenteById(idUtente);
					Postazione post = postServ.getPostazioneById(idPostazione);
					if (ut != null && post != null) {
						List<Prenotazione> listaPrenotazioni = prenServ.getAllPrenotazione();
						for (Prenotazione pren : listaPrenotazioni) {
							if (pren.getId().getDataPrenotazione().equals(dataPrenotazione) && pren.getId().getIdPostazione().equals(idPostazione)) {
								modificaPossibile = false;
								System.out.println("Aggiornamento Prenotazione fallito perchè la postazione è già prenotata per questa data");
								break;
							} else if (pren.getId().getDataPrenotazione().equals(dataPrenotazione) && pren.getUtente().getIdUtente().equals(idUtente)) {
								modificaPossibile = false;
								System.out.println("Aggiornamento Prenotazione fallito perchè l'utente ha già una prenotazione per questa data");
								break;
							}
						}
						if (modificaPossibile) {
							Prenotazione prenotazioneMod = new Prenotazione();
							PrenotazionePK prenIdPkMod = new PrenotazionePK();
							prenIdPkMod.setIdPostazione(idPostazione);
							prenIdPkMod.setDataPrenotazione(dataPrenotazione);
							prenotazioneMod.setId(prenIdPkMod);
							prenotazioneMod.setUtente(ut);
							prenServ.insertPrenotazione(prenotazioneMod);
							prenServ.removePrenotazione(prenotazione);
						}
					} else {
						System.out.println("Non è possibile eseguire la modifica della prenotazione perchè l'utente O la postazione non sono registrati nel DB. Ripetere operazione.");
					}
				} else {
					System.out.println("Almeno uno dei dati inseriti non è corretto. Modifica prenotazione fallita. Ripetere operazione.");
				}
			} else {
				System.out.println("Prenotazione non presente nel DB. Impossibile modificare. Ripetere operazione.");
			}
		} else {
			System.out.println("Almeno uno dei dati inseriti non è valido. Impossibile modificare. Ripetere operazione.");
		}
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI MODIFICA PRENOTAZIONE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI RIMOZIONE PRENOTAZIONE NEL DB");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID della postazione da rimuovere.");
		System.out.println("------------------------------");
		Integer idPostDel = Integer.parseInt(input.nextLine().trim());
		System.out.println("------------------------------");
		System.out.println("Inserisci la DATA PRENOTAZIONE della postazione da rimuovere, nel seguente formato: DD/MM/YYYY");
		System.out.println("------------------------------");
		String dataPrenInputDel = input.nextLine().trim();
		SimpleDateFormat sdfDel = new SimpleDateFormat("dd/MM/yyyy");
		Date dataPrenDel = null;
		try {
			dataPrenDel = sdfDel.parse(dataPrenInputDel);
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		if (dataPrenDel != null && idPostDel>0) {
			PrenotazionePK prenIdPk = new PrenotazionePK();
			prenIdPk.setIdPostazione(idPostDel);
			prenIdPk.setDataPrenotazione(dataPrenDel);
			Prenotazione prenotazione = prenServ.getPrenotazioneByIdPk(prenIdPk);
			if (prenotazione != null) {
				prenServ.removePrenotazione(prenotazione);
			} else {
				System.out.println("Prenotazione non presente nel DB. Impossibile rimuovere. Ripetere operazione.");
			}
		} else {
			System.out.println("Almeno uno dei dati inseriti non è valido. Impossibile rimuovere. Ripetere operazione.");
		}
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI RIMOZIONE PRENOTAZIONE");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("FINE SEZIONE PRENOTAZIONE RUNNER");
		System.out.println("USCITA DALL'APPLICAZIONE");
		System.out.println("------------------------------");
	} 
}
