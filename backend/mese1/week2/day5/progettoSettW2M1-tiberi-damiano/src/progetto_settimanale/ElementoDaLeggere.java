package progetto_settimanale;

public abstract class ElementoDaLeggere {
	
	private String codiceISBN;
	private String titolo;
	private Integer annoPubblicazione;
	private Integer numeroPagine;
	
	public ElementoDaLeggere(String codiceISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine) {
		this.codiceISBN = codiceISBN;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
	}

	public String getCodiceISBN() {
		return codiceISBN;
	}

	public String getTitolo() {
		return titolo;
	}

	public Integer getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public Integer getNumeroPagine() {
		return numeroPagine;
	}

	@Override
	public abstract String toString();
	
}
