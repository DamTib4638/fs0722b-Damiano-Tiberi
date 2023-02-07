package esercizio_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Principale {
	
	static Scanner input = new Scanner(System.in);
	static Map<String, String> rubrica = new HashMap<String, String>();
	static int scelta = -1;

	public static void main(String[] args) {
		
		while (!(scelta == 0)) {
			System.out.println("Scegli Operazione");
			System.out.println("1 - INSERISCI");
			System.out.println("2 - CANCELLA");
			System.out.println("3 - CERCA PER TELEFONO");
			System.out.println("4 - CERCA PER NOME");
			System.out.println("5 - STAMPA RUBRICA");
			System.out.println("0 - USCIRE");
			scelta = Integer.parseInt(input.nextLine().trim());
			switch (scelta) {
			case 0: {
				System.out.println("Hai selezionato 0.");
				break;
			}
			case 1: {
				inserisci();
				break;
			}
			case 2: {
				cancella();
				break;
			}
			case 3: {
				searchByTelefono();
				break;
			}
			case 4: {
				searchByNome();
				break;
			}
			case 5: {
				stampaAll();
				break;
			}
			default:
				System.out.println("Selezione non valida");
			}
		}
		System.out.println("CIAO");

	}
	
	public static void inserisci() {
		System.out.println("Inserisci il nome da inserire");
		String nome = input.nextLine();
		System.out.println("inserisci il telefono da inserire");
		String telefono = input.nextLine();
		if(!rubrica.containsKey(nome)) {
			rubrica.put(nome, telefono);
		} else {
			System.out.println("nome già presente in rubrica");
		}
		System.out.println(rubrica);
	}
	
	public static void cancella() {
		System.out.println("Inserisci il nome da cancellare");
		String nome = input.nextLine();
		if (rubrica.containsKey(nome)) {
			rubrica.remove(nome);
		} else {
			System.out.println("Il nome " + nome + " non è presente in rubrica");
		}
		System.out.println(rubrica);
	}
	
	public static void searchByTelefono() {
		System.out.println("inserisci il telefono da cercare");
		String telefono = input.nextLine();
		if (rubrica.containsValue(telefono)) {
			for (Entry<String, String> entry : rubrica.entrySet()) {
                if (entry.getValue().equals(telefono)) {
                    System.out.println(entry.getKey());
                }
            }
		} else {
			System.out.println("Telefono non presente");
		}
	}
	
	public static void searchByNome() {
		System.out.println("Inserisci il nome da cercare");
		String nome = input.nextLine();
		if (rubrica.containsKey(nome)) {
			System.out.println(rubrica.get(nome));
		} else {
			System.out.println("Persona non presente");
		}
	}
	
	public static void stampaAll() {
		System.out.println(rubrica);
	}

}
