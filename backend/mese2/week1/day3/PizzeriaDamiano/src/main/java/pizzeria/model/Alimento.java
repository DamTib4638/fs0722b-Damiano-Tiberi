package pizzeria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Alimento extends Prodotto {
	
	private Double calorie;

	@Override
	public String toString() {
		return "Alimento [calorie=" + calorie + ", getNomeProdotto()=" + getNomeProdotto() + ", getPrezzo()="
				+ getPrezzo() + ", getNota()=" + getNota() + "]";
	}

}
