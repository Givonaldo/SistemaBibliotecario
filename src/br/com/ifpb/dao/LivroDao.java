package br.com.ifpb.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ifpb.modelo.entities.Livro;
import br.com.ifpb.modelo.exception.EntityNullException;

public class LivroDao implements Dao<Livro>{

	private final EntityManagerFactory factory;
	private EntityManager em;

	public LivroDao() {
		factory = Persistence.createEntityManagerFactory("Teste");
	}

	public void add(Livro livro) throws Exception {
		em = factory.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(livro);
			em.getTransaction().commit();
		} catch (Exception e) {
			// throw new Exception();
		} finally {
			em.close();
			factory.close();
		}
	}

	public Livro read(long codigo) {
		em = factory.createEntityManager();
		try {
			em.getTransaction().begin();
			em.find(Livro.class, codigo);
			em.getTransaction().commit();
			return em.find(Livro.class, codigo);
		} catch (Exception e) {

		} finally {
			em.close();
			factory.close();
		}
		return (Livro) em;
	}

	public void remove(Livro livro) throws EntityNullException {
		em = factory.createEntityManager();
		try {
			em.getTransaction().begin();
			Livro l = em.find(Livro.class, livro.getId());
			em.remove(l);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
			factory.close();
		}
	}

	public void upDate(Livro livro, long codigo) throws EntityNullException {
		em = factory.createEntityManager();
		try {
			em.getTransaction().begin();
			Livro l = em.find(Livro.class, codigo);
			l.setTitulo(livro.getTitulo());
			l.setAno(livro.getAno());
			l.setIsbn(livro.getIsbn());
			em.merge(l);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
			factory.close();
		}
	}
}
