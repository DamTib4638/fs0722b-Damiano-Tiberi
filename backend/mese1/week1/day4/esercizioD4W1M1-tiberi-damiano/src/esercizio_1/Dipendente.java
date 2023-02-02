package esercizio_1;

public class Dipendente {
	
	static double stipendioBase = 1000;
	
	private int matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello liv;
	private Dipartimento dip;
	
	public Dipendente(int matricola, Dipartimento dip) {
		this.matricola = matricola;
		this.dip = dip;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.liv = liv.OPERAIO;
	}
	
	public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livello liv,
			Dipartimento dip) {
		this.matricola = matricola;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.liv = liv;
		this.dip = dip;
		this.stipendio = valutaStipendio(stipendio);
	}
	
	public void stampaDatiDipendente() {
        System.out.println("Dati dipendente:");
        System.out.println("matricola: " + this.matricola);
        System.out.println("stipendio: " + this.stipendio + "€");
        System.out.println("straordinari: " + this.importoOrarioStraordinario + "€");
        System.out.println("livello: " + this.liv);
        System.out.println("dipartimento: " + this.dip);
    }
	
	public Livello promuovi() {
		
		switch (this.liv) {
			case OPERAIO: {
				this.liv = liv.IMPIEGATO;
				this.stipendio *= 1.2;
				break;
			}
			case IMPIEGATO: {
				this.liv = liv.QUADRO;
				this.stipendio *= 1.5;
				break;
			}
			case QUADRO: {
				this.liv = liv.DIRIGENTE;
				this.stipendio *= 2;
				break;
			}
			default:
				System.out.println("Errore! Ti è rimasta solo la pensione");
		}
		
//		if(this.liv == liv.OPERAIO) {
//			this.liv = liv.IMPIEGATO;
//			this.stipendio = stipendioBase * 1.2;
//		} else if (this.liv == liv.IMPIEGATO) {
//			this.liv = liv.QUADRO;
//			this.stipendio = stipendioBase * 1.5;
//		} else if (this.liv == liv.QUADRO) {
//			this.liv = liv.DIRIGENTE;
//			this.stipendio = stipendioBase * 2;
//		} else {
//			System.out.println("Errore! Ti è rimasta solo la pensione");
//		}
		return this.liv;
	}
	
	@Override
	public String toString() {
		return "Dipendente [matricola=" + matricola + ", stipendio=" + stipendio + ", importoOrarioStraordinario="
				+ importoOrarioStraordinario + ", liv=" + liv + ", dip=" + dip + "]";
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}
	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}
	public Dipartimento getDip() {
		return dip;
	}
	public void setDip(Dipartimento dip) {
		this.dip = dip;
	}
	public int getMatricola() {
		return matricola;
	}
	public double getStipendio() {
		return stipendio;
	}
	public Livello getLiv() {
		return liv;
	}
	
	private double valutaStipendio(double soldi) {
		switch (this.liv) {
			case OPERAIO: {
				if (soldi >= 1200 || soldi < 1000) {
					soldi = 1000;
				}
				break;
			}
			case IMPIEGATO: {
				if (soldi >= 1500 || soldi < 1200) {
					soldi = 1200;
				}
				break;
			}
			case QUADRO: {
				if (soldi >= 2000 || soldi < 1500) {
					soldi = 1500;
				}
				break;
			}
			default:
				return soldi;
		}
		return soldi;
	}
	
}
