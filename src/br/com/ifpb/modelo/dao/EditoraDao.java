package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entidades.Editora;

public class EditoraDao extends Dao<Editora> {

	private EntityManager em;

	public EditoraDao() {
		this.em = Dao.getEntityManager();
	}

	@Override
	public void add(Editora editora) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(editora);
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
	public Editora read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			Editora e = em.find(Editora.class, codigo);
			em.getTransaction().commit();
			return e;
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
			Editora e = em.find(Editora.class, codigo);
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
	public void upDate(Editora editora) throws Exception {
		try {
			em.getTransaction().begin();
			Editora e = em.find(Editora.class, editora.getId());
			e.setNome(editora.getNome());
			em.merge(e);
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
