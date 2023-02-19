package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import utils.Periodicita;

@Entity
@DiscriminatorValue("rivista")
public class Rivista extends ElementoDaLeggere {
	
	@Enumerated(EnumType.STRING)
	@Column(name = "periodicita")
	private Periodicita Periodicita;

	public Periodicita getPeriodicita() {
		return Periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		Periodicita = periodicita;
	}

	@Override
	public String toString() {
		return 	"RIVISTA: idElemento=" + super.getIdElemento() +
				", codiceISBN=" + super.getCodiceISBN() + 
				", titolo=" + super.getTitolo() + 
				", annoPubblicazione=" + super.getAnnoPubblicazione() + 
				", numeroPagine=" + super.getNumeroPagine() + 
				", Periodicita=" + Periodicita;
	}
	

}
