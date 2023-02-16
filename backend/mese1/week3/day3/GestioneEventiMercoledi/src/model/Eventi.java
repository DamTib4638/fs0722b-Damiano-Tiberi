package model;

import java.io.Serializable;
import javax.persistence.*;

import utils.TipoEvento;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the eventi database table.
 * 
 */
@Entity
@NamedQuery(name="Eventi.findAll", query="SELECT e FROM Eventi e")
public class Eventi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EVENTI_IDEVENTO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EVENTI_IDEVENTO_GENERATOR")
	@Column(name="id_evento")
	private Integer idEvento;

	@Temporal(TemporalType.DATE)
	@Column(name="data_evento")
	private Date dataEvento;

	private String descrizione;

	@Column(name="num_max_partecip")
	private Integer numMaxPartecip;

	@Enumerated(EnumType.STRING)
	@Column(name="tipo_evento")
	private TipoEvento tipoEvento;

	private String titolo;

	//bi-directional many-to-one association to Luogo
	@ManyToOne
	@JoinColumn(name="id_luogo")
	private Luogo luogo;

	//bi-directional many-to-one association to Partecipazione
	@OneToMany(mappedBy="eventi", cascade = CascadeType.REMOVE)
	private List<Partecipazione> partecipaziones;

	public Eventi() {
	}

	public Integer getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	public Date getDataEvento() {
		return this.dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Integer getNumMaxPartecip() {
		return this.numMaxPartecip;
	}

	public void setNumMaxPartecip(Integer numMaxPartecip) {
		this.numMaxPartecip = numMaxPartecip;
	}

	public TipoEvento getTipoEvento() {
		return this.tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String getTitolo() {
		return this.titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Luogo getLuogo() {
		return this.luogo;
	}

	public void setLuogo(Luogo luogo) {
		this.luogo = luogo;
	}

	public List<Partecipazione> getPartecipaziones() {
		return this.partecipaziones;
	}

	public void setPartecipaziones(List<Partecipazione> partecipaziones) {
		this.partecipaziones = partecipaziones;
	}

	public Partecipazione addPartecipazione(Partecipazione partecipazione) {
		getPartecipaziones().add(partecipazione);
		partecipazione.setEventi(this);

		return partecipazione;
	}

	public Partecipazione removePartecipazione(Partecipazione partecipazione) {
		getPartecipaziones().remove(partecipazione);
		partecipazione.setEventi(null);

		return partecipazione;
	}

}