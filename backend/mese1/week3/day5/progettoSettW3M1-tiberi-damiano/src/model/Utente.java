package model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_utente")
	private Integer idUtente;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cognome;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_nascita")
	private Date dataNascita;
	
	@Column(name = "numero_tessera", nullable = false)
	private Integer numeroTessera;
	
	@OneToMany(mappedBy="utente", cascade = CascadeType.REMOVE)
	private List<Prestito> prestitos;

}
