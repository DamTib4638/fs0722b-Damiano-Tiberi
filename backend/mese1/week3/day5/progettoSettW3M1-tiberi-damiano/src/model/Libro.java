package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("libro")
public class Libro extends ElementoDaLeggere {
	
	private String autore;
	private String genere;
	
	public Libro() {
		super();
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	@Override
	public String toString() {
		return 	"LIBRO: idElemento=" + super.getIdElemento() +
				", codiceISBN=" + super.getCodiceISBN() + 
				", titolo=" + super.getTitolo() + 
				", annoPubblicazione=" + super.getAnnoPubblicazione() + 
				", numeroPagine=" + super.getNumeroPagine() + 
				", autore=" + autore + 
				", genere=" + genere;
	}
	

}
