package controller;

import java.util.Date;
import java.util.GregorianCalendar;

import dao.EventoDAO;
import dao.LuogoDAO;
import dao.PartecipazioneDAO;
import dao.PersonaDAO;
import model.Eventi;
import model.Luogo;
import model.Partecipazione;
import model.Persona;
import utils.Sesso;
import utils.Stato;
import utils.TipoEvento;

public class MainController {

	public static void main(String[] args) {
		
		Persona p = salvaPersona();
		Luogo l = salvaLuogo();
		Eventi e = salvaEvento(l);
		Partecipazione pt = salvaPartecipazione(e, p);

	}
	
	private static Eventi salvaEvento(Luogo luogo) {
		Eventi evento = new Eventi();
		evento.setTitolo("MotoGP-Misano 2023");
		evento.setDataEvento(new Date());
		evento.setDescrizione("Gara di moto del motomondiale");
		evento.setTipoEvento(TipoEvento.PUBBLICO);
		evento.setNumMaxPartecip(100000);
		evento.setLuogo(luogo);
		
		EventoDAO eventoDao = new EventoDAO();
		eventoDao.save(evento);
		
		return evento;
	}
	
	private static Persona salvaPersona() {
		Persona persona = new Persona();
		persona.setNome("Damiano");
		persona.setCognome("Tiberi");
		persona.setEmail("dam@tib.com");
		persona.setSesso(Sesso.MASCHIO);
		persona.setDataNascita(new GregorianCalendar(1987,9, 14).getTime());
		
		PersonaDAO personaDao = new PersonaDAO();
		personaDao.save(persona);
		
		return persona;
	}
	
	private static Luogo salvaLuogo() {
		Luogo luogo = new Luogo();
		luogo.setNome("Misano World Circuit - Marco Simoncelli");
		luogo.setCitta("Misano Adriatico");
		
		LuogoDAO luogoDao = new LuogoDAO();
		luogoDao.save(luogo);
		
		return luogo;
	}
	
	private static Partecipazione salvaPartecipazione(Eventi evento, Persona persona) {
		Partecipazione partecipazione = new Partecipazione();
		partecipazione.setStato(Stato.CONFERMATA);
		partecipazione.setEventi(evento);
		partecipazione.setPersona(persona);
		
		PartecipazioneDAO partecipazioneDao = new PartecipazioneDAO();
		partecipazioneDao.save(partecipazione);
		
		return partecipazione;
	}

}
