package prenotazioni.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import prenotazioni.model.Prenotazione;
import prenotazioni.model.PrenotazionePK;
import prenotazioni.model.Utente;

@Repository
public interface PrenotazioneDaoRepository extends JpaRepository<Prenotazione, PrenotazionePK> {
	
	public List<Prenotazione> findByUtente(Utente utente);
	public List<Prenotazione> findByIdIdPostazione(Integer id);
	public List<Prenotazione> findByIdDataPrenotazione(Date dataPren);

}
