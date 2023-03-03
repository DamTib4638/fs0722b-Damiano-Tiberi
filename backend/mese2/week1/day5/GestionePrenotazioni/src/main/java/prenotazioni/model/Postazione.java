package prenotazioni.model;

import java.util.List;

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
public class Postazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_postazione")
	private Integer idPostazione;
	
	private String descrizione;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_postazione", nullable = false)
	private TipoPostazione TipoPostazione;
	
	@Column(nullable = false)
	private Integer numMax;
	
	@ManyToOne
	@JoinColumn(name = "id_edificio")
	private Edificio edificio;
	
	@OneToMany(mappedBy = "postazione")
	private List<Prenotazione> prenotaziones;

}
