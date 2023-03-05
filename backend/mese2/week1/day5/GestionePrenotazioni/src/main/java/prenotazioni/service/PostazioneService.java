package prenotazioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import prenotazioni.model.Postazione;
import prenotazioni.repository.PostazioneDaoRepository;
import prenotazioni.util.TipoPostazione;

@Service
public class PostazioneService {
	
	@Autowired
	PostazioneDaoRepository postDaoRepo;
	
	public void insertPostazione(Postazione postazione) {
		try {
			postDaoRepo.save(postazione);
			System.out.println("******************************");
			System.out.println("Postazione salvata nel DB!");
			System.out.println("******************************");
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
	}
	
	public Postazione getPostazioneById(Integer id) {
		try {
			Postazione p = postDaoRepo.findById(id).get();
			return p;
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		return null;
	}
	
	public void updatePostazione(Postazione postazione) {
		try {
			postDaoRepo.save(postazione);
			System.out.println("******************************");
			System.out.println("Postazione modificata nel DB!");
			System.out.println("******************************");
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
	}
	
	public void removePostazione(Postazione postazione) {
		try {
			postDaoRepo.delete(postazione);
			System.out.println("******************************");
			System.out.println("Postazione rimossa nel DB!");
			System.out.println("******************************");
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
	}
	
	public List<Postazione> getAllPostazione() {
		try {
			List<Postazione> listaPostazioni = postDaoRepo.findAll();
			return listaPostazioni;
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		return null;
	}
	
	@Query("SELECT p FROM Postazione p, Edificio e WHERE p.edificio = e.idEdificio AND p.tipoPostazione = :#{#tipoPostazione} AND e.citta = :#{#citta}")
	public List<Postazione> findPostazioniByTipoPostazioneAndCitta(@Param("tipoPostazione") TipoPostazione tipoPostazione, @Param("citta") String citta) {
		try {
			List<Postazione> listaPostazioniPerCittaTipoPost = postDaoRepo.findPostazioniByTipoPostazioneAndEdificioCitta(tipoPostazione, citta);
			return listaPostazioniPerCittaTipoPost;
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		return null;
	}
	
	@Query("SELECT p FROM Postazione p, Edificio e WHERE p.edificio = e.idEdificio AND e.citta = :#{#citta}")
	public List<Postazione> findPostazioneByCitta(@Param("citta") String citta) {
		try {
			List<Postazione> listaPostazioniPerCitta = postDaoRepo.findPostazioniByEdificioCitta(citta);
			return listaPostazioniPerCitta;
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		return null;
	}
	
	public List<Postazione> findPostazioneByTipo(@Param("tipoPostazione") TipoPostazione tipoPostazione) {
		try {
			List<Postazione> listaPostazioniPerTipo = postDaoRepo.findPostazioneByTipoPostazione(tipoPostazione);
			return listaPostazioniPerTipo;
		} catch (Exception e) {
			System.err.println("Errore!!! Leggi il messaggio di errore di seguito." + e.getMessage());
		}
		return null;
	}

}
