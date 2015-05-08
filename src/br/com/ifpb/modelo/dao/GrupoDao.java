package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entidades.Grupo;

public class GrupoDao extends Dao<Grupo> {

	private EntityManager em;

	public GrupoDao() {
		em = Dao.getEntityManager();
	}

	@Override
	public void add(Grupo grupo) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(grupo);
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
	public Grupo read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			Grupo g = em.find(Grupo.class, codigo);
			em.getTransaction().commit();
			return g;
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
			Grupo g = em.find(Grupo.class, codigo);
			em.remove(g);
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
	public void upDate(Grupo grupo) throws Exception {
		try {
			em.getTransaction().begin();
			Grupo g = em.find(Grupo.class, grupo.getId());
			g.setNome(grupo.getNome());
			g.setPrivacidade(grupo.getPrivacidade());
			em.merge(g);
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
