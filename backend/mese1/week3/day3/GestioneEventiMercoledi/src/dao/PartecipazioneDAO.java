package dao;

import javax.persistence.EntityManager;

import model.Partecipazione;
import utils.JPAUtil;

public class PartecipazioneDAO {
	
	public void save(Partecipazione p) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
			System.out.println("Partecipazione aggiunta nel DB");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
	
	public Partecipazione getById(int id) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			return em.find(Partecipazione.class, id);
		} finally {
			em.close();
		}
	}
	
	public void delete(Partecipazione p) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
//			em.remove(p);
			em.remove(em.contains(p) ? p : em.merge(p));
			em.getTransaction().commit();
			System.out.println("Partecipazione eliminata nel DB");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
	
	public void refresh(Partecipazione p) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
//			em.refresh(p);
			em.refresh(em.contains(p) ? p : em.merge(p));
			em.getTransaction().commit();
			System.err.println("Partecipazione refreshata dal DB");
		} finally {
			em.close();
		}
	}
	
	public void update(Partecipazione p) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(p);
			em.getTransaction().commit();
			System.err.println("Partecipazione modificata nel DB");
		} finally {
			em.close();
		}
	}

}
