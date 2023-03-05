package prenotazioni.runner;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import prenotazioni.model.Edificio;
import prenotazioni.service.EdificioService;

@Component
@Order(2)
public class EdificioRunner implements ApplicationRunner {
	
	@Autowired
	EdificioService edServ;

	Scanner input = new Scanner(System.in);

	@Override
	public void run(ApplicationArguments args) throws Exception {
	/*	System.out.println("------------------------------");
		System.out.println("SEZIONE EDIFICIO RUNNER");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI INSERIMENTO EDIFICIO NEL DB");
		System.out.println("------------------------------");
		Edificio edIns = new Edificio();
		System.out.println("------------------------------");
		System.out.println("Inserisci il NOME dell'edificio.");
		System.out.println("------------------------------");
		edIns.setNome(input.nextLine().trim());
		System.out.println("------------------------------");
		System.out.println("Inserisci l'INDIRIZZO dell'edificio.");
		System.out.println("------------------------------");
		edIns.setIndirizzo(input.nextLine().trim());
		System.out.println("------------------------------");
		System.out.println("Inserisci la CITTà dell'edificio.");
		System.out.println("------------------------------");
		edIns.setCitta(input.nextLine().trim());
		edServ.insertEdificio(edIns);
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI INSERIMENTO EDIFICIO");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI RICERCA EDIFICIO NEL DB");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID dell'edificio da ricercare.");
		System.out.println("------------------------------");
		Integer idEdificioRic = Integer.parseInt(input.nextLine().trim());
		Edificio edSelRic = edServ.getEdificioById(idEdificioRic);
		System.out.println("******************************");
		System.out.println(edSelRic);
		System.out.println("******************************");
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI RICERCA EDIFICIO");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI VISUALIZZAZIONE COMPLETA EDIFICI NEL DB");
		System.out.println("------------------------------");
		List<Edificio> listaEdifici = edServ.getAllEdificio();
		System.out.println("******************************");
		listaEdifici.forEach(ed -> System.out.println(ed));
		System.out.println("******************************");
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI VISUALIZZAZIONE COMPLETA EDIFICI");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI MODIFICA EDIFICIO NEL DB");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID dell'edificio da modificare.");
		System.out.println("------------------------------");
		Integer idEdificio = Integer.parseInt(input.nextLine().trim());
		Edificio edSel = edServ.getEdificioById(idEdificio);
		if (edSel != null) {
			System.out.println("------------------------------");
			System.out.println("SE vuoi modificare il NOME dell'edificio, inserisci qui sotto");
			System.out.println("Altrimenti premi INVIO per modificare il prossimo campo");
			System.out.println("------------------------------");
			String nome = input.nextLine().trim();
			if (!nome.equals("") && nome != null) {
				edSel.setNome(nome);
			}
			System.out.println("------------------------------");
			System.out.println("SE vuoi modificare l'INDIRIZZO dell'edificio, inserisci qui sotto");
			System.out.println("Altrimenti premi INVIO per modificare il prossimo campo");
			System.out.println("------------------------------");
			String indirizzo = input.nextLine().trim();
			if (!indirizzo.equals("") && indirizzo != null) {
				edSel.setIndirizzo(indirizzo);
			}
			System.out.println("------------------------------");
			System.out.println("SE vuoi modificare la CITTà dell'edificio, inserisci qui sotto");
			System.out.println("Altrimenti premi INVIO per continuare");
			System.out.println("------------------------------");
			String citta = input.nextLine().trim();
			if (!citta.equals("") && citta != null) {
				edSel.setCitta(citta);
			}
			edServ.updateEdificio(edSel);
		} else 
			System.err.println("Edificio non presente nel DB. Inserire nuovo idEdificio da ricercare per modifica.");
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI MODIFICA EDIFICIO");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("OPERAZIONE DI RIMOZIONE EDIFICIO NEL DB");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Inserisci l'ID dell'edificio da rimuovere.");
		System.out.println("------------------------------");
		Integer idEd = Integer.parseInt(input.nextLine().trim());
		Edificio edDel = edServ.getEdificioById(idEd);
		if (edDel != null)
			edServ.removeEdificio(edDel);
		else
			System.err.println("Edificio non presente nel DB. Inserire nuovo idEdificio da ricercare per eliminazione.");
		System.out.println("------------------------------");
		System.out.println("FINE OPERAZIONE DI RIMOZIONE EDIFICIO");
		System.out.println("------------------------------");
		
		
		
		System.out.println("------------------------------");
		System.out.println("FINE SEZIONE EDIFICIO RUNNER");
		System.out.println("------------------------------"); */
	}
}
