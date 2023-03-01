package pizzeria.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import pizzeria.configuration.PizzeriaConfiguration;
import pizzeria.model.Drink;
import pizzeria.model.Menu;
import pizzeria.model.Ordine;
import pizzeria.model.PizzaStoCacchio;
import pizzeria.model.PizzaXXL;
import pizzeria.model.Tavolo;
import pizzeria.util.StatoOrdine;

@Component
public class MenuRunner implements CommandLineRunner {
	
	static AnnotationConfigApplicationContext appCtx;

	@Override
	public void run(String... args) throws Exception {
		
		appCtx = new AnnotationConfigApplicationContext(PizzeriaConfiguration.class);
		configuraPizze_Beans();
		
		Tavolo t1 = new Tavolo(1, 4, true);
		Tavolo t2 = new Tavolo(2, 6, true);
		Tavolo t3 = new Tavolo(3, 2, true);
		
		Ordine o1 = creaOrdine(t1, 3);
		if (o1.getIdOrdine() != null) {
			popolaOrdine(o1);
			Double importoOrdine1 = o1.calcolaTotaleOrdine();
			System.out.println(importoOrdine1);
			stampaOrdine(o1);
		}
		Ordine o2 = creaOrdine(t3, 2);
		
		if (o2.getIdOrdine() != null) {
			popolaOrdine(o2);
			Double importoOrdine2 = o2.calcolaTotaleOrdine();
			System.out.println(importoOrdine2);
			stampaOrdine(o2);
		}
		
		Ordine o3 = creaOrdine(t2, 5);
		if (o3.getIdOrdine() != null) {
			popolaOrdine(o3);
			Double importoOrdine3 = o3.calcolaTotaleOrdine();
			System.out.println(importoOrdine3);
			stampaOrdine(o3);
		}
		
	}
	
	public static void configuraPizze_Beans() {
		
		appCtx = new AnnotationConfigApplicationContext(PizzeriaConfiguration.class);
		
		Menu menu = (Menu) appCtx.getBean("listaProdotti");
		stampaMenu(menu);
		
		((AnnotationConfigApplicationContext) appCtx).close();
		
	}
	
	public static void stampaMenu(Menu menu) {
		System.out.println("------------------------------");
		System.out.println(".:. MENU .:.");
		System.out.println("LISTA PIZZE:");
		menu.getMenuPizze().forEach(p -> System.out.println(p));
		System.out.println("------------------------------");
		System.out.println("LISTA BEVANDE");
		menu.getMenuBevande().forEach(b -> System.out.println(b));
		System.out.println("------------------------------");
		System.out.println("LISTA PRODOTTI");
		menu.getMenuProdotti().forEach(pr -> System.out.println(pr));
		System.out.println("------------------------------");
	}
	
	public Ordine creaOrdine(Tavolo tavolo, Integer numCoperti) {
		//appCtx = new AnnotationConfigApplicationContext(PizzeriaConfiguration.class);
//		Ordine o = (Ordine) appCtx.getBean("ordine");
		Ordine o = new Ordine();
		if (tavolo.getNumMaxCop() >= numCoperti && tavolo.getTavoloLibero()) {
			o.setIdOrdine(1);
			o.setStatoOrdine(StatoOrdine.PRONTO);
			o.setTavolo(tavolo);
			o.setNumCopertiOrdine(numCoperti);
		} else {
			System.out.println("Numero ospiti maggiore della disponibilità del tavolo. Andare in un altro tavolo.");
		}
		//((AnnotationConfigApplicationContext) appCtx).close();
		return o;
	}
	
	public void stampaOrdine(Ordine ord) {
		
		System.out.println(ord);
		
	}
	
	public void popolaOrdine(Ordine ord) {
		appCtx = new AnnotationConfigApplicationContext(PizzeriaConfiguration.class);
		ord.aggiungiProdotto((PizzaXXL) appCtx.getBean("salsicciaXXL"));
		ord.aggiungiProdotto((PizzaStoCacchio) appCtx.getBean("bufalaPorcini"));
		ord.aggiungiProdotto((Drink) appCtx.getBean("cocaCola"));
		ord.aggiungiProdotto((Drink) appCtx.getBean("birraCorona"));
		((AnnotationConfigApplicationContext) appCtx).close();
	}

}
