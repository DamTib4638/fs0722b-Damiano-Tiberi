package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.ElementoDaLeggere;
import utils.JPAUtil;

public class ElementoDAO {
	
	static Logger log = LoggerFactory.getLogger(ElementoDAO.class);
	
	public void insert(ElementoDaLeggere el) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(em.contains(el) ? el : em.merge(el));
			em.getTransaction().commit();
			log.info("------------------------------------");
			log.info("Elemento aggiunto nel DB");
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
	
	public ElementoDaLeggere getByISBN(String isbn) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		Query q = em.createQuery("SELECT el FROM ElementoDaLeggere el WHERE el.codiceISBN = :isbn");
		q.setParameter("isbn", isbn);
		return (ElementoDaLeggere) q.getSingleResult();
	}
	
	public List<ElementoDaLeggere> getByAnno(Integer anno) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		Query q = em.createQuery("SELECT el FROM ElementoDaLeggere el WHERE el.annoPubblicazione = :anno");
		q.setParameter("anno", anno);
		return q.getResultList();
	}
	
	public List<ElementoDaLeggere> getByAutore(String autore) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		Query q = em.createQuery("SELECT el FROM ElementoDaLeggere el WHERE el.autore = :autore");
		q.setParameter("autore", autore);
		return q.getResultList();
	}
	
	public List<ElementoDaLeggere> getByTitolo(String titolo) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		Query q = em.createQuery("SELECT el FROM ElementoDaLeggere el WHERE el.titolo LIKE :titolo");
		q.setParameter("titolo", "%" + titolo + "%");
		return q.getResultList();
	}
	
	public List<ElementoDaLeggere> getListaElementiInPrestitoUtente(Integer numero) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		Query q = em.createQuery("SELECT el FROM ElementoDaLeggere el, Prestito pr, Utente ut "
				+ "WHERE ut.numeroTessera = :numero "
				+ "AND ut.idUtente = pr.utente "
				+ "AND el.idElemento = pr.elementoLetturaPrestato "
				+ "AND pr.dataRestituzioneEffettiva IS NULL");
		q.setParameter("numero", numero);
		return q.getResultList();
	}
	
	public ElementoDaLeggere getById(Integer id) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			return em.find(ElementoDaLeggere.class, id);
		} finally {
			em.close();
		}
	}
	
	public List<ElementoDaLeggere> getAll() {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		Query q = em.createNamedQuery("ElementoDaLeggere.findAll");
		return q.getResultList();
	}
	
	public void update(ElementoDaLeggere el) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(el);
			em.getTransaction().commit();
			log.info("------------------------------------");
			log.info("Elemento modificato nel DB");
			log.info("------------------------------------");
		} finally {
			em.close();
		}
	}
	
	public void delete(ElementoDaLeggere el) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
//			em.remove(el);
			em.remove(em.contains(el) ? el : em.merge(el));
			em.getTransaction().commit();
			log.info("------------------------------------");
			log.info("Elemento eliminato dal DB");
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
