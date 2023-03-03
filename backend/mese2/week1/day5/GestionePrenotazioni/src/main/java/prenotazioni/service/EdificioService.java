package prenotazioni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prenotazioni.repository.EdificioDaoRepository;

@Service
public class EdificioService {
	
	@Autowired
	EdificioDaoRepository ediDaoRepo;

}
