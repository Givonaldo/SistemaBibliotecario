package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;

import br.com.ifpb.modelo.entities.Cliente;
import br.com.ifpb.modelo.exception.EntityNullException;

public class ClienteDao extends Dao<Cliente> {

	private EntityManager em;
	
	public ClienteDao() {
		em = getEM();
	}
	
	@Override
	public void add(Cliente cliente) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new Exception();
		} finally {
			em.close();
		}		
	}

	@Override
	public Cliente read(long codigo) throws Exception {
		try {
			em.getTransaction().begin();
			em.find(Cliente.class, codigo);
			em.getTransaction().commit();
			return em.find(Cliente.class, codigo);
		} catch (Exception e) {

		} finally {
			em.close();			
		}
		return (Cliente) em;
	}

	@Override
	public void remove(Cliente cliente) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Cliente c = em.find(Cliente.class, cliente.getId());
			em.remove(c);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}		
	}

	@Override
	public void upDate(Cliente cliente, long codigo) throws EntityNullException {
		try {
			em.getTransaction().begin();
			Cliente c = em.find(Cliente.class, codigo);
			c.setNome(cliente.getNome());
			c.setCpf(cliente.getCpf());
			c.setDataNascimento(cliente.getDataNascimento());
			c.seteMail(cliente.geteMail());
			c.setTelefones(cliente.getTelefones());
			em.merge(c);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new EntityNullException();
		} finally {
			em.close();
		}		
	}

}
