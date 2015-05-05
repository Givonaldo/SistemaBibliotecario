package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entities.Telefone;
import br.com.ifpb.modelo.exception.EntityNullException;

public class TelefoneDao extends Dao<Telefone> {
	
	private EntityManager em;
	
	public TelefoneDao() {
		em = getEM();
	}
	
	@Override
	public void add(Telefone telefone) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(telefone);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new Exception();
		} finally {
			em.close();
		}		
	}

	@Override
	public Telefone read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			em.find(Telefone.class, codigo);
			em.getTransaction().commit();
			return em.find(Telefone.class, codigo);
		} catch (Exception e) {

		} finally {
			em.close();
		}
		return (Telefone) em;
	}

	@Override
	public void remove(Telefone telefone) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Telefone t = em.find(Telefone.class, telefone.getId());
			em.remove(t);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}		
	}

	@Override
	public void upDate(Telefone telefone, long codigo) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Telefone t = em.find(Telefone.class, codigo);
			t.setTelefone(telefone.getTelefone());			
			em.merge(t);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}			
	}

}
