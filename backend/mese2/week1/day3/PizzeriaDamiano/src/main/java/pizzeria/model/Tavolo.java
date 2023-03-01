package pizzeria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Tavolo {
	
	private Integer idTavolo;
	private Integer numMaxCop;
	private Boolean tavoloLibero = true;

}
