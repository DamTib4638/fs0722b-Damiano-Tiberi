package pizzeria.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pizzeria.util.StatoOrdine;

@Getter
@Setter
@ToString
public class Ordine {
	
	private Tavolo tavolo;
	List<Prodotto> listaProdottiMenu = new ArrayList<Prodotto>();
	private Integer idOrdine;
	private StatoOrdine StatoOrdine;
	private Integer numCopertiOrdine;
	private LocalDateTime orarioAcquisizione;
	private Double importo = 0.0;
	
//	@Value("${Ordine.costoCoperto}")
//	private Double costoCoperto;
	private final Double COSTO_COPERTO = 1.5;
	
	public void aggiungiProdotto(Prodotto pr) {
		this.listaProdottiMenu.add(pr);
	}
	
	public Double calcolaTotaleOrdine() {
		for (Prodotto prodotto : this.listaProdottiMenu) {
			this.importo += prodotto.getPrezzo();
		}
		return this.importo += (COSTO_COPERTO * this.numCopertiOrdine);
	}

}
