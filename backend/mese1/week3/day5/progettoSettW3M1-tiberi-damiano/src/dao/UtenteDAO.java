package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Utente;
import utils.JPAUtil;

public class UtenteDAO {
	
	static Logger log = LoggerFactory.getLogger(UtenteDAO.class);
	
	public void insert(Utente u) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(em.contains(u) ? u : em.merge(u));
			em.getTransaction().commit();
			log.info("------------------------------------");
			log.info("Utente aggiunto nel DB");
			log.info("------------------------------------");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			log.info("------------------------------------");
			log.error(ec.getMessage());
			log.info("------------------------------------");
		} finally {
			em.close();
		}
	}
	
	public Utente getById(Integer id) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			return em.find(Utente.class, id);
		} finally {
			em.close();
		}
	}
	
	public List<Utente> getAll() {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		Query q = em.createNamedQuery("Utente.findAll");
		return q.getResultList();
	}
	
	public void update(Utente u) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(u);
			em.getTransaction().commit();
			log.info("------------------------------------");
			log.info("Utente modificato nel DB");
			log.info("------------------------------------");
		} finally {
			em.close();
		}
	}
	
	public void delete(Utente u) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
//			em.remove(u);
			em.remove(em.contains(u) ? u : em.merge(u));
			em.getTransaction().commit();
			log.info("------------------------------------");
			log.info("Utente eliminato dal DB");
			log.info("------------------------------------");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			log.info("------------------------------------");
			log.error(ec.getMessage());
			log.info("------------------------------------");
		} finally {
			em.close();
		}
	}

}
