package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entidades.Exemplar;
import br.com.ifpb.modelo.entidades.Telefone;
import br.com.ifpb.modelo.exception.EntityNullException;

public class ExemplarDao extends Dao<Exemplar> {

	private EntityManager em;
	
	public ExemplarDao() {
		em = getEM();
	}
	
	@Override
	public void add(Exemplar exemplar) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(exemplar);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new Exception();
		} finally {
			em.close();
		}			
	}

	@Override
	public Exemplar read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			em.find(Telefone.class, codigo);
			em.getTransaction().commit();
			return em.find(Exemplar.class, codigo);
		} catch (Exception e) {

		} finally {
			em.close();
		}
		return (Exemplar) em;
	}

	@Override
	public void remove(Exemplar exemplar) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Exemplar e = em.find(Exemplar.class, exemplar.getId());
			em.remove(e);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}		
	}

	@Override
	public void upDate(Exemplar exemplar, long codigo) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Exemplar e = em.find(Exemplar.class, codigo);
			e.setQuantidade(exemplar.getQuantidade());		
			em.merge(e);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}		
	}

}
