package security.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "prenotazioni")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prenotazione")
	private Long idPrenotazione;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_prenotazione")
	private Date dataPrenotazione;
	
	@ManyToOne
	@JoinColumn(name = "id_utente")
	private Utente utente;
	
	@ManyToOne
	@JoinColumn(name = "id_postazione")
	private Postazione postazione;

}
