package br.com.ifpb.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ifpb.modelo.entities.Editora;
import br.com.ifpb.modelo.exception.EntityNullException;

public class EditoraDao implements Dao<Editora> {

	private final EntityManagerFactory factory;
	private EntityManager em;

	public EditoraDao() {
		factory = Persistence.createEntityManagerFactory("Teste");
	}

	@Override
	public void add(Editora editora) throws Exception {
		em = factory.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(editora);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new Exception();
		} finally {
			em.close();
			factory.close();
		}
	}

	@Override
	public Editora read(long codigo) throws Exception {
		em = factory.createEntityManager();
		try {
			em.getTransaction().begin();
			em.find(Editora.class, codigo);
			em.getTransaction().commit();
			return em.find(Editora.class, codigo);
		} catch (Exception e) {

		} finally {
			em.close();
			factory.close();
		}
		return (Editora) em;
	}

	@Override
	public void remove(Editora editora) throws EntityNullException {
		em = factory.createEntityManager();
		try {
			em.getTransaction().begin();
			Editora e = em.find(Editora.class, editora.getId());
			em.remove(e);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
			factory.close();
		}
	}

	@Override
	public void upDate(Editora editora, long codigo) throws EntityNullException {
		em = factory.createEntityManager();
		try {
			em.getTransaction().begin();
			Editora e = em.find(Editora.class, codigo);
			e.setNome(editora.getNome());
			em.merge(e);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
			factory.close();
		}
	}

}
