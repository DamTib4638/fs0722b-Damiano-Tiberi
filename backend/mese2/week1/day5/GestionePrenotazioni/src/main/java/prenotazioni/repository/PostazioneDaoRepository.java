package prenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import prenotazioni.model.Postazione;
import prenotazioni.util.TipoPostazione;

@Repository
public interface PostazioneDaoRepository extends JpaRepository<Postazione, Integer> {
	
	public List<Postazione> findPostazioniByTipoPostazioneAndEdificioCitta(TipoPostazione tipoPostazione, String citta);
	public List<Postazione> findPostazioniByEdificioCitta(String citta);
	public List<Postazione> findPostazioneByTipoPostazione(TipoPostazione tipoPostazione);

}
