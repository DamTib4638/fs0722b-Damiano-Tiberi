package lezione6_esercizio.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lezione6_esercizio.exception.LingueExceptions;

@Service
public class HomeService {
	
//	@Value("${esercizio.istruzioniInglese}") private String istruzioniInglese;
//	@Value("${esercizio.istruzioniItaliano}") private String istruzioniItaliano;
	
	private String istruzioniInglese = "Istruzioni in Inglese";
	private String istruzioniItaliano = "Istruzioni in Italiano";
	
	public String check(String lingua) {
		
		if(lingua.equalsIgnoreCase("italiano")) {
			return istruzioniItaliano;
		} else if (lingua.equalsIgnoreCase("inglese")) {
			return istruzioniInglese;
		} else {
			throw new LingueExceptions("Lingua Errata");
		}
	}

}
