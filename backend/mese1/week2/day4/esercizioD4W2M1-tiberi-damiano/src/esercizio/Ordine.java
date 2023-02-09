package esercizio;

import java.time.LocalDate;
import java.util.List;

public class Ordine {
	
	private Long id;
	private String stato;
	private LocalDate dataOrdine;
	private LocalDate dataConsegna;
	private List<Prodotto> listaProdotti;
	private Cliente cliente;
	
	public Ordine(Long id, String stato, LocalDate dataOrdine, LocalDate dataConsegna, List<Prodotto> listaProdotti,
			Cliente cliente) {
		this.id = id;
		this.stato = stato;
		this.dataOrdine = dataOrdine;
		this.dataConsegna = dataConsegna;
		this.listaProdotti = listaProdotti;
		this.cliente = cliente;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public LocalDate getDataOrdine() {
		return dataOrdine;
	}
	public void setDataOrdine(LocalDate dataOrdine) {
		this.dataOrdine = dataOrdine;
	}
	public LocalDate getDataConsegna() {
		return dataConsegna;
	}
	public void setDataConsegna(LocalDate dataConsegna) {
		this.dataConsegna = dataConsegna;
	}
	public List<Prodotto> getListaProdotti() {
		return listaProdotti;
	}
	public void setListaProdotti(List<Prodotto> listaProdotti) {
		this.listaProdotti = listaProdotti;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
