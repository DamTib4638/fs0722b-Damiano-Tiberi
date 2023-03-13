package security.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import security.model.Utente;
import security.service.UtenteService;

@Component
@Order(1)
public class UtenteRunner implements ApplicationRunner {
	
	@Autowired
	UtenteService utServ;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
//		salvaUtente();
		visualizzaUtenti();
		
	}
	
	private void salvaUtente() {
		Utente ut1 = Utente.builder().nome("Damiano").cognome("Tiberi").email("dam@tib.com").username("DamTib").password("555").build();
		String utIns1 = utServ.aggiungiUtente(ut1);
		System.out.println(utIns1);
		
		Utente ut2 = Utente.builder().nome("Manuel").cognome("Ferrucci").email("man@fer.com").username("ManFer").password("135").build();
		String utIns2 = utServ.aggiungiUtente(ut2);
		System.out.println(utIns2);
	}
	
	private void visualizzaUtenti() {
		List<Utente> listaUtenti = utServ.getAllUtenti();
		listaUtenti.forEach(u -> System.out.println(u));
	}

}
