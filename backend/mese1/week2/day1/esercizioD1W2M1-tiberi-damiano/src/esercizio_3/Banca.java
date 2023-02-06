package esercizio_3;

public class Banca {
	public static void main(String args[]) throws BancaException {
		ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

		System.out.println("Saldo conto: " + conto1.restituisciSaldo());

//		conto1.preleva(22000);
		try {
			conto1.preleva(11500);

			System.out.println("Saldo conto: " + conto1.restituisciSaldo());
		} catch (BancaException e) {
//			throw new BancaException("Errore 1");
			System.out.println("Errore durante il prelievo: " + e);
//			e.printStackTrace();
		}

		ContoOnline conto2 = new ContoOnline("Rossi Luigi", 50350.0, 1500);

		conto2.stampaSaldo();

		try {
			conto2.preleva(1000);

			conto2.stampaSaldo();

		} catch (BancaException e) {
//			throw new BancaException("Errore 2");
			System.out.println("Errore durante il prelievo: " + e);
//			e.printStackTrace();
		}
	}
}
