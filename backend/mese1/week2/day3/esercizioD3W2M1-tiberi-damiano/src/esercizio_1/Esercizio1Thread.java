package esercizio_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esercizio1Thread extends Thread {
	
	private String message;
	Logger log = LoggerFactory.getLogger(Esercizio1Thread.class);
	
	public Esercizio1Thread(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		try {
			for (int i=0; i<10; i++) {
				Thread.sleep(1000);
				log.info("Simbolo " + message + " numero " + (i+1) + " !");
			}
		} catch (InterruptedException e) {
			log.error("Problema causato dal ritardo di un secondo del thread.");
		}
	}
	
}
