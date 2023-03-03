package prenotazioni.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class PrenotazionePK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_prenotazione", insertable=false, updatable=false)
	private Date dataPrenotazione;
	
	@Column(name = "id_postazione", insertable=false, updatable=false)
	private Integer idPostazione;
	
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrenotazionePK)) {
			return false;
		}
		PrenotazionePK castOther = (PrenotazionePK)other;
		return 
			this.idPostazione.equals(castOther.idPostazione)
			&& this.dataPrenotazione.equals(castOther.dataPrenotazione);
	}
	
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dataPrenotazione.hashCode();
		hash = hash * prime + this.idPostazione.hashCode();
		
		return hash;
	}

}
