package prenotazioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prenotazioni.model.Edificio;
import prenotazioni.repository.EdificioDaoRepository;

@Service
public class EdificioService {
	
	@Autowired
	EdificioDaoRepository ediDaoRepo;
	
	public void insertEdificio(Edificio edificio) {
		try {
			ediDaoRepo.save(edificio);
			System.out.println("******************************");
			System.out.println("Edificio salvato nel DB!");
			System.out.println("******************************");
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
	}
	
	public Edificio getEdificioById(Integer id) {
		try {
			Edificio e = ediDaoRepo.findById(id).get();
			return e;
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		return null;
	}
	
	public void updateEdificio(Edificio edificio) {
		try {
			ediDaoRepo.save(edificio);
			System.out.println("******************************");
			System.out.println("Edificio modificato nel DB!");
			System.out.println("******************************");
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
	}
	
	public void removeEdificio(Edificio edificio) {
		try {
			ediDaoRepo.delete(edificio);
			System.out.println("******************************");
			System.out.println("Edificio rimosso nel DB!");
			System.out.println("******************************");
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
	}
	
	public List<Edificio> getAllEdificio() {
		try {
			List<Edificio> listaEdifici = ediDaoRepo.findAll();
			return listaEdifici;
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		return null;
	}

}
