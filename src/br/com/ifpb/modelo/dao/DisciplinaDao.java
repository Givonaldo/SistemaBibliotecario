package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entidades.Disciplina;

public class DisciplinaDao extends Dao<Disciplina> {

	private EntityManager em;
	
	public DisciplinaDao() {
		this.em = Dao.getEntityManager();
	}
	
	@Override
	public void add(Disciplina disciplina) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(disciplina);
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
	public Disciplina read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			Disciplina d = em.find(Disciplina.class, codigo);
			em.getTransaction().commit();
			return d;
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
			Disciplina d = em.find(Disciplina.class, codigo);
			em.remove(d);
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
	public void upDate(Disciplina disciplina) throws Exception {
		try {
			em.getTransaction().begin();
			Disciplina d = em.find(Disciplina.class, disciplina.getId());
			d.setNome(disciplina.getNome());
			em.merge(d);
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
