package prenotazioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prenotazioni.model.Utente;
import prenotazioni.repository.UtenteDaoRepository;

@Service
public class UtenteService {
	
	@Autowired
	UtenteDaoRepository utDaoRepo;
	
	public void insertUtente(Utente utente) {
		try {
			utDaoRepo.save(utente);
			System.out.println("******************************");
			System.out.println("Utente salvato nel DB!");
			System.out.println("******************************");
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
	}
	
	public Utente getUtenteById(Integer id) {
		try {
			Utente u = utDaoRepo.findById(id).get();
			return u;
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		return null;
	}
	
	public void updateUtente(Utente utente) {
		try {
			utDaoRepo.save(utente);
			System.out.println("******************************");
			System.out.println("Utente modificato nel DB!");
			System.out.println("******************************");
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
	}
	
	public void removeUtente(Utente utente) {
		try {
			utDaoRepo.delete(utente);
			System.out.println("******************************");
			System.out.println("Utente rimosso nel DB!");
			System.out.println("******************************");
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
	}
	
	public List<Utente> getAllUtente() {
		try {
			List<Utente> listaUtenti = utDaoRepo.findAll();
			return listaUtenti;
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		return null;
	}

}
