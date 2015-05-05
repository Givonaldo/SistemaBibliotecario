package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entidades.Autor;
import br.com.ifpb.modelo.exception.EntityNullException;

public class AutorDao extends Dao<Autor> {
	
	private EntityManager em;
	
	public AutorDao() {
		em = getEM();
	}
	
	@Override
	public void add(Autor autor) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(autor);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new Exception();
		} finally {
			em.close();
		}		
	}

	@Override
	public Autor read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			em.find(Autor.class, codigo);
			em.getTransaction().commit();
			return em.find(Autor.class, codigo);
		} catch (Exception e) {

		} finally {
			em.close();
		}
		return (Autor) em;
	}

	@Override
	public void remove(Autor autor) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Autor e = em.find(Autor.class, autor.getId());
			em.remove(e);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}		
	}

	@Override
	public void upDate(Autor autor, long codigo) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Autor a = em.find(Autor.class, codigo);
			a.setNome(autor.getNome());
			em.merge(a);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}		
	}

}
