package esercizio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esercizio2ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		
		Logger log = LoggerFactory.getLogger(Esercizio2ThreadMain.class);
		Random numeroCasuale = new Random();
		int sommaTotaleReale = 0;
		
		List<Integer> listaTotale = new ArrayList<Integer>();
		for (int i=0; i<3000; i++) {
			listaTotale.add(numeroCasuale.nextInt(1, 3001));
		}
		System.out.println("La lista totale ha lunghezza: " + listaTotale.size());
		for (int valore : listaTotale) {
			sommaTotaleReale += valore;
		}
		
		Esercizio2Thread t1 = new Esercizio2Thread(listaTotale, 0, 1000);
		Esercizio2Thread t2 = new Esercizio2Thread(listaTotale, 1000, 2000);
		Esercizio2Thread t3 = new Esercizio2Thread(listaTotale, 2000, 3000);
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		Thread thread3 = new Thread(t3);
		
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
			thread3.start();
			thread3.join();
			int sommaTotaleVirtuale = Esercizio2Thread.sommaTotale;
			if (sommaTotaleReale == sommaTotaleVirtuale) {
				System.out.println("VIRTUALE: " + sommaTotaleVirtuale + " - REALE: " + sommaTotaleReale);
			} else {
				System.out.println("NON VA BENE");
			}
		} catch (InterruptedException e) {
			log.error(e.getMessage());
		}
	}

}
