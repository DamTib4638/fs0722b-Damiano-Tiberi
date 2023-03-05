package prenotazioni.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import prenotazioni.util.TipoPostazione;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Postazione implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_postazione")
	private Integer idPostazione;
	
	private String descrizione;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_postazione", nullable = false)
	private TipoPostazione tipoPostazione;
	
	@Column(nullable = false)
	private Integer numMax;
	
	@ManyToOne
	@JoinColumn(name = "id_edificio")
	private Edificio edificio;
	
	@OneToMany(mappedBy = "postazione", cascade = CascadeType.REMOVE)
	private List<Prenotazione> prenotaziones;

	@Override
	public String toString() {
		return "Postazione [idPostazione=" + idPostazione + ", descrizione=" + descrizione + ", TipoPostazione="
				+ tipoPostazione + ", numMax=" + numMax + ", idEdificio=" + edificio.getIdEdificio() + "]";
	}

}
