package esercizio_1;

public class Rettangolo {
	
	double altezza;
	double larghezza;
	
	/* Costruttore di default */
	public Rettangolo() {
		
	}
	
	/* Costruttore con entrambi i parametri */
	public Rettangolo(double alt, double lar) {
		this.altezza = alt;
		this.larghezza = lar;
	}
	
	public double calcolaPerimetroRettangolo() {
		return (this.altezza + this.larghezza) * 2;
	}
	
	public double calcolaAreaRettangolo() {
		return this.altezza * this.larghezza;
	}

}
