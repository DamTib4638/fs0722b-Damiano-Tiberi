package prenotazioni.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Prenotazione implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PrenotazionePK id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_prenotazione", nullable = false)
	private Date dataPrenotazione;
	
	@ManyToOne
	@JoinColumn(name = "id_postazione", nullable = false)
	private Postazione postazione;
	
	@ManyToOne
	@JoinColumn(name = "id_utente", nullable = false)
	private Utente utente;

}
