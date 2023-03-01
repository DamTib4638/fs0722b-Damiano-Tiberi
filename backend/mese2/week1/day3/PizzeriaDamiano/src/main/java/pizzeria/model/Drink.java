package pizzeria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Drink extends Alimento {
	
	private String ingredientiBevanda;

	@Override
	public String toString() {
		return "Drink [ingredientiBevanda=" + ingredientiBevanda + ", getCalorie()=" + getCalorie()
				+ ", getNomeProdotto()=" + getNomeProdotto() + ", getPrezzo()=" + getPrezzo() + ", getNota()="
				+ getNota() + "]";
	}

}
