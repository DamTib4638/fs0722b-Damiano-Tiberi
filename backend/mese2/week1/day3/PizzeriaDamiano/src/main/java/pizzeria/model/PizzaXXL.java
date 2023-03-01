package pizzeria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PizzaXXL extends PizzaStoCacchio {
	
	private PizzaStoCacchio pizzaStoCa;
	private Double calorie;
	private Double prezzo;
	
	public PizzaXXL(PizzaStoCacchio pizzaStoCa) {
		this.pizzaStoCa = pizzaStoCa;
		this.prezzo = pizzaStoCa.getPrezzo() + 4.20;
		this.calorie = pizzaStoCa.getCalorie() * 2;
	}

	@Override
	public String toString() {
		return "PizzaXXL --> Nome Pizza = " + pizzaStoCa.getNomeProdotto() + ", Gusto Base = " + pizzaStoCa.getGustoBase()
				+ ", Ingredienti Aggiuntivi = " + pizzaStoCa.getIngredientiAggiuntivi() + ", Calorie = " + this.calorie
				+ ", Prezzo Pizza XXL=" + this.prezzo + ".";
	}
	
}
