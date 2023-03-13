package security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import security.model.Edificio;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {

}
