package prenotazioni.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prenotazioni.model.Prenotazione;
import prenotazioni.model.PrenotazionePK;
import prenotazioni.model.Utente;
import prenotazioni.repository.PrenotazioneDaoRepository;

@Service
public class PrenotazioneService {
	
	@Autowired
	PrenotazioneDaoRepository preDaoRepo;
	
	public void insertPrenotazione(Prenotazione prenotazione) {
		try {
			preDaoRepo.save(prenotazione);
			System.out.println("******************************");
			System.out.println("Prenotazione salvata nel DB!");
			System.out.println("******************************");
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
	}
	
	public Prenotazione getPrenotazioneByIdPk(PrenotazionePK id) {
		try {
			Prenotazione p = preDaoRepo.findById(id).get();
			return p;
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		return null;
	}
	
	public void updatePrenotazione(Prenotazione prenotazione) {
		try {
			preDaoRepo.save(prenotazione);
			System.out.println("******************************");
			System.out.println("Prenotazione modificata nel DB!");
			System.out.println("******************************");
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
	}
	
	public void removePrenotazione(Prenotazione prenotazione) {
		try {
			preDaoRepo.delete(prenotazione);
			System.out.println("******************************");
			System.out.println("Prenotazione rimossa nel DB!");
			System.out.println("******************************");
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
	}
	
	public List<Prenotazione> getAllPrenotazione() {
		try {
			List<Prenotazione> listaPrenotazioni = preDaoRepo.findAll();
			return listaPrenotazioni;
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		return null;
	}
	
	public List<Prenotazione> getPrenotazioniByUtente(Utente utente) {
		try {
			List<Prenotazione> listaPrenotazioniPerIdUtente = preDaoRepo.findByUtente(utente);
			return listaPrenotazioniPerIdUtente;
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		return null;
	}

	public List<Prenotazione> getPrenotazioniByIdPost(Integer idPost) {
		try {
			List<Prenotazione> listaPrenotazioniPerIdPost = preDaoRepo.findByIdIdPostazione(idPost);
			return listaPrenotazioniPerIdPost;
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		return null;
	}

	public List<Prenotazione> getPrenotazioniByDataPren(Date dataPren) {
		try {
			List<Prenotazione> listaPrenotazioniPerDataPren = preDaoRepo.findByIdDataPrenotazione(dataPren);
			return listaPrenotazioniPerDataPren;
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		return null;
	}

}
