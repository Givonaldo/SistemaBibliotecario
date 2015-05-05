package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entities.Disciplina;
import br.com.ifpb.modelo.exception.EntityNullException;

public class DisciplinaDao extends Dao<Disciplina> {

	private EntityManager em;
	
	public DisciplinaDao() {
		em = getEM();
	}
	
	@Override
	public void add(Disciplina disciplina) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(disciplina);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new Exception();
		} finally {
			em.close();
		}				
	}

	@Override
	public Disciplina read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			em.find(Disciplina.class, codigo);
			em.getTransaction().commit();
			return em.find(Disciplina.class, codigo);
		} catch (Exception e) {

		} finally {
			em.close();
		}
		return (Disciplina) em;
	}

	@Override
	public void remove(Disciplina disciplina) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Disciplina d = em.find(Disciplina.class, disciplina.getId());
			em.remove(d);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}			
	}

	@Override
	public void upDate(Disciplina disciplina, long codigo) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Disciplina d = em.find(Disciplina.class, codigo);
			d.setNome(disciplina.getNome());
			em.merge(d);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}				
	}

}
