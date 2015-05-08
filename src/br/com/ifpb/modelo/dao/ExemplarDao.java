package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entidades.Exemplar;

public class ExemplarDao extends Dao<Exemplar> {

	private EntityManager em;

	public ExemplarDao() {
		em = Dao.getEntityManager();
	}

	@Override
	public void add(Exemplar exemplar) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(exemplar);
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
	public Exemplar read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			Exemplar e = em.find(Exemplar.class, codigo);
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
			Exemplar e = em.find(Exemplar.class, codigo);
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
	public void upDate(Exemplar exemplar) throws Exception {
		try {
			em.getTransaction().begin();
			Exemplar e = em.find(Exemplar.class, exemplar.getId());
			e.setQuantidade(exemplar.getQuantidade());
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
