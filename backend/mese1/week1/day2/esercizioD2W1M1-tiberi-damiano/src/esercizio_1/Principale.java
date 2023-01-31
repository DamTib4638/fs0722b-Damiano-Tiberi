package esercizio_1;

public class Principale {

	public static void main(String[] args) {
		
		Rettangolo r1 = new Rettangolo(3.5, 5.5);
		Rettangolo r2 = new Rettangolo(7.5, 9.5);
		stampaRettangolo(r1);
		stampaDueRettangoli(r1, r2);

	}
	
	public static void stampaRettangolo(Rettangolo rettangolo) {
		System.out.println("L'area del Rettangolo è: " + rettangolo.calcolaAreaRettangolo());
		System.out.println("Il perimetro del Rettangolo è: " + rettangolo.calcolaPerimetroRettangolo());
	}
	
	public static void stampaDueRettangoli(Rettangolo ret1, Rettangolo ret2) {
		stampaRettangolo(ret1);
		stampaRettangolo(ret2);
//		System.out.println("L'area del Rettangolo 1 è: " + ret1.calcolaAreaRettangolo());
//		System.out.println("Il perimetro del Rettangolo 1 è: " + ret1.calcolaPerimetroRettangolo());
//		System.out.println("L'area del Rettangolo 2 è: " + ret2.calcolaAreaRettangolo());
//		System.out.println("Il perimetro del Rettangolo 2 è: " + ret2.calcolaPerimetroRettangolo());
		System.out.println("L'area totale è: " + (ret1.calcolaAreaRettangolo() + ret2.calcolaAreaRettangolo()));
		System.out.println("Il perimetro totale è: " + (ret1.calcolaPerimetroRettangolo() + ret2.calcolaPerimetroRettangolo()));
	}

}
