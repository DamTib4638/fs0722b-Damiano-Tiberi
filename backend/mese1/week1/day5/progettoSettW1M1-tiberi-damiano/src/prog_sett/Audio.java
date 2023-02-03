package prog_sett;

public class Audio extends ElementoMultimediale implements IVideoAudio {
	
	private int durata;
	private int volume;
	private String esclamativo = "";
	
	public Audio(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	}

	@Override
	public void play() {
		for (int i=1; i<=this.durata; i++) {
			System.out.println(this.getTitolo()+" "+this.calcolaEsclamativi());
		}
	}

	@Override
	public int alzaVolume() {
		return this.volume++;
	}

	@Override
	public int abbassaVolume() {
		return this.volume--;
	}
	
	@Override
	public String calcolaEsclamativi() {
		this.esclamativo = "";
		for (int i=0; i<this.volume; i++) {
			this.esclamativo += "!";
		}
		return this.esclamativo;
	}

	public int getDurata() {
		return durata;
	}

	public int getVolume() {
		return volume;
	}

	@Override
	public String getTitolo() {
		return super.titolo;
	}

}
