package prenotazioni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prenotazioni.repository.PrenotazioneDaoRepository;

@Service
public class PrenotazioneService {
	
	@Autowired
	PrenotazioneDaoRepository preDaoRepo;

}
