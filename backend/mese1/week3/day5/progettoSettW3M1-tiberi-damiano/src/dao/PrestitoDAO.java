package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Prestito;
import utils.JPAUtil;

public class PrestitoDAO {
	
	static Logger log = LoggerFactory.getLogger(PrestitoDAO.class);
	
	public void insert(Prestito p) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(em.contains(p) ? p : em.merge(p));
			em.getTransaction().commit();
			log.info("------------------------------------");
			log.info("Prestito aggiunto nel DB");
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
	
	public Prestito getById(Integer id) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			return em.find(Prestito.class, id);
		} finally {
			em.close();
		}
	}
	
	public List<Prestito> getAll() {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		Query q = em.createNamedQuery("Prestito.findAll");
		return q.getResultList();
	}
	
	public void update(Prestito p) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(p);
			em.getTransaction().commit();
			log.info("------------------------------------");
			log.info("Restituzione effettiva del prestito registrata con successo nel DB");
			log.info("------------------------------------");
		} finally {
			em.close();
		}
	}
	
	public List<Prestito> getListaPrestitiScaduti() {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		Query q = em.createQuery("SELECT pr FROM Prestito pr "
				+ "WHERE pr.dataRestituzioneEffettiva IS NULL AND pr.dataRestituzionePrevista < NOW()");
		return q.getResultList();
	}

}
