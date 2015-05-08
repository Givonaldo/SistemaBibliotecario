package br.com.ifpb.modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class Dao<T> {
	
	private static final String PERSISTENCE_UNIT = "Teste";
	private static EntityManagerFactory factory;
	
	public Dao(){
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

	public abstract void add(T obj) throws Exception;

	public abstract void remove(long codigo) throws Exception;
	
	public abstract T read(long codigo) throws Exception;
	
	public abstract void upDate(T obj) throws Exception;

}
