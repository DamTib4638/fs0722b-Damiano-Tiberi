package security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import security.model.Utente;
import security.repository.UtenteRepository;

@Service
public class UtenteService {
	
	@Autowired
	UtenteRepository utRepo;
	
	public String aggiungiUtente(Utente utente) {
		utRepo.save(utente);
		return "Utente salvato nel DB!!!";
	}
	
	public List<Utente> getAllUtenti() {
		return utRepo.findAll();
	}

}
