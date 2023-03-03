package prenotazioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import prenotazioni.model.Edificio;

@Repository
public interface EdificioDaoRepository extends JpaRepository<Edificio, Integer> {

}
