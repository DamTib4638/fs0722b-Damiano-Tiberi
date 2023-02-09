package esercizio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Principale {
	
	static List<Prodotto> listaProdottiTotale = new ArrayList<Prodotto>();
	static List<Ordine> listaOrdiniTotale = new ArrayList<Ordine>();
	static Logger log = LoggerFactory.getLogger(Principale.class);

	public static void main(String[] args) {
		
		// GENERO 8 ISTANZE DI PRODOTTO
		Prodotto p1 = new Prodotto(1l, "Libro", "Books", 108.5);
		Prodotto p2 = new Prodotto(2l, "Fifa23", "Boys", 80.0);
		Prodotto p3 = new Prodotto(3l, "Scolapasta", "Baby", 8.5);
		Prodotto p4 = new Prodotto(4l, "Libro2", "Books", 180.5);
		Prodotto p5 = new Prodotto(5l, "Motogp2021", "Boys", 180.0);
		Prodotto p6 = new Prodotto(6l, "Tappeto", "Baby", 250.0);
		Prodotto p7 = new Prodotto(7l, "Tavolo", "Baby", 102.9);
		Prodotto p8 = new Prodotto(8l, "Quaderno", "Cartoleria", 4.5);
		
		// GENERO 4 ISTANZE DI CLIENTE
		Cliente c1 = new Cliente(1l, "Damiano", 2);
		Cliente c2 = new Cliente(2l, "Manuel", 2);
		Cliente c3 = new Cliente(3l, "Stefano", 1);
		Cliente c4 = new Cliente(4l, "Francesco", 3);
		
		// IMPOSTO LE LISTE PRODOTTI
		List<Prodotto> listaProdottiDamiano = new ArrayList<Prodotto>();
		listaProdottiDamiano.add(p1);
		listaProdottiDamiano.add(p2);
		listaProdottiDamiano.add(p5);
		
		List<Prodotto> listaProdottiManuel = new ArrayList<Prodotto>();
		listaProdottiManuel.add(p3);
		listaProdottiManuel.add(p4);
		listaProdottiManuel.add(p5);
		
		List<Prodotto> listaProdottiStefano = new ArrayList<Prodotto>();
		listaProdottiStefano.add(p6);
		listaProdottiStefano.add(p7);
		listaProdottiStefano.add(p8);
		
		List<Prodotto> listaProdottiFrancesco = new ArrayList<Prodotto>();
		listaProdottiFrancesco.add(p1);
		listaProdottiFrancesco.add(p4);
		listaProdottiFrancesco.add(p7);
		
		// GENERO GLI ORDINI DEI 4 CLIENTI
		Ordine ordineDamiano = new Ordine(1l, "ORDINATO", LocalDate.of(2021,03,23), LocalDate.of(2021,03,23), listaProdottiDamiano, c1);
		Ordine ordineManuel = new Ordine(2l, "IN-TRANSITO", LocalDate.of(2021,02,23), LocalDate.of(2021,03,23), listaProdottiManuel, c2);
		Ordine ordineStefano = new Ordine(3l, "CONSEGNATO", LocalDate.of(2021,01,23), LocalDate.of(2021,03,23), listaProdottiStefano, c3);
		Ordine ordineFrancesco = new Ordine(4l, "SPEDITO", LocalDate.of(2021,04,23), LocalDate.of(2021,03,23), listaProdottiFrancesco, c4);
		
		listaProdottiTotale.add(p1);
		listaProdottiTotale.add(p2);
		listaProdottiTotale.add(p3);
		listaProdottiTotale.add(p4);
		listaProdottiTotale.add(p5);
		listaProdottiTotale.add(p6);
		listaProdottiTotale.add(p7);
		listaProdottiTotale.add(p8);
		
		listaOrdiniTotale.add(ordineDamiano);
		listaOrdiniTotale.add(ordineManuel);
		listaOrdiniTotale.add(ordineStefano);
		listaOrdiniTotale.add(ordineFrancesco);
		
		// ESERCIZIO 1
		Stream<Prodotto> streamEsercizio1 = listaProdottiTotale
										.stream()
										.filter(prod -> prod.getPrezzo()>100 && prod.getCategoria().equalsIgnoreCase("Books"));
		List<Prodotto> listaEsercizio1 = streamEsercizio1.collect(Collectors.toList());
		listaEsercizio1.forEach(prod -> log.info(prod.getNome()));
		
		// ESERCIZIO 2
		Stream<Ordine> streamEsercizio2 = listaOrdiniTotale
										.stream()
										.filter(ord -> ord.getListaProdotti()
														.stream()
														.anyMatch(prod -> prod.getCategoria().equalsIgnoreCase("Baby")));
		List<Ordine> listaEsercizio2 = streamEsercizio2.collect(Collectors.toList());
		listaEsercizio2.forEach(ord -> log.info(ord.getCliente().getNome()));
		
		// ESERCIZIO 3
		Stream<Prodotto> streamEsercizio3 = listaProdottiTotale
										.stream()
										.filter(prod -> prod.getCategoria().equalsIgnoreCase("Boys"));
		List<Prodotto> listaEsercizio3 = streamEsercizio3.collect(Collectors.toList());
		listaEsercizio3.forEach(prod -> {
			prod.setPrezzo(prod.getPrezzo()*0.9);
			log.info(prod.getPrezzo().toString());
		});
		
		// ESERCIZIO 4
		Stream<Ordine> streamEsercizio4 = listaOrdiniTotale
										.stream()
										.filter(ord -> ord.getCliente().getLivello()==2
													&& ord.getDataOrdine().isAfter(LocalDate.of(2021,02,01))
													&& ord.getDataOrdine().isBefore(LocalDate.of(2021,04,01)));
		List<Ordine> listaEsercizio4 = streamEsercizio4.collect(Collectors.toList());
		listaEsercizio4.forEach(ord -> log.info(ord.getCliente().getNome()));
		
	}

}
