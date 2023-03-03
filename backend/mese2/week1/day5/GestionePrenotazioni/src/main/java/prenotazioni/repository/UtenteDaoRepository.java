package prenotazioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import prenotazioni.model.Utente;

@Repository
public interface UtenteDaoRepository extends JpaRepository<Utente, Integer> {

}
