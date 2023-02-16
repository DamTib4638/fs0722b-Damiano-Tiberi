package dao;

import javax.persistence.EntityManager;

import model.Evento;
import utils.JPAUtil;

public class EventoDAO {
	
	public void save(Evento evento) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(evento);
			em.getTransaction().commit();
			System.out.println("Evento aggiunto nel DB");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
	
	public Evento getById(int id) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			return em.find(Evento.class, id);
		} finally {
			em.close();
		}
	}
	
	public void delete(Evento e) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		try {
			em.getTransaction().begin();
//			em.remove(e);
			em.remove(em.contains(e) ? e : em.merge(e));
			em.getTransaction().commit();
			System.out.println("Evento eliminato nel DB");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
		
	}
	
	public void refresh(Evento e) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.refresh(e);
			em.getTransaction().commit();
			System.err.println("Evento refreshato dal DB");
		} finally {
			em.close();
		}
	}
	
	public void update(Evento e) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.merge(e);
			em.getTransaction().commit();
			System.err.println("Evento modificato nel DB");
		} finally {
			em.close();
		}
	}
	
	/* Come sopra, per tutti e 4 */

}
