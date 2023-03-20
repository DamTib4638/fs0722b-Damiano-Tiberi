package incendi.model;

import java.util.List;


public class CentroDiControllo {
// RAPPRESENTA GLI OSSERVATORI CHE SONO IN ASCOLTO DI NUOVI AGGIORNAMENTI DI RILEVAZIONI	
	
	// genera le opportune comunicazioni per ogni sonda esaminata, in modo da avvisare il personale di eventuali
	// incendi, stampando i dettagli su dove sono e che livello di fumo hanno
	public String comunicaPericoloIncendio(List<Dispositivo> listaDispositivi) {
		System.out.println("RAPPORTO SONDE ESAMINATE: ");
		String result = "";
		for (Dispositivo dispositivo : listaDispositivi) {
			if (dispositivo instanceof Sonda) {
				if(((Sonda) dispositivo).getValoreFumo() > 5) {
					System.out.println("------------------------------");
					System.out.println("Pericolo Incendio rilevato dalla sonda " + ((Sonda) dispositivo).getId() + ".");
					System.out.println("DETTAGLI E POSIZIONE DELLA SONDA CHE HA LANCIATO L'ALLARME:");
					System.out.println(((Sonda) dispositivo).stampaDettaglioPericoloIncendio());
					System.out.println("------------------------------");
					result += "Pericolo Incendio rilevato dalla sonda " + ((Sonda) dispositivo).getId() + ".";
				} else {
					System.out.println("------------------------------");
					System.out.println("Nessun pericolo incendio rilevato dalla seguente sonda: " + ((Sonda) dispositivo) + ".");
					System.out.println("------------------------------");
					result += "Nessun pericolo incendio rilevato dalla seguente sonda: " + ((Sonda) dispositivo).getId() + ".";
				}
			}
		}
		System.out.println("FINE RAPPORTO SONDE ESAMINATE");
		return result;
	}

}
