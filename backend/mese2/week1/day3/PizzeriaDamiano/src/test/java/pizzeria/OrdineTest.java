package pizzeria;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pizzeria.model.Drink;
import pizzeria.model.Ordine;
import pizzeria.model.PizzaStoCacchio;
import pizzeria.model.Prodotto;
import pizzeria.model.Tavolo;
import pizzeria.util.StatoOrdine;

public class OrdineTest {
	
	Tavolo tavoloTest;
	Ordine ordineTest;
	PizzaStoCacchio pizza;
	Drink bevanda;
	Prodotto prodotto;
	
	@Before
	public void beforeCalcolo() {
		prodotto = new Prodotto();
		prodotto.setNomeProdotto("Maglietta Pizzeria Damiano");
		prodotto.setPrezzo(24.50);
		prodotto.setNota("Taglia Unica - Unisex");
		pizza = new PizzaStoCacchio();
		pizza.setNomeProdotto("Raggio di Sole");
		pizza.setGustoBase("Pomodoro - Mozzarella");
		pizza.setIngredientiAggiuntivi("Mozzarella di Bufala, Funghi Porcini");
		pizza.setCalorie(400.0);
		pizza.setPrezzo(8.50);
		bevanda = new Drink();
		bevanda.setNomeProdotto("Coca Cola");
		bevanda.setCalorie(300.0);
		bevanda.setIngredientiBevanda("Acqua, Zucchero, Coloranti");
		bevanda.setPrezzo(2.50);
		tavoloTest = new Tavolo();
		tavoloTest.setIdTavolo(23);
		tavoloTest.setNumMaxCop(4);
		tavoloTest.setTavoloLibero(true);
		ordineTest = new Ordine();
		ordineTest.setIdOrdine(1);
		ordineTest.setNumCopertiOrdine(3);
		ordineTest.setStatoOrdine(StatoOrdine.IN_CORSO);
		ordineTest.setTavolo(tavoloTest);
		ordineTest.aggiungiProdotto(prodotto);
		ordineTest.aggiungiProdotto(bevanda);
		ordineTest.aggiungiProdotto(pizza);
	}

	@Test
	public void testCalcolaTotaleOrdine() {
		Double result = 40.0;
		assertEquals(result, ordineTest.calcolaTotaleOrdine());
	}

}
