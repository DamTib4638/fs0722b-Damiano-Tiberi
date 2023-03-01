package pizzeria;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pizzeria.configuration.PizzeriaConfiguration;
import pizzeria.model.Drink;
import pizzeria.model.Ordine;
import pizzeria.model.PizzaStoCacchio;
import pizzeria.model.Prodotto;
import pizzeria.model.Tavolo;
import pizzeria.runner.MenuRunner;
import pizzeria.util.StatoOrdine;


public class MenuRunnerTest {
	
	Tavolo tavoloTest;
	Ordine ordineTest;
	Integer numCoperti;
	MenuRunner menu;

	@Before
	public void beforeCreaOrdineTest() {
		tavoloTest = new Tavolo(46, 4, true);
		ordineTest = new Ordine();
		menu = new MenuRunner();
		numCoperti = 3;
		ordineTest.setIdOrdine(1);
		ordineTest.setStatoOrdine(StatoOrdine.PRONTO);
		ordineTest.setTavolo(tavoloTest);
		ordineTest.setNumCopertiOrdine(numCoperti);
	}
	

	@Test
	public void testCreaOrdine() {
		assertEquals(ordineTest.getStatoOrdine(), menu.creaOrdine(tavoloTest, numCoperti).getStatoOrdine());
	}

	@Ignore
	@Test
	public void testPopolaOrdine() {
		assertEquals(1, 0);
	}

}
