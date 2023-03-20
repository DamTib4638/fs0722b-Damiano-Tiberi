package incendi.model;

import java.util.ArrayList;
import java.util.List;

public class ProcessoDiControlloProxy implements ProcessoDiControlloInterface {
	// QUESTA CLASSE RAPPRESENTA IL SOGGETTO DEL PATTERN OBSERVER, CIOè LA CELEBRITà DA OSSERVARE
	
	// la lista osservatori rappresenta l'elenco degli osservatori che sono in attesa di ricevere news
	// nel nostro caso, è il centro di controllo che riceve la notifica di incendi in corso
	private static List<CentroDiControllo> listaOsservatori;
	
	private static List<Dispositivo> listaDispositiviDaVerificare;
	
	@Override
	public void setListaDispositiviDaVerificare(List<Dispositivo> listaDispositiviDaTestare) {
	// simulo uso del pattern proxy, che mi esegue una certa operazione (in questo caso l'istanziazione), una sola volta.
		if (listaDispositiviDaVerificare == null) {
			listaDispositiviDaVerificare = new ArrayList<Dispositivo>();
		}
		listaDispositiviDaVerificare = listaDispositiviDaTestare;
		aggiornaListaOsservatori();
	}
	
	@Override
	public void aggiungiOsservatore() {
	// simulo uso del pattern proxy, che mi esegue una certa operazione (in questo caso l'istanziazione), una sola volta.
		if (listaOsservatori == null) {
			listaOsservatori = new ArrayList<CentroDiControllo>();
		}
		// nuova registrazione di un osservatore che segue il soggetto
		listaOsservatori.add(new CentroDiControllo());
	}
	
	public void aggiornaListaOsservatori() {
		// invio notifiche a tutti gli osservatori che seguono il soggetto
		if (listaOsservatori.size()>0) {
			for (CentroDiControllo osservatore : listaOsservatori) {
				osservatore.comunicaPericoloIncendio(listaDispositiviDaVerificare);
			}
		} else {
			System.out.println("Nessun osservatore registrato.");
		}
		
	}
	
	public void rimuoviOsservatore(CentroDiControllo osservatore) {
		// cancellazione di un osservatore dal soggetto (una volta disiscritto, non riceverà più news di rilevazioni)
		listaOsservatori.remove(osservatore);
	}

}
