package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ifpb.modelo.exception.EntityNullException;

public abstract class Dao<T> {
	
	protected static EntityManagerFactory factory = Persistence.createEntityManagerFactory("Teste");
	
	public static EntityManager getEM(){
		return factory.createEntityManager();
	}
	
	public abstract void add(T obj) throws Exception;
	
	public abstract T read(long codigo) throws Exception;
	
	public abstract void remove(T obj) throws EntityNullException;
	
	public abstract void upDate(T obj, long codigo) throws EntityNullException;

}
