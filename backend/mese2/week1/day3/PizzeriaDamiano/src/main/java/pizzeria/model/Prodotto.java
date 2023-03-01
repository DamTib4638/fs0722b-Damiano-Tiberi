package pizzeria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Prodotto {
	
	private String nomeProdotto;
	private Double prezzo;
	private String nota = "Nessuna Nota";
	
	@Override
	public String toString() {
		return "Prodotto [nomeProdotto=" + nomeProdotto + ", prezzo=" + prezzo + ", nota=" + nota + "]";
	}

}
