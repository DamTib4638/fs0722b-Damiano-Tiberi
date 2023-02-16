package dao;

import javax.persistence.EntityManager;

import model.Persona;
import utils.JPAUtil;

public class PersonaDAO {
	
	public void save(Persona p) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
			System.out.println("Persona aggiunta nel DB");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
	
	public Persona getById(int id) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			return em.find(Persona.class, id);
		} finally {
			em.close();
		}
	}
	
	public void delete(Persona p) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
//			em.remove(p);
			em.remove(em.contains(p) ? p : em.merge(p));
			em.getTransaction().commit();
			System.out.println("Persona eliminata nel DB");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
	
	public void refresh(Persona p) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
//			em.refresh(p);
			em.refresh(em.contains(p) ? p : em.merge(p));
			em.getTransaction().commit();
			System.err.println("Persona refreshata dal DB");
		} finally {
			em.close();
		}
	}
	
	public void update(Persona p) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(p);
			em.getTransaction().commit();
			System.err.println("Persona modificata nel DB");
		} finally {
			em.close();
		}
	}

}
