package model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name = "Prestito.findAll", query = "SELECT p FROM Prestito p ORDER BY p.idPrestito ASC")
public class Prestito implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prestito")
	private Integer idPrestito;
	
	@ManyToOne
	@JoinColumn(name = "id_utente")
	private Utente utente;
	
	@ManyToOne
	@JoinColumn(name = "id_elemento")
	private ElementoDaLeggere elementoLetturaPrestato;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_inizio", nullable = false)
	private Date dataInizioPrestito;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_prevista", nullable = false)
	private Date dataRestituzionePrevista;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_effettiva")
	private Date dataRestituzioneEffettiva;

	public Integer getIdPrestito() {
		return idPrestito;
	}

//	public void setIdPrestito(Integer idPrestito) {
//		this.idPrestito = idPrestito;
//	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public ElementoDaLeggere getElementoLetturaPrestato() {
		return elementoLetturaPrestato;
	}

	public void setElementoLetturaPrestato(ElementoDaLeggere elementoLetturaPrestato) {
		this.elementoLetturaPrestato = elementoLetturaPrestato;
	}

	public Date getDataInizioPrestito() {
		return dataInizioPrestito;
	}

	public void setDataInizioPrestito(Date dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataInizioPrestito);
		cal.add(Calendar.DATE, 30);
		this.dataRestituzionePrevista = cal.getTime();
	}

	public Date getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}

	public Date getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}

	public void setDataRestituzioneEffettiva(Date dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	@Override
	public String toString() {
		return "Prestito [idPrestito=" + idPrestito + ", idUtente=" + utente.getIdUtente() + ", idElemento="
				+ elementoLetturaPrestato.getIdElemento() + ", dataInizioPrestito=" + dataInizioPrestito + ", dataRestituzionePrevista="
				+ dataRestituzionePrevista + ", dataRestituzioneEffettiva=" + dataRestituzioneEffettiva + "]";
	}
	

}
