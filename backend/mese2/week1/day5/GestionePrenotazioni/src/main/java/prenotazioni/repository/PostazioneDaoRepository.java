package prenotazioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import prenotazioni.model.Postazione;

@Repository
public interface PostazioneDaoRepository extends JpaRepository<Postazione, Integer> {

}
