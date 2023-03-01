package pizzeria.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Menu {
	
	private List<Prodotto> menuProdotti = new ArrayList<Prodotto>();
	private List<PizzaMargherita> menuPizze = new ArrayList<PizzaMargherita>();
	private List<Drink> menuBevande = new ArrayList<Drink>();
	private List<Topping> menuToppings = new ArrayList<Topping>();

}
