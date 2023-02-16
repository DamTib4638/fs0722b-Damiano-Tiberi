package controller;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.EventoDAO;
import model.Evento;
import utils.TipoEvento;

public class MainController {

	public static void main(String[] args) {

			Evento ev = getEventoById(2);
			System.out.println(ev.getTitolo());
			deleteEvento(ev);
//			refreshEvento(ev);
//			updateEvento(ev);
			
	}
	
	private static Evento insertEvento() {
		Evento evento = new Evento();
		evento.setTitolo("MotoGP-Mugello 2023");
		evento.setDataEvento(new Date());
		evento.setDescrizione("Gara di moto del motomondiale");
		evento.setTipoEvento(TipoEvento.PUBBLICO);
		evento.setNumMaxPartecipanti(200);
		
		EventoDAO eventoDao = new EventoDAO();
		eventoDao.save(evento);
		
		return evento;
	}
	
	private static Evento getEventoById(int id) {
		
		EventoDAO eventoDao = new EventoDAO();
		Evento e = eventoDao.getById(id);
		return e;
	}
	
	private static void refreshEvento(Evento evento) {
		EventoDAO eventoDao = new EventoDAO();
		eventoDao.refresh(evento);
	}
	
	private static void updateEvento(Evento evento) {
		evento.setDescrizione("Decima gara del motomondiale - Classe moto3, moto2 e motogp");
		EventoDAO eventoDao = new EventoDAO();
		eventoDao.update(evento);
	}
	
	private static void deleteEvento(Evento evento) {
		EventoDAO eventoDao = new EventoDAO();
		eventoDao.delete(evento);
	}

}
