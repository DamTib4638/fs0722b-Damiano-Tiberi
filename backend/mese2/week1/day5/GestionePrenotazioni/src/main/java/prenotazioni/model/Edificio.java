package prenotazioni.model;

import java.util.List;

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
public class Edificio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_edificio")
	private Integer idEdificio;
	
	private String nome;
	
	@Column(nullable = false)
	private String indirizzo;
	
	@Column(nullable = false)
	private String citta;
	
	@OneToMany(mappedBy = "edificio")
	private List<Postazione> postaziones;

}
