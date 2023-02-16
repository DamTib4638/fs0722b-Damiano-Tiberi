package dao;

import javax.persistence.EntityManager;

import model.Luogo;
import utils.JPAUtil;

public class LuogoDAO {
	
	public void save(Luogo l) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(l);
			em.getTransaction().commit();
			System.out.println("Luogo aggiunto nel DB");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
	
	public Luogo getById(int id) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			return em.find(Luogo.class, id);
		} finally {
			em.close();
		}
	}
	
	public void delete(Luogo l) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
//			em.remove(l);
			em.remove(em.contains(l) ? l : em.merge(l));
			em.getTransaction().commit();
			System.out.println("Luogo eliminato nel DB");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
	
	public void refresh(Luogo l) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
//			em.refresh(l);
			em.refresh(em.contains(l) ? l : em.merge(l));
			em.getTransaction().commit();
			System.err.println("Luogo refreshato dal DB");
		} finally {
			em.close();
		}
	}
	
	public void update(Luogo l) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(l);
			em.getTransaction().commit();
			System.err.println("Luogo modificato nel DB");
		} finally {
			em.close();
		}
	}

}
