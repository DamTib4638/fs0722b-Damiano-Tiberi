package prenotazioni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prenotazioni.repository.UtenteDaoRepository;

@Service
public class UtenteService {
	
	@Autowired
	UtenteDaoRepository utDaoRepo;
	
	

}
