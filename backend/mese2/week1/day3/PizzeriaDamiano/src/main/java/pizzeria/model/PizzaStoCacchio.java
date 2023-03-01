package pizzeria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PizzaStoCacchio extends PizzaMargherita {

	private String ingredientiAggiuntivi;
	
	@Override
	public String toString() {
		return "Pizza StoCacchio --> Nome Pizza = " + super.getNomeProdotto() + ", Gusto Base = " + super.getGustoBase()
				+ ", Ingredienti Aggiuntivi = " + ingredientiAggiuntivi + ", Informazioni Nutrizionali = " + super.getCalorie()
				+ ", Prezzo Pizza StoCacchio = " + super.getPrezzo() + ".";
	}
	
}
