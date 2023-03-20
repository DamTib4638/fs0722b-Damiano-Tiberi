package incendi.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import incendi.model.Dispositivo;
import incendi.model.DispositivoFactory;
import incendi.model.ProcessoDiControlloProxy;
import incendi.model.ProcessoDiControlloInterface;

@Component
public class IncendiRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// creo una lista di dispositivi da verificare
		List<Dispositivo> listaDispositivi = new ArrayList<>();
		
		// imposto un numero casuale di sonde da testare compreso tra 2 e 10 (almeno due sonde, al massimo 10 sonde)
		Random random = new Random();
		int numeroSonde = random.nextInt(2, 11);
		
		// imposto il tipo di dispositivi da generare con il pattern factory
		String tipoDispositivo = "sonda";
		
		for (int i=1; i<=numeroSonde; i++) {
			// creo le sonde tramite il pattern factory. La classe DISPOSITIVOFACTORY è colei che si occupa di
			// creare dispositivi di misurazione di incendi (nel nostro caso solo sonde)
			listaDispositivi.add(DispositivoFactory.generaDispositivo(tipoDispositivo, i));
		}
		
		// inizio l'uso del pattern observer e del pattern proxy
		ProcessoDiControlloInterface processo = new ProcessoDiControlloProxy();
		
		// registro gli osservatori del soggetto che voglio far ascoltare
		// Qui, il processo di controllo è il nostro soggetto da osservare e che ci comunicherà la lettura delle 
		// rilevazioni delle sonde che stiamo verificando. Mentre, i vari centri di controllo sono gli osservatori
		// che ricevono gli eventuali allarmi di incendio che i processi di controllo rilevano dalle sonde
		processo.aggiungiOsservatore();
//		processo.aggiungiOsservatore();
		processo.setListaDispositiviDaVerificare(listaDispositivi);
		
	}

}
