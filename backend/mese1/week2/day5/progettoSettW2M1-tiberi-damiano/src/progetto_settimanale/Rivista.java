package progetto_settimanale;

public class Rivista extends ElementoDaLeggere {
	
	private Periodicita Periodicita;

	public Rivista(String codiceISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, Periodicita Periodicita) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		this.Periodicita = Periodicita;
	}

	public Periodicita getPeriodicita() {
		return Periodicita;
	}

	@Override
	public String toString() {
			return 	"RIVISTA: codiceISBN=" + super.getCodiceISBN() + 
					", titolo=" + super.getTitolo() + 
					", annoPubblicazione=" + super.getAnnoPubblicazione() + 
					", numeroPagine=" + super.getNumeroPagine() + 
					", Periodicita=" + Periodicita;
	}
	

}
