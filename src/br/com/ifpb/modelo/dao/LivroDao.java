package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entidades.Livro;

public class LivroDao extends Dao<Livro> {

	private EntityManager em;

	public LivroDao() {
		em = Dao.getEntityManager();
	}

	@Override
	public void add(Livro livro) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(livro);
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
	public Livro read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			Livro l = em.find(Livro.class, codigo);
			em.getTransaction().commit();
			return l;
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
			Livro l = em.find(Livro.class, codigo);
			em.remove(l);
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
	public void upDate(Livro livro) throws Exception {
		try {
			em.getTransaction().begin();
			Livro l = em.find(Livro.class, livro.getId());
			l.setTitulo(livro.getTitulo());
			l.setAno(livro.getAno());
			l.setIsbn(livro.getIsbn());
			em.merge(l);
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
