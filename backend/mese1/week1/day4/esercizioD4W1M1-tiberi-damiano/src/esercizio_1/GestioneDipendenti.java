package esercizio_1;

public class GestioneDipendenti {

	public static void main(String[] args) {

		Dipendente dipendente1 = new Dipendente(1, Dipartimento.PRODUZIONE);
		Dipendente dipendente2 = new Dipendente(2, Dipartimento.PRODUZIONE);
		Dipendente dipendente3 = new Dipendente(3, 1300, 10, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente dipendente4 = new Dipendente(4, 3000, 20, Livello.DIRIGENTE, Dipartimento.VENDITE);
		
		/* ESERCIZIO 1 */
		System.out.println("Lo stipendio mensile del dipendente con matricola " + dipendente1.getMatricola() + " è di: "
				+ calcolaPaga(dipendente1) + " €.");
		System.out.println("Lo stipendio mensile, comprensivo di straordinario, del dipendente con matricola "
				+ dipendente1.getMatricola() + " è di: " + calcolaPaga(dipendente1, 50) + " €.");
		
		
		/* ESERCIZIO 2 */
		dipendente2.promuovi();
		dipendente3.promuovi();
		
		dipendente1.stampaDatiDipendente();
		dipendente2.stampaDatiDipendente();
		dipendente3.stampaDatiDipendente();
		dipendente4.stampaDatiDipendente();
		
		Dipendente elencoDip[] = {dipendente1, dipendente2, dipendente3, dipendente4};
		System.out.println("La somma degli stipendi dei dipendenti istanziati è di: " + calcolaStipendiDip(elencoDip) + " €");
	}

	/* ESERCIZIO 1 */
	public static double calcolaPaga(Dipendente d) {
		return d.getStipendio();
	}
	public static double calcolaPaga(Dipendente d, int oreStr) {
		return d.getStipendio() + d.getImportoOrarioStraordinario() * oreStr;
	}
	
	/* ESERCIZIO 2 */
	public static double calcolaStipendiDip(Dipendente listaDip[]) {
		double totStipendi = 0;
		if(listaDip.length>0) {
			for(int i=0; i<listaDip.length; i++) {
				totStipendi += calcolaPaga(listaDip[i], 5);
			}
		}
		return totStipendi;
	}
}
