package prog_sett;

public interface IVideoAudio {
	
	public void play();
	public int alzaVolume();
	public int abbassaVolume();
	public String calcolaEsclamativi();
	
	/**
	 * Interfaccia con le funzionalità in comune tra le classi Audio e Video, che vengono poi implementate
	 */

}
