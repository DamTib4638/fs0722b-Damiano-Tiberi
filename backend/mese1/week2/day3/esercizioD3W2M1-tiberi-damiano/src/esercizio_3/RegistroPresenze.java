package esercizio_3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class RegistroPresenze {
	
	static File file = new File("registro/Presenze.txt");
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean controllo = true;
		List<String> nomiDip = new ArrayList<String>();
		List<Integer> oreDip = new ArrayList<Integer>();
		
		while (controllo) {
			System.out.println("Inserisci operazione da fare.");
			System.out.println("1 - SCRIVI SU FILE");
			System.out.println("2 - LEGGI DA FILE");
			System.out.println("0 - USCIRE");
			int scelta = Integer.parseInt(input.nextLine().trim());
			switch (scelta) {
			case 1: {
				System.out.println("Inserisci numero dipendenti");
				int numero = Integer.parseInt(input.nextLine().trim());
				if (numero>0) {
					for (int i=0; i<numero; i++) {
						System.out.println("Inserisci nome dipendente " + (i+1));
						String nome = input.nextLine().trim();
						nomiDip.add(nome);
						System.out.println("inserisci le ore del dipendente " + (i+1));
						int ore = Integer.parseInt(input.nextLine().trim());
						oreDip.add(ore);
					}
				}
				try {
					scriviSuFile(nomiDip, oreDip);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 2: {
				try {
					leggiFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 0: {
				controllo = false;
				break;
			}
			default:
				System.out.println("Inserimento errato");
			}
		}
		System.out.println("CIAO");

	}
	
	public static void scriviSuFile(List<String> nomiDip, List<Integer> oreDip) throws IOException {
		String testo = "";
		for (int i=0; i<nomiDip.size(); i++) {
			if (i==nomiDip.size()-1) {
				testo = testo.concat(nomiDip.get(i)+"@"+oreDip.get(i));
			} else {
				testo = testo.concat(nomiDip.get(i)+"@"+oreDip.get(i)+"#");
			}
		}
		FileUtils.writeStringToFile(file, testo, "UTF-8");
		System.out.println("Scrittura completata su file");
	}
	
	public static void leggiFile() throws IOException {
		String txtFile = FileUtils.readFileToString(file, "UTF-8");
		System.out.println("Testo del file: " + txtFile);
		txtFile = txtFile.replaceAll("#", "@");
		String[] arrayStringhe = txtFile.split("@");
		System.out.println(Arrays.toString(arrayStringhe));
		
	}

}
