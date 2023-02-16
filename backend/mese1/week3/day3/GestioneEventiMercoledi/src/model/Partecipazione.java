package model;

import java.io.Serializable;
import javax.persistence.*;

import utils.Stato;


/**
 * The persistent class for the partecipazione database table.
 * 
 */
@Entity
@NamedQuery(name="Partecipazione.findAll", query="SELECT p FROM Partecipazione p")
public class Partecipazione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARTECIPAZIONE_IDPART_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARTECIPAZIONE_IDPART_GENERATOR")
	@Column(name="id_part")
	private Integer idPart;

	@Enumerated(EnumType.STRING)
	private Stato stato;

	//bi-directional many-to-one association to Eventi
	@ManyToOne
	@JoinColumn(name="id_evento")
	private Eventi eventi;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="id_persona")
	private Persona persona;

	public Partecipazione() {
	}

	public Integer getIdPart() {
		return this.idPart;
	}

	public void setIdPart(Integer idPart) {
		this.idPart = idPart;
	}

	public Stato getStato() {
		return this.stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public Eventi getEventi() {
		return this.eventi;
	}

	public void setEventi(Eventi eventi) {
		this.eventi = eventi;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}