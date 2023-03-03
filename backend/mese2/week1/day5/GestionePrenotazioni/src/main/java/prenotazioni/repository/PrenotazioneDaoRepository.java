package prenotazioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import prenotazioni.model.Prenotazione;
import prenotazioni.model.PrenotazionePK;

@Repository
public interface PrenotazioneDaoRepository extends JpaRepository<Prenotazione, PrenotazionePK> {

}
