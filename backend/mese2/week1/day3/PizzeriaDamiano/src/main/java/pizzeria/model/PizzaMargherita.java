package pizzeria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PizzaMargherita extends Alimento {

	private String gustoBase;
	
	@Override
	public String toString() {
		return "Pizza Base --> Nome Pizza = " + super.getNomeProdotto() + ", Gusto Base = " + gustoBase
				+ ", Calorie = " + super.getCalorie()
				+ ", Prezzo Pizza Base = " + super.getPrezzo() + ".";
	}
	
}
