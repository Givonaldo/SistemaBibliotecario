package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entidades.per_class.Pessoa_Per_Class;

public class PerClassDao extends Dao<Pessoa_Per_Class> {

	private EntityManager em;

	public PerClassDao() {
		this.em = Dao.getEntityManager();
	}

	@Override
	public void add(Pessoa_Per_Class pessoa) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(pessoa);
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
	public void remove(long cogido) throws Exception {
		try {
			em.getTransaction().begin();
			Pessoa_Per_Class p = em.find(Pessoa_Per_Class.class, cogido);
			em.remove(p);
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
	public Pessoa_Per_Class read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			em.find(Pessoa_Per_Class.class, codigo);
			Pessoa_Per_Class p = em.find(Pessoa_Per_Class.class, codigo);
			em.getTransaction().commit();
			return p;
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
	public void upDate(Pessoa_Per_Class pessoa) throws Exception {
		try {
			em.getTransaction().begin();
			Pessoa_Per_Class pc = em.find(Pessoa_Per_Class.class,
					pessoa.getId());
			pc.setNome(pessoa.getNome());
			pc.setMatricula(pessoa.getMatricula());
			pc.setEndereco(pessoa.getEndereco());
			pc.setFone(pessoa.getFone());
			em.merge(pc);
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