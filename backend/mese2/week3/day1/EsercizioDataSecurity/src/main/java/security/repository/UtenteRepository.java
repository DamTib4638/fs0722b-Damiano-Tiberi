package security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import security.model.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {

}
