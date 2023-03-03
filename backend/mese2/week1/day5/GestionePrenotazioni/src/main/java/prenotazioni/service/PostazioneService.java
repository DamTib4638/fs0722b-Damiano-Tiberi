package prenotazioni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prenotazioni.repository.PostazioneDaoRepository;

@Service
public class PostazioneService {
	
	@Autowired
	PostazioneDaoRepository postDaoRepo;

}
