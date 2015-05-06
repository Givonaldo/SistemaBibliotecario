package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entidades.Fornecedor;
import br.com.ifpb.modelo.exception.EntityNullException;

public class FornecedorDao extends Dao<Fornecedor> {

	private EntityManager em;

	public FornecedorDao() {
		em = getEM();
	}

	@Override
	public void add(Fornecedor fornecedor) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(fornecedor);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new Exception();
		} finally {
			em.close();
		}	
	}

	@Override
	public Fornecedor read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			em.find(Fornecedor.class, codigo);
			em.getTransaction().commit();
			return em.find(Fornecedor.class, codigo);
		} catch (Exception e) {

		} finally {
			em.close();
		}
		return (Fornecedor) em;
	}

	@Override
	public void remove(Fornecedor fornecedor) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Fornecedor f = em.find(Fornecedor.class, fornecedor.getId());
			em.remove(f);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}		
	}

	@Override
	public void upDate(Fornecedor fornecedor, long codigo) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Fornecedor f = em.find(Fornecedor.class, codigo);
			f.setNome(fornecedor.getNome());
			em.merge(f);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}		

	}

}
