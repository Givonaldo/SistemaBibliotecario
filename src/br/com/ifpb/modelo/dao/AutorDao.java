package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entidades.Autor;

public class AutorDao extends Dao<Autor> {

	private EntityManager em;

	public AutorDao() {
		this.em = Dao.getEntityManager();
	}

	@Override
	public void add(Autor autor) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(autor);
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.isOpen()) {
				em.getTransaction().rollback();
			}
			throw new Exception();
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
	}

	@Override
	public Autor read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			Autor a = em.find(Autor.class, codigo);
			em.getTransaction().commit();
			return a;
		} catch (Exception e) {
			if (em.isOpen()) {
				em.getTransaction().rollback();
			}
			throw new Exception();
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
	}

	@Override
	public void remove(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			Autor e = em.find(Autor.class, codigo);
			em.remove(e);
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.isOpen()) {
				em.getTransaction().rollback();
			}
			throw new Exception();
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
	}

	@Override
	public void upDate(Autor autor) throws Exception {
		try {
			em.getTransaction().begin();
			Autor a = em.find(Autor.class, autor.getId());
			a.setNome(autor.getNome());
			em.merge(a);
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.isOpen()) {
				em.getTransaction().rollback();
			}
			throw new Exception();
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
	}

}
