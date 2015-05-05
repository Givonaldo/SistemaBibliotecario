package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entidades.Editora;
import br.com.ifpb.modelo.exception.EntityNullException;

public class EditoraDao extends Dao<Editora> {
	
	private EntityManager em;
	
	public EditoraDao() {
		em = getEM();
	}
	
	@Override
	public void add(Editora editora) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(editora);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new Exception();
		} finally {
			em.close();
		}
	}

	@Override
	public Editora read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			em.find(Editora.class, codigo);
			em.getTransaction().commit();
			return em.find(Editora.class, codigo);
		} catch (Exception e) {

		} finally {
			em.close();
		}
		return (Editora) em;
	}

	@Override
	public void remove(Editora editora) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Editora e = em.find(Editora.class, editora.getId());
			em.remove(e);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}
	}

	@Override
	public void upDate(Editora editora, long codigo) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Editora e = em.find(Editora.class, codigo);
			e.setNome(editora.getNome());
			em.merge(e);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}
	}

}
