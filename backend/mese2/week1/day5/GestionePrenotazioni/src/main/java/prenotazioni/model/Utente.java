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
public class Utente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_utente")
	private Integer idUtente;
	
	private String nominativo;
	
	@Column(nullable = false, unique = true)
	private String username;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@OneToMany(mappedBy = "utente", cascade = CascadeType.REMOVE)
	private List<Prenotazione> prenotaziones;

	@Override
	public String toString() {
		return "Utente [idUtente=" + idUtente + ", nominativo=" + nominativo + ", username=" + username + ", email="
				+ email + "]";
	}

}
