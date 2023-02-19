package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name = "Utente.findAll", query = "SELECT u FROM Utente u ORDER BY u.idUtente ASC")
public class Utente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

	public Integer getIdUtente() {
		return idUtente;
	}

//	public void setIdUtente(Integer idUtente) {
//		this.idUtente = idUtente;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Integer getNumeroTessera() {
		return numeroTessera;
	}

	public void setNumeroTessera(Integer numeroTessera) {
		this.numeroTessera = numeroTessera;
	}

	public List<Prestito> getPrestitos() {
		return prestitos;
	}

	public void setPrestitos(List<Prestito> prestitos) {
		this.prestitos = prestitos;
	}

	@Override
	public String toString() {
		return "Utente [idUtente=" + idUtente + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita="
				+ dataNascita + ", numeroTessera=" + numeroTessera + ", prestitos=" + prestitos + "]";
	}
	
	

}
