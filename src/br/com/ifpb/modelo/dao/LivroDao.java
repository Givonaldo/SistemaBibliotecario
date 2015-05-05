package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entidades.Livro;
import br.com.ifpb.modelo.exception.EntityNullException;

public class LivroDao extends Dao<Livro>{
	
	private EntityManager em;
	
	public LivroDao() {
		em = getEM();
	}
	
	@Override
	public void add(Livro livro) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(livro);
			em.getTransaction().commit();
		} catch (Exception e) {
			// throw new Exception();
		} finally {
			em.close();
		}
	}

	@Override
	public Livro read(long codigo) {
		try {
			em.getTransaction().begin();
			em.find(Livro.class, codigo);
			em.getTransaction().commit();
			return em.find(Livro.class, codigo);
		} catch (Exception e) {

		} finally {
			em.close();
		}
		return (Livro) em;
	}
	
	@Override
	public void remove(Livro livro) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Livro l = em.find(Livro.class, livro.getId());
			em.remove(l);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}
	}
	
	@Override
	public void upDate(Livro livro, long codigo) throws EntityNullException {
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
		}
	}
}
