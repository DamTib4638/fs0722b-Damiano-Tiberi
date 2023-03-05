package prenotazioni.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Edificio implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_edificio")
	private Integer idEdificio;
	
	private String nome;
	
	@Column(nullable = false)
	private String indirizzo;
	
	@Column(nullable = false)
	private String citta;
	
	@OneToMany(mappedBy = "edificio", cascade = CascadeType.REMOVE)
	private List<Postazione> postaziones;

	@Override
	public String toString() {
		return "Edificio [idEdificio=" + idEdificio + ", nome=" + nome + ", indirizzo=" + indirizzo + ", citta=" + citta
				+ "]";
	}

}
