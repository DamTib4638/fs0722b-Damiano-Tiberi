package esercizio_2;

import java.util.Arrays;

public class Sim {
	
	String numeroTelefono;
	double creditoDisponibile;
	Chiamata[] lista5Call;
	
	public Sim(String telefono) {
		this.numeroTelefono = telefono;
		this.creditoDisponibile = 0.0;
		this.lista5Call = new Chiamata[5];
	}
	
	public void stampaDatiSim() {
		System.out.println("Nuova SIM creata.");
		System.out.println(	"Numero di telefono: " + this.numeroTelefono +
							", Credito disponibile: " + this.creditoDisponibile +
							". Ultime chiamate: " + Arrays.toString(this.lista5Call));
		/* la stampa delle chiamate da fare in un ciclo, come fatto per gli articoli del carrello */
		
	}

}
