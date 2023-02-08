package esercizio_2;

import java.util.ArrayList;
import java.util.List;

public class Esercizio2Thread extends Thread {
	
	private List<Integer> listaParziale = new ArrayList<Integer>();
	private int estremoInferiore;
	private int estremoSuperiore;
	static int sommaTotale;


	public Esercizio2Thread(List<Integer> listaParziale, int estremoInferiore, int estremoSuperiore) {
		this.listaParziale = new ArrayList<Integer>(listaParziale);
		this.estremoInferiore = estremoInferiore;
		this.estremoSuperiore = estremoSuperiore;
	}


	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Errore del tempo");
		}
		int sommaParziale = 0;
		for (int i=this.estremoInferiore; i<this.estremoSuperiore; i++) {
			sommaParziale += this.listaParziale.get(i);
		}
		sommaTotale += sommaParziale;
		System.out.println(sommaParziale);
	}
	
	

}
