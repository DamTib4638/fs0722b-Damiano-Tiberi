package prog_sett;

public abstract class ElementoMultimediale {
	
	protected String titolo;

	public ElementoMultimediale(String titolo) {
		this.titolo = titolo;
	}

	public abstract String getTitolo();
//	{
//		return titolo;
//	}
	
}
