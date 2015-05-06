package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entidades.Grupo;
import br.com.ifpb.modelo.exception.EntityNullException;

public class GrupoDao extends Dao<Grupo> {

	private EntityManager em;

	public GrupoDao() {
		em = getEM();
	}

	@Override
	public void add(Grupo grupo) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(grupo);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new Exception();
		} finally {
			em.close();
		}		
	}

	@Override
	public Grupo read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			em.find(Grupo.class, codigo);
			em.getTransaction().commit();
			return em.find(Grupo.class, codigo);
		} catch (Exception e) {
			
		} finally {
			em.close();
		}
		return (Grupo) em;
	}

	@Override
	public void remove(Grupo grupo) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Grupo g = em.find(Grupo.class, grupo.getId());
			em.remove(g);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}		
	}

	@Override
	public void upDate(Grupo grupo, long codigo) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Grupo g = em.find(Grupo.class, codigo);
			g.setNome(grupo.getNome());
			g.setPrivacidade(grupo.getPrivacidade());
			em.merge(g);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}	
	}

}
