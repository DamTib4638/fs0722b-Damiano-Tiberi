package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "lettura")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Tipo_Lettura", discriminatorType = DiscriminatorType.STRING)
@NamedQuery(name = "ElementoDaLeggere.findAll", query = "SELECT e FROM ElementoDaLeggere e ORDER BY e.idElemento ASC")
public abstract class ElementoDaLeggere {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_elemento")
	private Integer idElemento;
	
	@Column(name = "ISBN", nullable = false, unique = true)
	private String codiceISBN;
	
	@Column(nullable = false)
	private String titolo;
	
	@Column(name = "anno_pubblicazione", nullable = false)
	private Integer annoPubblicazione;
	
	@Column(name = "num_pagine", nullable = false)
	private Integer numeroPagine;
	
	@OneToMany(mappedBy="elementoLetturaPrestato", cascade = CascadeType.REMOVE)
	private List<Prestito> prestitos;
	
	public Integer getIdElemento() {
		return idElemento;
	}
//	public void setIdElemento(Integer idElemento) {
//		this.idElemento = idElemento;
//	}
	public String getCodiceISBN() {
		return codiceISBN;
	}
	public void setCodiceISBN(String codiceISBN) {
		this.codiceISBN = codiceISBN;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public Integer getAnnoPubblicazione() {
		return annoPubblicazione;
	}
	public void setAnnoPubblicazione(Integer annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}
	public Integer getNumeroPagine() {
		return numeroPagine;
	}
	public void setNumeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
	public List<Prestito> getPrestitos() {
		return prestitos;
	}
	public void setPrestitos(List<Prestito> prestitos) {
		this.prestitos = prestitos;
	}
	@Override
	public abstract String toString();

}
