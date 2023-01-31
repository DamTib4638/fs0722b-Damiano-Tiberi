package esercizio_3;

public class Carrello {
	
	Cliente clienteCarrello;
	Articolo listaArticoli[];
	double totalePrezzo = 0;
	
	public Carrello(Cliente cl, Articolo articoli[]) {
		this.clienteCarrello = cl;
		this.listaArticoli = articoli;
		this.totalePrezzo = calcolaPrezzoCarrello(this.listaArticoli);
	}
	
	public double calcolaPrezzoCarrello(Articolo[] articoli) {
		for (int i=0; i<articoli.length; i++) {
			this.totalePrezzo += articoli[i].prezzo;
		}
		return Math.round(this.totalePrezzo * 100.0) / 100.0;
	}

}
