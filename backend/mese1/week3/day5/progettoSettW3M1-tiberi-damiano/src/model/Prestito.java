package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Prestito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prestito")
	private Integer idPrestito;
	
	@ManyToOne
	@JoinColumn(name = "id_utente")
	private Utente utente;
	
	@ManyToOne
	@JoinColumn(name = "id_elemento")
	@Column(name = "elem_lett_pres")
	private ElementoDaLeggere elementoLetturaPrestato;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_inizio", nullable = false)
	private Date dataInizioPrestito;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_prevista", nullable = false)
	private Date dataRestituzionePrevista;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_effettiva", nullable = false)
	private Date dataRestituzioneEffettiva;

}
