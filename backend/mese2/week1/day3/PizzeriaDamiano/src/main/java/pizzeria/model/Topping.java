package pizzeria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Topping extends Alimento {

	private PizzaStoCacchio pizzaStoCa;

	@Override
	public String toString() {
		return "Topping [pizzaStoCa=" + pizzaStoCa + ", getCalorie()=" + getCalorie() + ", getNomeProdotto()="
				+ getNomeProdotto() + ", getPrezzo()=" + getPrezzo() + ", getNota()=" + getNota() + "]";
	}
	
}
