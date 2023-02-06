package esercizio_3;

public class BancaException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public BancaException(String messaggio) {
		super();
		this.message = messaggio;
	}

	@Override
	public String toString() {
		return "BancaException [message=" + message + "]";
	}

}
