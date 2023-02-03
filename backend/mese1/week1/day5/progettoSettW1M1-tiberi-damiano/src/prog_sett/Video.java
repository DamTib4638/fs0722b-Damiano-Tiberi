package prog_sett;

public class Video extends Audio implements IVideoImg {
	
	private int luminosita;
	private String asterisco = "";
//	private String esclamativo = "";
	
	public Video(String titolo, int durata, int volume, int luminosita) {
		super(titolo, durata, volume);
		this.luminosita = luminosita;
	}

	@Override
	public void play() {
		for (int i=1; i<=this.getDurata(); i++) {
			System.out.println(super.getTitolo()+" "+super.calcolaEsclamativi()+" "+this.calcolaAsterisco());
		}
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
	

//	@Override
//	public String calcolaEsclamativi() {
//		this.esclamativo = "";
//		for (int i=0; i<this.getVolume(); i++) {
//			this.esclamativo += "!";
//		}
//		return this.esclamativo;
//	}

	public int getLuminosita() {
		return luminosita;
	}

}
