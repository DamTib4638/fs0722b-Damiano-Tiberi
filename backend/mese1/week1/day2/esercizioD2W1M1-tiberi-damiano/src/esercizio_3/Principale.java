package esercizio_3;

import java.util.Arrays;

public class Principale {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.nominativo = "Damiano Tiberi";
		cliente.codiceCliente = 1;
		Articolo gioco = new Articolo();
		gioco.descrizioneArticolo = "fifa23";
		gioco.prezzo = 69.99;
		Articolo cover = new Articolo();
		cover.descrizioneArticolo = "samsungCover";
		cover.prezzo = 29.99;
		Articolo cavo = new Articolo();
		cavo.descrizioneArticolo = "Tipo-C";
		cavo.prezzo = 25.49;
		Articolo[] listaAcquisto = {gioco, cover, cavo};
		Carrello acquisto1 = new Carrello(cliente, listaAcquisto);
		System.out.println("Dettaglio carrello.");
		System.out.println("Cliente: " + acquisto1.clienteCarrello.nominativo);
//		System.out.println(Arrays.toString(acquisto1.listaArticoli));
		System.out.println("Articoli:");
		for (int i=0; i<acquisto1.listaArticoli.length; i++) {
			System.out.println(acquisto1.listaArticoli[i].descrizioneArticolo);
			System.out.println(acquisto1.listaArticoli[i].prezzo);
		}
		System.out.println("Prezzo totale: " + acquisto1.totalePrezzo);
		
	}

}
