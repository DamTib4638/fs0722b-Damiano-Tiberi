package esercizio_1;

public class Esercizio1ThreadMain {

	public static void main(String[] args) {
		
		Esercizio1Thread threadAsterisco = new Esercizio1Thread("*");
		Esercizio1Thread threadCancelletto = new Esercizio1Thread("#");
		
		threadAsterisco.start();
		threadCancelletto.start();

	}

}
