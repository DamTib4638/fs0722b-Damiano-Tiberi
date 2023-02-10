package progetto_settimanale;

public class Libro extends ElementoDaLeggere {
	
	private String autore;
	private String genere;

	public Libro(String codiceISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, String autore, String genere) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}

	public String getAutore() {
		return autore;
	}

	public String getGenere() {
		return genere;
	}

	@Override
	public String toString() {
		return 	"LIBRO: codiceISBN=" + super.getCodiceISBN() + 
				", titolo=" + super.getTitolo() + 
				", annoPubblicazione=" + super.getAnnoPubblicazione() + 
				", numeroPagine=" + super.getNumeroPagine() + 
				", autore=" + autore + 
				", genere=" + genere;
	}
	

}
