package prog_sett;

public class Immagine extends ElementoMultimediale implements IVideoImg {
	
	private int luminosita;
	private String asterisco = "";

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
	}
	
	public void show() {
		System.out.println(this.getTitolo()+" "+this.calcolaAsterisco());
	}

	@Override
	public int diminuisciLuminosita() {
		return this.luminosita--;
	}

	@Override
	public int aumentaLuminosita() {
		return this.luminosita++;
	}
	
	@Override
	public String calcolaAsterisco() {
		this.asterisco = "";
		for (int i=0; i<this.luminosita; i++) {
			this.asterisco += "*";
		}
		return this.asterisco;
	}

	public int getLuminosita() {
		return luminosita;
	}

	@Override
	public String getTitolo() {
		return super.titolo;
	}
	
}
