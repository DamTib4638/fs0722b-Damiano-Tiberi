package security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import security.model.Postazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {

}
