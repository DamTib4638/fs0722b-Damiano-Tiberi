package security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import security.model.Edificio;
import security.repository.EdificioRepository;

@Service
public class EdificioService {
	
	@Autowired
	EdificioRepository edRepo;
	
	public String aggiungiEdificio(Edificio edificio) {
		edRepo.save(edificio);
		return "Edificio salvato nel DB!!!";
	}
	
	public List<Edificio> getAllEdifici() {
		return edRepo.findAll();
	}

}
