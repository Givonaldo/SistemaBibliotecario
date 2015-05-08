package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entidades.Fornecedor;

public class FornecedorDao extends Dao<Fornecedor> {

	private EntityManager em;

	public FornecedorDao() {
		em = Dao.getEntityManager();
	}

	@Override
	public void add(Fornecedor fornecedor) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(fornecedor);
			em.getTransaction().commit();
		} catch (Exception e) {
			if(em.isOpen()){
				em.getTransaction().rollback();	
			}			
			throw new Exception();
		} finally {
			if(em.isOpen()){
				em.close();	
			}
		}		
	}

	@Override
	public Fornecedor read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			Fornecedor f = em.find(Fornecedor.class, codigo);
			em.getTransaction().commit();
			return f;
		} catch (Exception e) {
			if(em.isOpen()){
				em.getTransaction().rollback();	
			}			
			throw new Exception();
		} finally {
			if(em.isOpen()){
				em.close();	
			}
		}	
	}

	@Override
	public void remove(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			Fornecedor f = em.find(Fornecedor.class, codigo);
			em.remove(f);
			em.getTransaction().commit();
		} catch (Exception e) {
			if(em.isOpen()){
				em.getTransaction().rollback();	
			}			
			throw new Exception();
		} finally {
			if(em.isOpen()){
				em.close();	
			}
		}		
	}

	@Override
	public void upDate(Fornecedor fornecedor) throws Exception {
		try {
			em.getTransaction().begin();
			Fornecedor f = em.find(Fornecedor.class, fornecedor.getId());
			f.setNome(fornecedor.getNome());
			em.merge(f);
			em.getTransaction().commit();
		} catch (Exception e) {
			if(em.isOpen()){
				em.getTransaction().rollback();	
			}			
			throw new Exception();
		} finally {
			if(em.isOpen()){
				em.close();	
			}
		}
	}

}
