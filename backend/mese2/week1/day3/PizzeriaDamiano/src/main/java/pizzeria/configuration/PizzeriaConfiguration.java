package pizzeria.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import pizzeria.model.Drink;
import pizzeria.model.Menu;
import pizzeria.model.Ordine;
import pizzeria.model.PizzaMargherita;
import pizzeria.model.PizzaStoCacchio;
import pizzeria.model.PizzaXXL;
import pizzeria.model.Prodotto;
import pizzeria.model.Tavolo;

@Configuration
public class PizzeriaConfiguration {
	
	@Bean
	public Prodotto portaChiavi() {
		Prodotto pr = new Prodotto();
		pr.setNomeProdotto("Portachiavi Pizzeria Damiano");
		pr.setPrezzo(4.50);
		return pr;
	}
	
	@Bean
	public Prodotto maglietta() {
		Prodotto pr = new Prodotto();
		pr.setNomeProdotto("Maglietta Pizzeria Damiano");
		pr.setPrezzo(24.50);
		pr.setNota("Taglia Unica - Unisex");
		return pr;
	}
	
	@Bean
	public PizzaMargherita margherita() {
		PizzaMargherita pizza = new PizzaMargherita();
		pizza.setNomeProdotto("Pizza Margherita");
		pizza.setGustoBase("Pomodoro - Mozzarella");
		pizza.setCalorie(250.0);
		pizza.setPrezzo(5.50);
		return pizza;
	}
	
	@Bean
	public Drink cocaCola() {
		Drink bevanda = new Drink();
		bevanda.setNomeProdotto("Coca Cola");
		bevanda.setCalorie(300.0);
		bevanda.setIngredientiBevanda("Acqua, Zucchero, Coloranti");
		bevanda.setPrezzo(2.50);
		return bevanda;
	}
	
	@Bean
	public Drink birraCorona() {
		Drink bevanda = new Drink();
		bevanda.setNomeProdotto("Corona");
		bevanda.setCalorie(300.0);
		bevanda.setIngredientiBevanda("Acqua, Luppolo, Patente");
		bevanda.setPrezzo(4.50);
		return bevanda;
	}
	
	@Bean
	public PizzaStoCacchio bufalaPorcini() {
		PizzaStoCacchio pizzaStoCa = new PizzaStoCacchio();
		pizzaStoCa.setNomeProdotto("Raggio di Sole");
		pizzaStoCa.setGustoBase("Pomodoro - Mozzarella");
		pizzaStoCa.setIngredientiAggiuntivi("Mozzarella di Bufala, Funghi Porcini");
		pizzaStoCa.setCalorie(400.0);
		pizzaStoCa.setPrezzo(8.50);
		return pizzaStoCa;
	}
	
	@Bean
	public PizzaStoCacchio salsiccia() {
		PizzaStoCacchio pizzaStoCa = new PizzaStoCacchio();
		pizzaStoCa.setNomeProdotto("Salsiccia");
		pizzaStoCa.setGustoBase("Pomodoro - Mozzarella");
		pizzaStoCa.setIngredientiAggiuntivi("Salsiccia");
		pizzaStoCa.setCalorie(350.0);
		pizzaStoCa.setPrezzo(6.50);
		return pizzaStoCa;
	}
	
	@Bean
	public PizzaXXL bufPorcXXL() {
		PizzaXXL pizzaBig = new PizzaXXL();
		pizzaBig.setPizzaStoCa(bufalaPorcini());
		return pizzaBig;
	}
	
	@Bean
	public PizzaXXL salsicciaXXL() {
		return new PizzaXXL(salsiccia());
	}
	
	@Bean
	@Scope("prototype")
	public Tavolo tavolo(Integer nTav, Integer maxCop, Boolean stato) {
		Tavolo tav = new Tavolo();
		tav.setIdTavolo(nTav);
		tav.setNumMaxCop(maxCop);
		tav.setTavoloLibero(stato);
		return tav;
	}
	
	@Bean
	@Scope("prototype")
	public Ordine ordine() {
		return new Ordine();
	}
	
	@Bean
	@Scope("prototype")
	public Menu listaProdotti() {
		Menu menu = new Menu();
		menu.getMenuProdotti().add(portaChiavi());
		menu.getMenuProdotti().add(maglietta());
		menu.getMenuBevande().add(cocaCola());
		menu.getMenuBevande().add(birraCorona());
		menu.getMenuPizze().add(margherita());
		menu.getMenuPizze().add(bufalaPorcini());
		menu.getMenuPizze().add(salsiccia());
		menu.getMenuPizze().add(bufPorcXXL());
		menu.getMenuPizze().add(salsicciaXXL());
		return menu;
	}

}
